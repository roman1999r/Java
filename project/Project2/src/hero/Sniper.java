package hero;

import global.bosses.Bosses;
import global.monsters.Monsters;

public class Sniper extends Hero {
    public Sniper() {
    }

    public Sniper(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    @Override
    public Integer useSkill(Monsters monsters) {
        Integer dm = super.getPower();
        dm += 12;
        System.out.println("Здібність 'Head Shot' використана");
        return dm;
    }
}
