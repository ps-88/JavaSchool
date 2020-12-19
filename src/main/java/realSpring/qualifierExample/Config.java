package realSpring.qualifierExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@ComponentScan
@Configuration
@EnableScheduling
public class Config {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(Config.class);
    }
}
