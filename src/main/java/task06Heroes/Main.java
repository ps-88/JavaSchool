package task06Heroes;

public class Main {

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        HeroFactory heroFactory = new HeroFactoryImpl();

        gameManager.fight(heroFactory.createNewHero(), heroFactory.createNewHero());
    }
}
