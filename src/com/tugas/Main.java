package com.tugas;

public class Main {

    public static void main(String[] args) {
        Rumus hero1 = new Rumus("Tanjiro",10,100);
        Input hero2 = new HeroStrength("Zenitsu", 20, 100);

        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);

        hero1.display();
        hero2.display();
    }
}
