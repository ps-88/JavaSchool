package design_patterns.mail;

public class DefaultMailSender implements MailSender {
    @Override
    public void sendMail(MailInfo mailInfo) {
        throw new UnsupportedOperationException(mailInfo.getMailType()+ "not supported yet");
    }

    @Override
    public int myCode() {
        return 0;
    }
}
