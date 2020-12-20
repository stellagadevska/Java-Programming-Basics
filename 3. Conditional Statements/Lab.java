import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {

//        System.out.printf("%.3f", area);

        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int numberOfPuzzles = Integer.parseInt(scanner.nextLine());   //Пъзел - 2.60 лв.
        int numberOfDolls = Integer.parseInt(scanner.nextLine());     //Говореща кукла - 3 лв.
        int numberOfBears = Integer.parseInt(scanner.nextLine());     //Плюшено мече - 4.10 лв.
        int numberOfMinions = Integer.parseInt(scanner.nextLine());   //Миньон - 8.20 лв.
        int numberOfTrucks = Integer.parseInt(scanner.nextLine());    //Камионче - 2 лв.

        double profit = numberOfPuzzles*2.60 + numberOfDolls*3 + numberOfBears*4.10 + numberOfMinions*8.20 + numberOfTrucks*2;
        int numberOfOrders = numberOfPuzzles + numberOfDolls + numberOfBears + numberOfMinions + numberOfTrucks;

        if (numberOfOrders >= 50) {
            profit = profit - profit*0.25;
        }

        profit = profit - profit*0.10;

        if (profit >= vacationPrice) {
            double difference = profit-vacationPrice;
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            double difference = vacationPrice - profit;
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }

    }
}
