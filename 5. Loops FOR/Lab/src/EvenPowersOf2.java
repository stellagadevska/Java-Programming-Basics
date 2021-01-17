import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println((int) Math.pow(2, i));
            }
        }
    }
}
