import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int pieces = length * width;
        int piecesCopy = pieces;

        int piecesTaken = 0;
        String command = scanner.nextLine();
        while (!command.equals("STOP")) {
            piecesTaken = Integer.parseInt(command);
            pieces -= piecesTaken;
            if (pieces <= 0) {
                System.out.println("No more cake left! You need " + Math.abs(pieces) + " pieces more.");
                break;
            }
            command = scanner.nextLine();
        }

        if (pieces > 0) {
            System.out.println(pieces + " pieces are left.");
        }

    }
}
