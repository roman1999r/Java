package global.monsters;
import hero.Hero;

public class Lifestrealer extends Monsters {

    public Lifestrealer() {
    }

    public Lifestrealer(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    @Override
    public Integer useAttackSpell(Hero hero) {
        Integer hp = super.getHealth();
        Integer hpH = hero.getHealth();
        Integer skill = getPower() +15;
        hp = hp + skill;
        hpH = hpH - hp;
        hero.setHealth(hpH);
        System.out.println("Здібність 'Life Steal' використана. ");
        return hp;
    }
}
