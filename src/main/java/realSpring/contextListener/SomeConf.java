package realSpring.contextListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.EnableRetry;

@Configuration
@ComponentScan
@EnableRetry
public class SomeConf {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(SomeConf.class);
    }

}
