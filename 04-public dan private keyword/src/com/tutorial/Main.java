package com.tutorial;

class Player {
    // Data Member
    String name;// default, bisa dibaca dan ditulis diluar class
    public int exp; // public,bisa dibaca dan ditulis diluar class
    private int health; // private, hanya dibaca oleh class itu sendiri

    // konsturktor
    Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    void display() {
        System.out.println("name:" + name);
        System.out.println("exp" + exp);
        System.out.println("health" + health);
    }
}

public class Main {
    public static void main(String[] args) {
        Player hero = new Player("lingling", 90, 90);
        hero.display();
        hero.name = "dino";
        System.out.println(hero.name);
        hero.exp = 80;
        System.out.println(hero.exp);
    }
}