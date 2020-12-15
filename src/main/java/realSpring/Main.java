package realSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import realSpring.quoters.Quoter;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        context.close();
    }
}
