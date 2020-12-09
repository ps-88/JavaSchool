package mySpring;


import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ObjectFactory {

    private ApplicationContext context;

    private List<ObjectConfigurer> objectConfigures = new ArrayList<>();
    private List<ProxyConfigurer> proxyConfigurers = new ArrayList<>();

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

        Set<Class<? extends ProxyConfigurer>> classes2 = scanner.getSubTypesOf(ProxyConfigurer.class);
        for (Class<? extends ProxyConfigurer> aClass : classes2) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                proxyConfigurers.add(aClass.getDeclaredConstructor().newInstance());
            }
        }
    }



    @SneakyThrows
    public <T> T createObject(Class<T> implClass) {


        T t = create(implClass);
        configure(t);

        t = configureProxy (implClass, t);

        return t;
    }

    private <T> T configureProxy(Class<T> implClass, T t) {
        for (ProxyConfigurer proxyConfigurer : proxyConfigurers) {
             t = (T) proxyConfigurer.wrapWithProxy(context, t, implClass);
        }
        return t;
    }

    private <T> void configure(T t) {
        objectConfigures.forEach(objectConfigure -> objectConfigure.configure(t,  context));
    }


    private <T> T create(Class<? extends T> implClass) throws InstantiationException, IllegalAccessException, java.lang.reflect.InvocationTargetException, NoSuchMethodException {
        return implClass.getDeclaredConstructor().newInstance();
    }


}
