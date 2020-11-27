package task06Heroes;

public class Sword implements Weapon {
    @Override
    public KickResult kick(Hero attack, Hero defend) {
        int damage = RandomUtil.getIntBetween(0, attack.getPower());
        defend.decreaseHp(damage);
        return new KickResult("sword damage was " + damage);
    }
}
