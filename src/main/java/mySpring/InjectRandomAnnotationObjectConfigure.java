package mySpring;

import lombok.SneakyThrows;
import task06Heroes.RandomUtil;

import java.lang.reflect.Field;

public class InjectRandomAnnotationObjectConfigure implements ObjectConfigurer {

    @Override
    @SneakyThrows
    public void configure(Object t,  ApplicationContext context) {

        Class<?> implClass = t.getClass();

        Field[] fields = implClass.getDeclaredFields();
        for (Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int randomInt = RandomUtil.getIntBetween(annotation.min(), annotation.max());
                field.setAccessible(true);
                field.setInt(t,randomInt);
            }
        }
    }
}
