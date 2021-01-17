package com.company;

import java.util.Scanner;

public class BakingCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfParticipants = Integer.parseInt(scanner.nextLine());

        int numberOfSweets = 0;
        double charitySum = 0.00;

        for (int i = 0; i < numberOfParticipants; i++) {
            String name = scanner.nextLine();

            int cookies = 0;
            int cakes = 0;
            int waffles = 0;

            String sweetsType = scanner.nextLine();
            while (!sweetsType.equals("Stop baking!")) {
                int countSweets = Integer.parseInt(scanner.nextLine());

                switch (sweetsType) {
                    case "cookies":
                        cookies += countSweets;
                        charitySum += 1.50 * countSweets;
                        break;
                    case "cakes":
                        cakes += countSweets;
                        charitySum += 7.80 * countSweets;
                        break;
                    case "waffles":
                        waffles += countSweets;
                        charitySum += 2.30 * countSweets;
                        break;
                }

                numberOfSweets += countSweets;
                sweetsType = scanner.nextLine();
            }

            System.out.printf("%s baked %d cookies, %d cakes and %d waffles.%n", name, cookies, cakes, waffles);
        }

        System.out.printf("All bakery sold: %d%n", numberOfSweets);
        System.out.printf("Total sum for charity: %.2f lv.", charitySum);

    }
}
