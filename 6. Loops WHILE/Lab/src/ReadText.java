import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        while (!word.equals("Stop")) {
            word = scanner.nextLine();
        }
    }
}
