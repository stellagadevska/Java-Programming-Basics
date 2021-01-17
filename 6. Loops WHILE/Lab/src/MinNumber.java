import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int minNum = Integer.MAX_VALUE;

        int num = 1;
        while(num <= count) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input < minNum) {
                minNum = input;
            }
            num++;
        }

        System.out.println(minNum);
    }
}
