package global;


import global.monsters.Lion;
import global.monsters.Monsters;
import hero.Hero;
import hero.Invoker;
import hero.Sniper;
import hero.Zeus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    public void Menu(){
    }

    public Map level1(){
        Monsters Lion = new Monsters("Lion", 100, 11);
        Monsters Lifestrealer = new Monsters("Lifestrealer", 100, 11);
        Monsters Tidehunter = new Monsters("Tidehunter", 100, 11);
        Monsters Axe = new Monsters("Axe", 100, 11);
        Map<Integer,Monsters> monster1 = new HashMap<>();
        monster1.put(1,Lion);
        monster1.put(2,Lifestrealer);
        monster1.put(3,Tidehunter);
        return monster1;
    }

    public Map level2(){
        Monsters Lion = new Monsters("Lion", 120, 20);
        Monsters Lifestrealer = new Monsters("Lifestrealer", 110, 17);
        Monsters Tidehunter = new Monsters("Tidehunter", 115, 21);
        Monsters Pudge = new Monsters("Axe", 100, 11);
        Map<Integer,Monsters> monster2 = new HashMap<>();
        monster2.put(1,Lion);
        monster2.put(2,Lifestrealer);
        monster2.put(3,Tidehunter);
        return monster2;
    }

    public Map level3(){
        Monsters Lion = new Monsters("Lion", 150, 24);
        Monsters Lifestrealer = new Monsters("Lifestrealer", 145, 21);
        Monsters Tidehunter = new Monsters("Tidehunter", 130, 25);
        Monsters ShadwoFiend = new Monsters("Axe", 100, 11);
        Map<Integer,Monsters> monster3 = new HashMap<>();
        monster3.put(1,Lion);
        monster3.put(2,Lifestrealer);
        monster3.put(3,Tidehunter);
        return monster3;
    }

    public void input(Map<Integer,Monsters> level1, Map<Integer,Monsters> level2, Map<Integer, Monsters> level3 ){

        Location location1 = new Location("Location 1",level1);
        Location location2 = new Location("Location 2",level2);
        Location location3 = new Location("Location 3",level3);
        Scanner sc = new Scanner(System.in);

        System.out.println("____________________________");
        System.out.println("_____HELLO ON THE GAME_____");
        System.out.println("____________________________");
        System.out.println("Виберіть героя:\n1) Invoker \n2) Sniper \n3) Zeus");
        switch (sc.nextInt()){
            case 1 :
                System.out.println("____________________________");
                System.out.println("_______LEVEL 1 START________");
                System.out.println("____________________________");
                Invoker invoker = new Invoker(" Invoker",100,10);
                location1.dange(invoker);
                System.out.println("____________________________");
                System.out.println("_______LEVEL 2 START________");
                System.out.println("____________________________");
                location2.dange(invoker);
                System.out.println("____________________________");
                System.out.println("_______LEVEL 3 START________");
                System.out.println("____________________________");
                location3.dange(invoker);
            case 2 :
                System.out.println("____________________________");
                System.out.println("_______LEVEL 1 START________");
                System.out.println("____________________________");
                Sniper sniper = new Sniper("Sniper",185,24);
                location1.dange(sniper);
                System.out.println("____________________________");
                System.out.println("_______LEVEL 2 START________");
                System.out.println("____________________________");
                location2.dange(sniper);
                System.out.println("____________________________");
                System.out.println("_______LEVEL 3 START________");
                System.out.println("____________________________");
                location3.dange(sniper);
            case 3:
                System.out.println("____________________________");
                System.out.println("_______LEVEL 1 START________");
                System.out.println("____________________________");
                Zeus zeus = new Zeus("Zeus",170,26);
                location1.dange(zeus);
                System.out.println("____________________________");
                System.out.println("_______LEVEL 2 START________");
                System.out.println("____________________________");
                location2.dange(zeus);
                System.out.println("____________________________");
                System.out.println("_______LEVEL 3 START________");
                System.out.println("____________________________");
                location3.dange(zeus);
                System.out.println("________FINISH GAME________");

        }

    }

}
