import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());


        double priceDecor = budget * 0.10;
        double priceStatist = people * priceClothes;

        if (people > 150) {
            priceStatist = priceStatist - 0.10 * priceStatist;
        }

        double totalPrice = priceDecor + priceStatist;

        if (budget < totalPrice) {
            double diff = totalPrice - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            double diff = budget - totalPrice;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }
    }
}
