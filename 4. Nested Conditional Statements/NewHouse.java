package com.company;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlower = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double price = 0.00;

        if (typeFlower.equals("Roses")) {
            if(num > 80) {
                price = num * 5 - 0.10 * num * 5;
            } else {
                price = num * 5;
            }
        } else if (typeFlower.equals("Dahlias")) {
            if(num > 90) {
                price = num * 3.80 - 0.15 * num * 3.80;
            } else {
                price = num * 3.80;
            }
        } else if (typeFlower.equals("Tulips")) {
            if(num > 80) {
                price = num * 2.80 - 0.15 * num * 2.80;
            } else {
                price = num * 2.80;
            }
        } else if (typeFlower.equals("Narcissus")) {
            if(num < 120) {
                price = num * 3 + 0.15 * num * 3;
            } else {
                price = num * 3;
            }
        } else if (typeFlower.equals("Gladiolus")){
            if(num < 80) {
                price = num * 2.50 + 0.20 * num * 2.50;
            } else {
                price = num * 2.50;
            }
        }

        if (budget >= price) {
            double diff = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, typeFlower, diff);
        } else {
            double diff = price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
