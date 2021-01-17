import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Free space dimensions
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int freeSpaceVolume = width * height * length;

        int numberOfBoxes = 0;
        String command = scanner.nextLine();
        while(!command.equals("Done")) {
            numberOfBoxes = Integer.parseInt(command);
            freeSpaceVolume -= numberOfBoxes;

            if (freeSpaceVolume <= 0) {
                System.out.println("No more free space! You need " + Math.abs(freeSpaceVolume) + " Cubic meters more.");
                break;
            }

            command = scanner.nextLine();
        }

        if (freeSpaceVolume > 0) {
            System.out.println(freeSpaceVolume + " Cubic meters left.");
        }
    }
}
