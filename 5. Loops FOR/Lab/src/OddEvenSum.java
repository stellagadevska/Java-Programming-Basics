import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int number = 0;
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < count; i++) {
            number = scanner.nextInt();
            if (i % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        if (oddSum == evenSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + (evenSum));
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(oddSum-evenSum));
        }
    }
}
