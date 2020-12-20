package com.company;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        char operat = scanner.next().charAt(0);

        if (operat == '+') {
            int sum = n1 + n2;
            if(sum % 2 == 0) {
                System.out.println(n1 + " " + operat + " " + n2 + " = " + sum + " - even");
            } else {
                System.out.println(n1 + " " + operat + " " + n2 + " = " + sum + " - odd");
            }
        } else if (operat == '-') {
            int sum = n1 - n2;
            if(sum % 2 == 0) {
                System.out.println(n1 + " " + operat + " " + n2 + " = " + sum + " -  even");
            } else {
                System.out.println(n1 + " " + operat + " " + n2 + " = " + sum + " - odd");
            }
        } else if (operat == '*') {
            int sum = n1 * n2;
            if(sum % 2 == 0) {
                System.out.println(n1 + " " + operat + " " + n2 + " = " + sum + " - even");
            } else {
                System.out.println(n1 + " " + operat + " " + n2 + " = " + sum + " - odd");
            }
        } else if (operat == '/') {
            if(n2 == 0) {
                System.out.println("Cannot divide " + n1 + " by zero");
            } else {
                double div = n1 * 1.0 / n2;
                System.out.print(n1 + " / " + n2 + " = ");
                System.out.printf("%.2f", div);
            }
        } else if (operat == '%') {
            if(n2 == 0) {
                System.out.println("Cannot divide " + n1 + " by zero");
            } else {
                double leftover = n1 % n2;
                System.out.println(n1 + " % " + n2 + " = " + leftover);
            }
        }
    }
}
