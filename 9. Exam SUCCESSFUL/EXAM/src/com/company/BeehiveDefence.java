package com.company;

import java.util.Scanner;

public class BeehiveDefence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBees = Integer.parseInt(scanner.nextLine());
        int health = Integer.parseInt(scanner.nextLine());
        int attack = Integer.parseInt(scanner.nextLine());

        while (health > 0) {
            // bear attack
            numberOfBees -= attack;
            if (numberOfBees < 100) {
                break;
            }
            health -= numberOfBees * 5;
        }

        if (health <= 0) {
            System.out.printf("Beehive won! Bees left %d.", numberOfBees);
        } else if (numberOfBees < 100) {
            if (numberOfBees < 0) {
                numberOfBees = 0;
            }
            System.out.printf("The bear stole the honey! Bees left %d.%n", numberOfBees);
        }

    }
}
