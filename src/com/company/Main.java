package com.company;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Vuk";
        player.health = 20;
        player.weapon = "Axe";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        
    }
}
