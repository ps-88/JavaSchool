package task06Heroes;

public class GameManager {
    public void fight(Hero hero1, Hero hero2) {
        while (hero1.isAlive() && hero1.isAlive()) {
            kick(hero1, hero2);
            kick(hero2, hero1);
        }
    }

    private void kick(Hero hero1, Hero hero2) {
        System.out.println(hero1.getClass().getSimpleName() + "  " + hero1.getName() + " kick " + hero2.getName());
        System.out.println(hero1.kick(hero2));
    }
}
