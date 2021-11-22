package com.company;

    public class Hero {
        private int health;
        private int damage;
        private String aby;

        public Hero(int health, int damage, String aby) {
            this.health = health;
            this.damage = damage;
            this.aby = aby;
        }

        public Hero(int health, int damage) {
            this.health = health;
            this.damage = damage;
        }

        public int getHealth() {
            return health;
        }

        public int getDamage() {
            return damage;
        }

        public String getAby() {
            return aby;
        }
    }


