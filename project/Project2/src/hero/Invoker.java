package hero;

import global.bosses.Bosses;
import global.monsters.Monsters;

public class Invoker extends Hero {
    public Invoker() {
    }

    public Invoker(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    @Override
    public Integer useSkill(Monsters monsters) {
        Integer dm = super.getPower();
        dm += 20;
        System.out.println("Здібність 'Sun Strike' використана");
             return dm;
    }
}
