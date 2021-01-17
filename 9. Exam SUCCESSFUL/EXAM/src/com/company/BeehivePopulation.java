package com.company;

import java.util.Scanner;

public class BeehivePopulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialPopulation = Integer.parseInt(scanner.nextLine());
        int years = Integer.parseInt(scanner.nextLine());

        int population = initialPopulation;

        for (int i = 1; i <= years ; i++) {
            int newbornBees = 0;
            newbornBees = population / 10 * 2;
            population += newbornBees;

            if ((i % 5) == 0) {
                int migratedBees = 0;
                migratedBees = population / 50 * 5;
                population -= migratedBees;
            }

            int diedBees = 0;
            diedBees = population / 20 * 2;
            population -= diedBees;
        }

        System.out.printf("Beehive population: %d", population);
    }
}
