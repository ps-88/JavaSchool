package design_patterns.mail;

public class EmailCallbackSender implements MailSender {
    @Override
    public void sendMail(MailInfo mailInfo) {
        System.out.println("Don't call us we call you");
    }

    @Override
    public int myCode() {
        return 2;
    }
}
