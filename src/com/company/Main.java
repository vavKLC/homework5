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
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("legionCommander stat: " + "Health: " + createHeroes()[0].getHealth() + " " + "Damage: " + createHeroes()[0].getDamage()
                    + " " + "aby: " + createHeroes()[0].getAby());
            System.out.println("dazzle stat: " + "Health: " + createHeroes()[1].getHealth() + " " + "Damage: " + createHeroes()[1].getDamage());
            System.out.println("invoker stat: " + "Health: " + createHeroes()[2].getHealth() + " " + "Damage: " + createHeroes()[2].getDamage()
                    + " " + "aby: " + createHeroes()[2].getAby());
            break;
        }

    }

    public static Hero[] createHeroes(){
            Hero legionCommander = new Hero(900,50,"duel");
            Hero dazzle = new Hero(300,20);
            Hero invoker = new Hero(600,30,"invoke");
            Hero[] heroes  = {legionCommander,dazzle,invoker};
            return heroes;

    }
}


