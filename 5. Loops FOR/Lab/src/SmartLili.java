import java.util.Scanner;

    // Лили вече е на N години. За всеки свой рожден ден тя получава подарък. За нечетните рождени дни (1, 3, 5...n)
    // получава играчки, а за всеки четен (2, 4, 6...n) получава пари. За втория рожден ден получава 10.00 лв, като
    // сумата се увеличава с 10.00 лв., за всеки следващ четен рожден ден (2 -> 10, 4 -> 20, 6 -> 30...и т.н.). През
    // годините Лили тайно е спестявала парите. Братът на Лили, в годините, които тя получава пари, взима по 1.00 лев
    // от тях. Лили продала играчките получени през годините, всяка за P лева и добавила сумата към спестените пари.
    // С парите искала да си купи пералня за X лева. Напишете програма, която да пресмята, колко пари е събрала и дали
    // ѝ стигат да си купи пералня.

public class SmartLili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceOfWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceOneToy = Integer.parseInt(scanner.nextLine());


        double giftMoney = 10.00;
        double toysCount = 0.00;
        double money = 0.00;
        double finalSumCollected = 0.00;

        for (int currAge = 1; currAge <= age; currAge++) {
            if (currAge % 2 == 0) {  // even years
                money += giftMoney - 1;
                giftMoney += 10;

            } else toysCount++;
        }

        finalSumCollected = money + (toysCount * priceOneToy);

        if (finalSumCollected >= priceOfWashingMachine) {
            double n = finalSumCollected - priceOfWashingMachine;
            System.out.printf("Yes! %.2f", n);
        } else {
            double m = priceOfWashingMachine - finalSumCollected;
            System.out.printf("No! %.2f", m);
        }
    }
}
