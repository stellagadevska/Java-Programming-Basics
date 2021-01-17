import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int number = 0;
        int sum = 0;

        for (int i = 0; i < count; i++) {
            number = Integer.parseInt(scanner.nextLine());
            sum+= number;
        }

        System.out.println(sum);
    }
}
