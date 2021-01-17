import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int current = 1;
        boolean isBigger = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(current + " ");
                current++;

                if (current > n) {
                    isBigger = true;
                    break;
                }
            }
            if (isBigger) {
                break;
            }
            System.out.println();
        }
    }
}
