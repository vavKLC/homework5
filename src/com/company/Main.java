package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Boss  roshan = new Boss();
        roshan.setBossHealth(10000);
        roshan.setBossDamage(50);
        roshan.setBossDeffense("gold");
        System.out.println("Boss health: " + roshan.getBossHealth() + " " + "Damage: " + roshan.getBossDamage() + " " +
                "Deffense: " + roshan.getBossDeffense());
        createHeroes();
    }

    public static Hero[] createHeroes(){
            Hero legionCommander = new Hero(900,50,"duel");
            Hero dazzle = new Hero(300,20);
            Hero invoker = new Hero(600,30,"invoke");
            Hero[] heroes  = {legionCommander,dazzle,invoker};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("legionCommander stat: " + "Health: " + heroes[0].getHealth() + " " + "Damage: " + heroes[0].getDamage()
            + " " + "aby: " + heroes[0].getAby());
            System.out.println("dazzle stat: " + "Health: " + heroes[1].getHealth() + " " + "Damage: " + heroes[1].getDamage());
            System.out.println("invoker stat: " + "Health: " + heroes[2].getHealth() + " " + "Damage: " + heroes[2].getDamage()
                    + " " + "aby: " + heroes[2].getAby());
            break;
        }
        return heroes;
    }
}


