package realSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import realSpring.quoters.QuoterConfig;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(QuoterConfig.class);

    }
}
