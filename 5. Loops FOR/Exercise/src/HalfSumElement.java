import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int number = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > max) {
                max = number;
            }
        }

        sum -= max;

        if (max == sum) {
            System.out.println("Yes");
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sum - max));
        }



    }
}
