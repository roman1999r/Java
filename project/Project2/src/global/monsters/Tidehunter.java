package global.monsters;
import hero.Hero;

public class Tidehunter extends Monsters {

    public Tidehunter() {
    }

    public Tidehunter(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    @Override
    public Integer useAttackSpell(Hero hero) {
        Integer dmg = super.getPower();
        dmg *= 3;
        System.out.println("Здібність 'RAVAGE' використана. ");
        return dmg;

    }
}
