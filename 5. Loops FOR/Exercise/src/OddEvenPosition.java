import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        double number = 0;
        
        double evenSum = 0;
        double oddSum = 0;

        double evenMax = -10000000.00;
        double evenMin = 10000000.00;

        double oddMax = -10000000.00;
        double oddMin = 10000000.00;
        

        for (int i = 1; i <= count; i++) {
            number = Double.parseDouble(scanner.nextLine());
            
            if ((i % 2) == 0) {
                evenSum += number;
                if (number > evenMax) {
                    evenMax = number;
                }
                if (number < evenMin) {
                    evenMin = number;
                }
            } else {
                oddSum += number;
                if (number > oddMax) {
                    oddMax = number;
                }
                if (number < oddMin) {
                    oddMin = number;
                }
            }
        }

        System.out.printf("OddSum=%.2f,%n",oddSum);
        if (oddMax == -10000000.00) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n",oddMin);
        }
        if (oddMin == 10000000.00) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,%n",oddMax);
        }
        
        System.out.printf("EvenSum=%.2f,%n",evenSum);
        if (evenMax == -10000000.00) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,%n",evenMin);
        }
        if (evenMin == 10000000.00) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f%n",evenMax);
        }
    }
}
