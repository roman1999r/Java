package global.monsters;
import hero.Hero;

public class Lion extends Monsters {
    public Lion() {
    }

    public Lion(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    @Override
    public Integer useAttackSpell(Hero hero) {
        Integer dmg = super.getPower();
        dmg *= 2;
        System.out.println("Здібність 'Magic Finger' використана. ");
        return dmg;
    }
}
