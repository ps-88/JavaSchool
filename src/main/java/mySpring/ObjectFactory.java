package mySpring;


import lombok.Setter;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ObjectFactory {

    private ApplicationContext context;

    private List<ObjectConfigurer> objectConfigures = new ArrayList<>();

    private Reflections scanner;

    @SneakyThrows
     ObjectFactory(ApplicationContext context , Reflections scanner) {
        this.scanner = scanner;
        this.context = context;


        Set<Class<? extends ObjectConfigurer>> classes = scanner.getSubTypesOf(ObjectConfigurer.class);
        for (Class<? extends ObjectConfigurer> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                objectConfigures.add(aClass.getDeclaredConstructor().newInstance());
            }
        }
    }



    @SneakyThrows
    public <T> T createObject(Class<T> implClass) {


        T t = create(implClass);
        configure(t);

        return t;
    }

    private <T> void configure(T t) {
        objectConfigures.forEach(objectConfigure -> objectConfigure.configure(t,  context));
    }


    private <T> T create(Class<? extends T> implClass) throws InstantiationException, IllegalAccessException, java.lang.reflect.InvocationTargetException, NoSuchMethodException {
        return implClass.getDeclaredConstructor().newInstance();
    }


}
