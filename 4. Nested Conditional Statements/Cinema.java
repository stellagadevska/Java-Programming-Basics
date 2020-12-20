package com.company;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double income = 0.0;

        if (type.equals("Premiere")) {
            income = rows * columns * 12.00;
        } else if (type.equals("Normal")){
            income = rows * columns * 7.50;
        } else if (type.equals("Discount")){
            income = rows * columns * 5.00;
        }

        System.out.printf("%.2f", income);
    }
}
