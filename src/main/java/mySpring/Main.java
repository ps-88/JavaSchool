package mySpring;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Class<?>, Class<?>> map = Map.of(
                Speaker.class, ConsoleSpeaker.class,
                Cleaner.class, CleanerImpl.class
        );

        ObjectFactory.getInstance().setConfig(new JavaConfig(map,"mySpring"));

        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class );
        iRobot.cleanRoom();
    }
}
