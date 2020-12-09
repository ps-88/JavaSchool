
package mySpring;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Class<?>, Class<?>> map = Map.of(
                Speaker.class, ConsoleSpeaker.class
        );

        JavaConfig config = new JavaConfig(map, "mySpring");
        ApplicationContext context = new ApplicationContext(config);

        IRobot iRobot = context.getBean(IRobot.class);
        iRobot.cleanRoom();
    }
}
