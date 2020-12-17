package design_patterns.mailSpring;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import task06Heroes.RandomUtil;

@Component
public class MailMockProducerSpring {
    @Autowired
    private DistributionServiceSpring distributionService;
    @Autowired
    private Faker faker;
    @Autowired
    private DataFactory factory  ;

    @Scheduled(fixedDelay = 1000)
    public void sendMailsForever() {

        int mailType = RandomUtil.getIntBetween(0, 2) + 1;
        MailInfoSpring mailInfoSpring = MailInfoSpring.builder()
                .email(factory.getEmailAddress())
                .mailType(mailType)
                .text(faker.chuckNorris().fact()).build();

        distributionService.sendMail(mailInfoSpring);

    }

}
