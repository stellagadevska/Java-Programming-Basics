package com.company;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());

        double money = 0.00;

        switch (season) {
            case "Spring":
                money = 3000;
                break;
            case "Summer":
            case "Autumn":
                money = 4200;
                break;
            case "Winter":
                money = 2600;
                break;
        }

        if (num <= 6) {
            money = money - money * 0.10;
        } else if (num <= 11) {
            money = money - money * 0.15;
        } else if (num >= 12) {
            money = money - money * 0.25;
        }

        if(!season.equals("Autumn")) {
            if(num % 2 == 0) {
                money = money - money * 0.05;
            }
        }

        if (budget >= money) {
            double diff = budget - money;
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            double diff = money - budget;
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
