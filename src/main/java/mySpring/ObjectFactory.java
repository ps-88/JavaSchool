package mySpring;


import lombok.Setter;
import lombok.SneakyThrows;
import org.reflections.Reflections;
import task06Heroes.RandomUtil;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ObjectFactory {

    private static ObjectFactory objectFactory = new ObjectFactory();
    @Setter
    private Config config;

    private List<ObjectConfigure> objectConfigures = new ArrayList<>();

    private Reflections scanner = new Reflections("mySpring");

    @SneakyThrows
    private ObjectFactory() {

        Set<Class<? extends ObjectConfigure>> classes = scanner.getSubTypesOf(ObjectConfigure.class);
        for (Class<? extends ObjectConfigure> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                objectConfigures.add(aClass.getDeclaredConstructor().newInstance());
            }
        }
    }

    public static ObjectFactory getInstance() {
        return objectFactory;
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {

        Class<? extends T> implClass = resolveImpl(type);
        T t = create(implClass);
        configure(t);

        return t;
    }

    private <T> void configure(T t) {
        objectConfigures.forEach(objectConfigure -> objectConfigure.configure(t));
    }


    private <T> T create(Class<? extends T> implClass) throws InstantiationException, IllegalAccessException, java.lang.reflect.InvocationTargetException, NoSuchMethodException {
        return implClass.getDeclaredConstructor().newInstance();
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
