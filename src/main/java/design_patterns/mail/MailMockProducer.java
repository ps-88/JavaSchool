package design_patterns.mail;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;
import task06Heroes.RandomUtil;

public class MailMockProducer {
    private DistributionService distributionService = new DistributionService();
    private Faker faker = new Faker();
    private DataFactory factory = new DataFactory();

    @SneakyThrows
    public void sendMailsForever() {
        while (true) {
            int mailType = RandomUtil.getIntBetween(0, 2) + 1;
            MailInfo mailInfo = MailInfo.builder()
                    .email(factory.getEmailAddress())
                    .mailType(mailType)
                    .text(faker.chuckNorris().fact()).build();
            try {
                distributionService.sendMail(mailInfo);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Thread.sleep(1000);
        }
    }

}
