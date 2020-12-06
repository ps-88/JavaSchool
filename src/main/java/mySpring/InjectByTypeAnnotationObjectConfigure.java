package mySpring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeAnnotationObjectConfigure implements ObjectConfigurer {
    @SneakyThrows
    @Override
    public void configure(Object t ,ApplicationContext context) {
        Class<?> implClass = t.getClass();

        Field[] fields = implClass.getDeclaredFields();
        for (Field field : fields) {
            InjectByType annotation = field.getAnnotation(InjectByType.class);
            if (annotation != null) {
                Object value = context.getBean(field.getType());
                field.setAccessible(true);
                field.set(t,value);
            }
        }
    }


}
