package task06Heroes;

public class Hobbit extends Hero{

    public Hobbit(String name) {
        super(name, 0, 3);
    }


    @Override
    public KickResult kick(Hero hero) {
        toCry();
        return new KickResult("I don't kick!");
    }

    private void toCry() {
        System.out.println("cryyyyy");
    }


}
