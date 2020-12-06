package mySpring;

public class CleanerImpl implements Cleaner {

    @InjectRandomInt(max = 10,min = 3)
    private int repeat;
    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {

            System.out.println("clleeeaaan");

        }
    }
}
