package global.bosses;

import hero.Hero;

public class ShadowFiend extends Bosses {
    public ShadowFiend(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public ShadowFiend() {
    }

    @Override
    public Integer useAttackSpell(Hero hero) {
        Integer dm = super.getPower();
        dm += 15;
        System.out.println("Здібність 'Requiem Of Souls' використана");
        return dm;
    }
}
