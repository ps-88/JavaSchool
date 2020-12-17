package design_patterns.mailSpring;

import com.github.javafaker.Faker;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;
import org.springframework.scheduling.annotation.SchedulingConfiguration;

@ComponentScan
@Configuration
@PropertySource("classpath:mail.properties")
@Import(SchedulingConfiguration.class)
public class MailConf {

    @Bean
    public Faker faker() {
        return new Faker();
    }
    @Bean
    public DataFactory dataFactory() {
        return new DataFactory();
    }

  /*  @Bean
    public ScheduledAnnotationBeanPostProcessor scheduledAnnotationBeanPostProcessor() {
        return new ScheduledAnnotationBeanPostProcessor();
    }*/
}
