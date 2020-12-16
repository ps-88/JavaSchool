package design_patterns.mail;

public class WelcomeMailSender implements MailSender {
    @Override
    public void sendMail(MailInfo mailInfo) {
        System.out.println("WELCOME was sent " + mailInfo);
    }

    @Override
    public int myCode() {
        return 1;
    }
}
