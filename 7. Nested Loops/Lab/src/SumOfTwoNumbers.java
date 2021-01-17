import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginning = Integer.parseInt(scanner.nextLine()); // 1
        int end = Integer.parseInt(scanner.nextLine());       // 10
        int magicalNum = Integer.parseInt(scanner.nextLine());  // 5

        int combinationCount = 0;
        boolean flag = false;

        for (int i = beginning; i <= end; i++) {
            for (int j = beginning; j <= end ; j++) {
                combinationCount++;
                int sum = i + j;
                if (sum == magicalNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combinationCount, i, j, sum);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        if (!flag) {
            System.out.printf("%d combinations - neither equals %d", combinationCount, magicalNum);
        }
    }
}
