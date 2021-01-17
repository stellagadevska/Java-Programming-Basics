package com.company;

import java.util.Scanner;

public class BeehiveRole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intellect = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        String gender = scanner.nextLine();

        if (intellect >= 80) {
            if (power >= 80 && gender.equals("female")) {
                System.out.println("Queen Bee");

            } else {
                System.out.println("Repairing Bee");
            }
        } else if (intellect >= 60) {
            System.out.println("Cleaning Bee");
        } else {
            if (power >= 80 && gender.equals("male")) {
                System.out.println("Drone Bee");
            } else if (power >= 60) {
                System.out.println("Guard Bee");
            } else {
                System.out.println("Worker Bee");
            }
        }
    }
}
