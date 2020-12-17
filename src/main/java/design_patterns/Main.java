package design_patterns;

import design_patterns.mail.DistributionService;
import design_patterns.mail.MailMockProducer;
import design_patterns.mailSpring.MailConf;
import design_patterns.mailSpring.MailMockProducerSpring;
import lombok.SneakyThrows;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MailConf.class);
    }
}
