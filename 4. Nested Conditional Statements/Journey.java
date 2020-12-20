package com.company;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = " ";
        String type = " ";
        double price = 0.00;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")){
                price = budget - budget*0.70;
            } else if (season.equals("winter")){
                price = budget - budget*0.30;
            }

        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")){
                price = budget - budget*0.60;
            } else if (season.equals("winter")){
                price = budget - budget*0.20;
            }

        } else if (budget > 1000) {
            destination = "Europe";
            price = budget - budget*0.10;
        }

        if (destination.equals("Europe")) {
            type = "Hotel";
        } else {
            if(season.equals("winter")) {
                type = "Hotel";
            } else {
                type = "Camp";
            }
        }
        System.out.println("Somewhere in " + destination);
        System.out.print(type + " - ");
        System.out.printf("%.2f", price);
    }
}
