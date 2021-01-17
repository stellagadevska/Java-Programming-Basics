import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        double sum = 0.00;

        int num = 1;
        while(num <= count) {
            double input = Double.parseDouble(scanner.nextLine());
            if (input <= 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f", input);
            System.out.println();
            sum+= input;
            num++;
        }

        System.out.printf("Total: %.2f", sum);


    }
}
