import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 10000;
        String command = scanner.nextLine();
        int steps = 0;
        int stepsToday = 0;

        while (!command.equals("Going home")) {
            steps = Integer.parseInt(command);
            stepsToday += steps;
            if (stepsToday >= goal) {
                System.out.println("Goal reached! Good job!");
                break;
            }
            command = scanner.nextLine();
        }

        if (stepsToday < goal) {
            steps = Integer.parseInt(scanner.nextLine());
            stepsToday += steps;
            if (stepsToday >= goal) {
                System.out.println("Goal reached! Good job!");
            } else {
                System.out.println(goal - stepsToday + " more steps to reach goal.");
            }
        }
    }
}
