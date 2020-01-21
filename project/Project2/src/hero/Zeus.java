package hero;

import global.bosses.Bosses;
import global.monsters.Monsters;

public class Zeus extends Hero {
    public Zeus() {
    }

    public Zeus(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    @Override
    public Integer useSkill(Monsters monsters) {
        Integer dm = super.getPower();
        dm += 15;
        System.out.println("Здібність 'ThunderGod's Wrath' використана");
        return dm;
    }
}
