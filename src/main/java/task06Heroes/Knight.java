package task06Heroes;

import lombok.AccessLevel;
import lombok.Setter;

public class Knight extends Hero {

    public Knight(String name) {
        super(name, RandomUtil.getIntBetween(5,15), RandomUtil.getIntBetween(5,15));
    }

    @Setter(AccessLevel.PACKAGE)
    private Weapon weapon = new Sword();

    @Override
    public KickResult kick(Hero hero) {

        return null;
    }
}
