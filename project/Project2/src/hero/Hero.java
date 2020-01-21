package hero;

import global.bosses.Bosses;
import global.monsters.Monsters;

import java.util.Random;
import java.util.Scanner;

public class Hero {

    private String name;
    private  Integer health;
    private Integer power;

    Scanner sc = new Scanner(System.in);

    public Hero() {
    }

    public Hero(String name, Integer health, Integer power) {
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

    public void fight(Monsters monsters){
        Random random = new Random();

        int randomInt = random.nextInt(100);

        Integer spellPower = 0;

        if (randomInt < 21){
            spellPower = monsters.getPower()*2;
        }
        Integer monsterPower = monsters.getPower();
        if (spellPower != null){
            monsterPower = spellPower;
        }
            this.health -= monsters.getPower();
        Integer monsterHeal = monsters.getHealth();
        monsterHeal -= this.power;
        monsters.setHealth(monsterHeal);
        }


    public void heal(Monsters monsters) {
        this.health += 20;
    }

    public Integer useSkill(Monsters monsters){
        return null;
    }

}
