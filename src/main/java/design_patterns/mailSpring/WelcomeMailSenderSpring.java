package design_patterns.mailSpring;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMailSenderSpring implements MailSenderSpring {
    @Override
    public void sendMail(MailInfoSpring mailInfoSpring) {
        System.out.println("WELCOME was sent " + mailInfoSpring);
    }

    @Override
    public int myCode() {
        return 1;
    }
}
