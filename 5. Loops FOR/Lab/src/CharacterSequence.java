import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();

        for (int i = 0; i < item.length(); i++) {
            char character = item.charAt(i);
            System.out.println(character);
        }
    }
}
