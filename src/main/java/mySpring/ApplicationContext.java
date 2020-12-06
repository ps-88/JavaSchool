package mySpring;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class ApplicationContext {
    private final Config config;
    private ObjectFactory objectFactory;
    private Map<Class<?>, Object> cache = new HashMap<>();
    private Reflections scanner;


    public ApplicationContext(Config config) {
        this.config = config;
        scanner = new Reflections(config.getPackageToScan());
        objectFactory = new ObjectFactory(this,scanner);

    }

    public <T> T getBean(Class<T> type) {
        if (cache.containsKey(type)) {
            return (T) cache.get(type);
        }

        Class<? extends T> implClass = resolveImpl(type);

        return objectFactory.createObject(implClass);
    }

    private <T> Class<? extends T> resolveImpl(Class<T> type) {
        Class<? extends T> implClass;
        if (type.isInterface()) {
            implClass = config.getImpl(type);
            if (implClass == null) {
                Set<Class<? extends T>> classes = scanner.getSubTypesOf(type);
                if (classes.size() != 1) {
                    throw new IllegalStateException(type + " has 0 or more than 1 impl, update your config");
                }
                implClass = classes.iterator().next();
            }
        } else {
            implClass = type;
        }
        return implClass;
    }
}
