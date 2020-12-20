package com.company;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String daysAs = scanner.nextLine();
        String room = scanner.nextLine();
        String rating = scanner.nextLine();

        int days = Integer.parseInt(daysAs);

        int sleep = days - 1;
        double price = 0;

        if (room.equals("room for one person")) {
            price = sleep * 18;
        } else if (room.equals("apartment")) {
            if (days < 10) {
                price = (sleep * 25) - (sleep * 25)*0.30;
            } else if (days <= 15) {
                price = (sleep * 25) - (sleep * 25)*0.35;
            } else if (days > 15) {
                price = (sleep * 25) - (sleep * 25)*0.50;
            }
        } else if (room.equals("president apartment")) {
            if (days < 10) {
                price = (sleep * 35) - (sleep * 35)*0.10;
            } else if (days <= 15) {
                price = (sleep * 35) - (sleep * 35)*0.15;
            } else if (days > 15) {
                price = (sleep * 35)  - (sleep * 35)*0.20;
            }
        }

        if (rating.equals("positive")) {
            price = price + price*0.25;
        } else {
            price = price - price*0.10;
        }

        System.out.printf("%.2f", price);
    }
}
