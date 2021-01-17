import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int number = 0;

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        for (int i = 1; i <= count; i++) {
            number = scanner.nextInt();
            if (number % 2 == 0) {
                c1 += 1;
            }
            if (number % 3 == 0) {
                c2 += 1;
            }
            if (number % 4 == 0) {
                c3 += 1;
            }
        }

        double p1 = (double) c1/count*100;
        double p2 = (double) c2/count*100;
        double p3 = (double) c3/count*100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
    }
}
