package design_patterns.mailSpring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class EmailCallbackSenderSpring implements MailSenderSpring {

    @Value("${callbackEmailMessages}")
    private String messages;

    @Override
    public void sendMail(MailInfoSpring mailInfoSpring) {
        System.out.println(messages);
    }

    @Override
    public int myCode() {
        return 2;
    }
}
