package design_patterns.mailSpring;

import lombok.SneakyThrows;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class DistributionServiceSpring {

    private Map<Integer, MailSenderSpring> mailSenderMap = new HashMap<>();

    @Autowired
    public DistributionServiceSpring(List<MailSenderSpring> list) {
        for (MailSenderSpring mailSenderSpring : list) {
            if (mailSenderMap.containsKey(mailSenderSpring.myCode())) {
                throw new IllegalStateException(mailSenderSpring.myCode() + "already exists");
            }
            mailSenderMap.put(mailSenderSpring.myCode(), mailSenderSpring);
        }

    }


    public void sendMail(MailInfoSpring mailInfoSpring) {

        MailSenderSpring sender = mailSenderMap.getOrDefault(mailInfoSpring.getMailType(), new DefaultMailSenderSpring());
        sender.sendMail(mailInfoSpring);


    }
}
