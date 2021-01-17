package com.company;

import java.util.Scanner;

public class Savings {

    public static void main(String[] args) {
        // Напишете програма, която да изчисли максимално  колко процента от дохода си може да спестява Деси, за да посети
        // фестивала. Всеки месец, Деси има нужда от определена сума пари, за да покрие личните си разходи за месеца,
        // а 30% от дохода си ще запази за непредвидени разходи.

        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double neededMoney = Double.parseDouble(scanner.nextLine());

        double unexpectedCosts = income * 0.3;

        double monthlySavings = income - (neededMoney + unexpectedCosts);
        double sum = months * monthlySavings;
        double maxPercent = monthlySavings / income * 100;

        System.out.printf("She can save %.2f%%%n", maxPercent);
        System.out.printf("%.2f", sum);

    }
}
