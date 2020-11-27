package task06Heroes;

public class Elf extends Hero {
    public Elf(String name) {
        super(name, 10, 10);
    }

    @Override
    public KickResult kick(Hero enemy) {
        if(this.getPower() > enemy.getPower()){
            enemy.setHp(0);
            return new KickResult("Was killed by " + this.getName());
        }else {
            enemy.decreasePower(1);
            return new KickResult(enemy.getName() + "you power now is" + enemy.getPower());
        }
        }
}
