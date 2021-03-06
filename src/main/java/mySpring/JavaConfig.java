package mySpring;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
@Getter
public class JavaConfig implements Config{

    private final Map<Class<?>, Class<?>> ifc2Implclass;

    private final String packageToScan;


    @Override
    public <T> Class<? extends T> getImpl(Class<T> type) {
        return (Class<? extends T>) ifc2Implclass.get(type);
    }

}
