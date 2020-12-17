package design_patterns.mailSpring;

import org.springframework.stereotype.Component;


public class DefaultMailSenderSpring implements MailSenderSpring {
    @Override
    public void sendMail(MailInfoSpring mailInfoSpring) {
        throw new UnsupportedOperationException(mailInfoSpring.getMailType()+ "not supported yet");
    }

    @Override
    public int myCode() {
        return 0;
    }
}
