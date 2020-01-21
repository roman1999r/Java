package global.bosses;

import hero.Hero;

public class Pudge extends Bosses {
    public Pudge(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Pudge() {
    }

    @Override
    public Integer useAttackSpell(Hero hero) {
        Integer dm = super.getPower();
        dm += 10;
        System.out.println("Здібність 'Meat Hook' використана");
        return dm;
    }
}
