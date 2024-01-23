package rpg.models;

import rpg.utils.Constants;

public class Troll extends Monster implements Bleedable,Poisonable  {

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }
    @Override
    public double attack() {
        return getDamage() + bleed() + (getDamage() * poison());
    }

    @Override
    public double bleed() {
        return getDamage() * Constants.BLEED_PERCENTAGE;
    }

    @Override
    public double bleed(int level) {
        return level * getDamage() * Constants.BLEED_PERCENTAGE;
    }
}
