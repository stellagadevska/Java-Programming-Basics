package com.company;

import java.util.Scanner;

public class HoneyHarvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFlower = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double honey = 0.00;

        switch (season) {
            case "Summer":
                if (typeOfFlower.equals("Sunflower")) {
                    honey = numberOfFlowers * 8;
                } else if (typeOfFlower.equals("Daisy")) {
                    honey = numberOfFlowers * 8;
                } else if (typeOfFlower.equals("Lavender")) {
                    honey = numberOfFlowers * 8;
                } else if (typeOfFlower.equals("Mint")){
                    honey = numberOfFlowers * 12;
                }

                honey += honey * 0.10;
                break;
            case "Autumn":
                if (typeOfFlower.equals("Sunflower")) {
                    honey = numberOfFlowers * 12;
                } else if (typeOfFlower.equals("Daisy")) {
                    honey = numberOfFlowers * 6;
                } else if (typeOfFlower.equals("Lavender")) {
                    honey = numberOfFlowers * 6;
                } else if (typeOfFlower.equals("Mint")){
                    honey = numberOfFlowers * 6;
                }

                honey -= honey * 0.05;
                break;
            case "Spring":
                if (typeOfFlower.equals("Sunflower")) {
                    honey = numberOfFlowers * 10;
                } else if (typeOfFlower.equals("Daisy")) {
                    honey = numberOfFlowers * 12;
                    honey += honey * 0.10;
                } else if (typeOfFlower.equals("Lavender")) {
                    honey = numberOfFlowers * 12;
                } else if (typeOfFlower.equals("Mint")){
                    honey = numberOfFlowers * 10;
                    honey += honey * 0.10;
                }

                break;
        }

        System.out.printf("Total honey harvested: %.2f%n", honey);

    }
}
