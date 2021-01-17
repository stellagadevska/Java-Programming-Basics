package com.company;

import java.util.Scanner;

public class HoneyWinterResorts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double honeyQuantityNeeded = Double.parseDouble(scanner.nextLine());

        double finalHoney = 0.00;

        String name = scanner.nextLine();
        while (!name.equals("Winter has come")) {
            double honeyLeft = 0.00;
            for (int i = 1; i <= 6; i++) {
                double honeyProduction = Double.parseDouble(scanner.nextLine());
                honeyLeft += honeyProduction;
            }

            if (honeyLeft < 0) {
                System.out.printf("%s was banished for gluttony%n", name);
            }

            finalHoney += honeyLeft;

            if (finalHoney >= honeyQuantityNeeded) {
                break;
            }

            name = scanner.nextLine();
        }

        if (finalHoney >= honeyQuantityNeeded) {
            System.out.printf("Well done! Honey surplus %.2f.%n", (finalHoney - honeyQuantityNeeded));
        } else {
            System.out.printf("Hard Winter! Honey needed %.2f.%n", (honeyQuantityNeeded - finalHoney));
        }
    }
}
