package task06Heroes;

import lombok.AccessLevel;
import lombok.Setter;

import static task06Heroes.RandomUtil.getIntBetween;

public class King extends Hero {

    public King(String name) {
        super(name, getIntBetween(2, 12), getIntBetween(2, 12));
    }

    @Setter(AccessLevel.PROTECTED)
    private Weapon weapon = new Sword();


    @Override
    public KickResult kick(Hero enemy) {
        return weapon.kick(this,enemy);
    }
}
