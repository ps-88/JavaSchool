package realSpring.quoters;

import mySpring.InjectRandomAnnotationObjectConfigure;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


@Component
public class InjectRandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {

    private InjectRandomAnnotationObjectConfigure configure = new InjectRandomAnnotationObjectConfigure();
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        configure.configure(bean,null);
        return bean;
    }
}
