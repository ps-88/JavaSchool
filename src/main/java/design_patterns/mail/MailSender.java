package design_patterns.mail;

public interface MailSender {
    void sendMail(MailInfo mailInfo);

    int myCode();
}
