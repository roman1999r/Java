package global.bosses;

import hero.Hero;

public class Bosses {
    private String name;
    private Integer health;
    private Integer power;

    public Bosses(String name, Integer health, Integer power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public Bosses() {
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
