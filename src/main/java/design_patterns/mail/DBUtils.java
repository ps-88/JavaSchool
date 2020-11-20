package design_patterns.mail;

import java.util.Random;

public class DBUtils {

    private static Random random = new Random();
    public static int getMailCode(){

        return random.nextInt(2) + 1;

    }
}
