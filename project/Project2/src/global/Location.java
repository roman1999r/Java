package global;

import global.monsters.Monsters;
import hero.Hero;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Location {

    private int step;

    private String name;

    private Map<Integer, Monsters> monsterMap = new HashMap<>();

    private Integer addToMonsterHP = 0;

    private Integer addToCharacterHP = 0;

    private Integer getAddToMonsterPower = 0;

    private Integer getAddToCharacterPower = 0;

    public Location(String name, Map<Integer, Monsters> monsterMap, Integer addToMonsterHP, Integer addToCharacterHP, Integer getAddToMonsterHP, Integer getAddToCharacterHP) {
        this.name = name;
        this.monsterMap = monsterMap;
        this.addToMonsterHP = addToMonsterHP;
        this.addToCharacterHP = addToCharacterHP;
        this.getAddToMonsterPower = getAddToMonsterHP;
        this.getAddToCharacterPower = getAddToCharacterHP;
    }

    public Location(String name, Map<Integer, Monsters> monsterMap) {
        this.name = name;
        this.monsterMap = monsterMap;
    }

    public Location() {
    }

    public void dange(Hero hero) {

        Scanner in = new Scanner(System.in);

        Set<Integer> integers = this.monsterMap.keySet();
        for ( Integer monster1 : integers) {

            Monsters monster = this.monsterMap.get(monster1);

            while (monster.getHealth() > 0 && hero.getHealth() > 0) {
                System.out.println("Press 1 for kick or press 2 for heal or 3 for use SKILL");
                step ++;
                switch (in.nextInt()) {

                    case 1:
                        hero.fight(monster);
                        break;
                    case 2:
                        hero.heal(monster);
                        break;
                    case 3:
                        if (step % 3 == 0) {
                            hero.useSkill(monster);
                            Integer attack = hero.useSkill(monster);
                            Integer monsterHeal = monster.getHealth();
                            monsterHeal -= attack;
                            monster.setHealth(monsterHeal);
                        } else {
                            System.out.println("RELOAD");
                            hero.fight(monster);
                        }
                        break;

                }
                System.out.println("Monster HP: " + monster.getHealth() + " Name " + monster.getName());
                System.out.println("Hero HP: " + hero.getHealth() + " Name" + hero.getName());


            }

        }


    }
}
