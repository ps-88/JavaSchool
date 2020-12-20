package realSpring.aopAdvanced;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import realSpring.aopAdvanced.services.ServiceA;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class MainConf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);
        context.getBean(ServiceA.class).doA();
    }

}
