import java.util.Scanner;

public class LeftAndRightSum {
    // Да се напише програма, която чете 2*n-на брой цели числа, подадени от потребителя, и проверява дали сумата на
    // първите n числа (лява сума) е равна на сумата на вторите n числа (дясна сума). При равенство печата
    // " Yes, sum = " + сумата; иначе печата " No, diff = " + разликата. Разликата се изчислява като положително число
    // (по абсолютна стойност).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int number = 0;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < count; i++) {
            number = scanner.nextInt();
            leftSum += number;
        }

        for (int i = 0; i < count; i++) {
            number = scanner.nextInt();
            rightSum += number;
        }

        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + (leftSum));
        } else {
            System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
        }

    }
}
