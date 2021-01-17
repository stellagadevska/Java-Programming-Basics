import java.util.Scanner;

public class Numbers1toNIn3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i+=3) {
            System.out.println(i);
        }
    }
}
