package design_patterns.mail;

public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        return "Welcome new client";
    }
}
