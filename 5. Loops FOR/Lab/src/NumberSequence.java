import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int number = 0;
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            number = Integer.parseInt(scanner.nextLine());
            if (number < minNumber) {
                minNumber = number;
            }

            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);
    }
}
