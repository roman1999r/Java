package global.bosses;

import hero.Hero;

public class Axe extends Bosses {
    public Axe(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Axe() {
    }

    @Override
    public Integer useAttackSpell(Hero hero) {
        Integer dm = super.getPower();
        dm *=4;
        System.out.println("Здібність 'Culling Blade' використана");
        return dm;
    }
}
