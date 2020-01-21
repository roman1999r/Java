package global.monsters;
import hero.Hero;

public class Monsters {

    private String name;
    private Integer health;
    private Integer power;

    public Monsters() {
    }

    public Monsters(String name, Integer health, Integer power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer useAttackSpell(Hero hero){


        return null;
    }


}
