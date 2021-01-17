package com.company;

import java.util.Scanner;

public class HoneyCombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bees = Integer.parseInt(scanner.nextLine());
        int flowers = Integer.parseInt(scanner.nextLine());

        // one bee - 0.21
        // one comb - 100

        double honey = bees * flowers * 0.21;
        int honeyCombs = (int) honey / 100;

        honey -= honeyCombs * 100;


        System.out.printf("%d honeycombs filled.%n", honeyCombs);
        System.out.printf("%.2f grams of honey left.", honey);
    }
}
