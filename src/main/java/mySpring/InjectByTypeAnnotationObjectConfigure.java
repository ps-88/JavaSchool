package mySpring;

import lombok.SneakyThrows;
import task06Heroes.RandomUtil;

import java.lang.reflect.Field;

public class InjectByTypeAnnotationObjectConfigure implements ObjectConfigure {
    @SneakyThrows
    @Override
    public void configure(Object t) {
        Class<?> implClass = t.getClass();

        Field[] fields = implClass.getDeclaredFields();
        for (Field field : fields) {
            InjectByType annotation = field.getAnnotation(InjectByType.class);
            if (annotation != null) {
                Object value = ObjectFactory.getInstance().createObject(field.getType());
                field.setAccessible(true);
                field.set(t,value);
            }
        }
    }
}
