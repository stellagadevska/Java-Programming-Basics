import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;

        int num = 1;
        while(num <= count) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input > maxNum) {
                maxNum = input;
            }
            num++;
        }

        System.out.println(maxNum);
    }
}
