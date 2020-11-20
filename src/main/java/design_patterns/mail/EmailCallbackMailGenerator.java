package design_patterns.mail;

public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {

        return "Don't call us";
    }
}
