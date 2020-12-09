package mySpring;

@Singleton
public class MySingleton {

    public static int counter;

    public MySingleton() {
counter++;
    }
}
