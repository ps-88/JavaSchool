package design_patterns;

import design_patterns.mail.DistributionService;
import lombok.SneakyThrows;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        DistributionService distributionService = new DistributionService();
        while(true){
        distributionService.sendMail();
        Thread.sleep(500);
        }

    }
}
