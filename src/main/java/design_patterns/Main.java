package design_patterns;

import design_patterns.mail.DistributionService;
import design_patterns.mail.MailMockProducer;
import lombok.SneakyThrows;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        new MailMockProducer().sendMailsForever();

    }
}
