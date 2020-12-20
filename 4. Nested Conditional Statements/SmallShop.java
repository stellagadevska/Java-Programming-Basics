package com.company;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double cost = 0.00;

        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                cost = quantity * 0.50;
            } else if (product.equals("water")) {
                cost = quantity * 0.80;
            } else if (product.equals("beer")) {
                cost = quantity * 1.20;
            } else if (product.equals("sweets")) {
                cost = quantity * 1.45;
            } else {
                cost = quantity * 1.60;
            }
        } else if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                cost = quantity * 0.40;
            } else if (product.equals("water")) {
                cost = quantity * 0.70;
            } else if (product.equals("beer")) {
                cost = quantity * 1.15;
            } else if (product.equals("sweets")) {
                cost = quantity * 1.30;
            } else {
                cost = quantity * 1.50;
            }
        } else {
            if (product.equals("coffee")) {
                cost = quantity * 0.45;
            } else if (product.equals("water")) {
                cost = quantity * 0.70;
            } else if (product.equals("beer")) {
                cost = quantity * 1.10;
            } else if (product.equals("sweets")) {
                cost = quantity * 1.35;
            } else {
                cost = quantity * 1.55;
            }
        }

        System.out.println(cost);

    }
}
