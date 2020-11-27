package task06Heroes;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public abstract class Hero {
    private final String name;
    private int power;
    private int hp;


    public Hero(String name, int power, int hp) {
        this.name = name;
        this.power = power;
        this.hp = hp;
    }

    public abstract KickResult kick(Hero enemy);

    public boolean isAlive() {
        return hp > 0;
    }

    public void decreaseHp(int delta){
        this.setHp(this.getHp() - delta);
    }

    public void decreasePower(int delta){
        this.setPower(this.getPower() - delta);
    }
}
