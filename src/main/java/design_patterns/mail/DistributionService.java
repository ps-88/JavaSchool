package design_patterns.mail;

import javassist.tools.reflect.Reflection;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DistributionService {

    private Map<Integer,MailSender> mailSenderMap = new HashMap<>();
    private int code;


    @SneakyThrows
    public DistributionService() {
        Reflections scanner = new Reflections("design_patterns.mail");
        Set<Class<? extends MailSender>> classes = scanner.getSubTypesOf(MailSender.class);
        for (Class<? extends MailSender> aClass : classes) {
            MailSender mailSender = aClass.getDeclaredConstructor().newInstance();
            if (mailSenderMap.containsKey(mailSender.myCode())) {
                throw new IllegalStateException(mailSender.myCode() + "already exists");
            }
            mailSenderMap.put(mailSender.myCode(), mailSender);
        }
    }



    public void sendMail(MailInfo mailInfo) {

        MailSender sender = mailSenderMap.getOrDefault(mailInfo.getMailType(), new DefaultMailSender());
        sender.sendMail(mailInfo);


    }
}
