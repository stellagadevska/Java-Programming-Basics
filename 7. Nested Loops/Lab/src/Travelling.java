import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String destination = command;
            double budget = Double.parseDouble(scanner.nextLine());
            boolean flag = false;
            double moneySaved = 0;

            while(!flag) {
                double money = Double.parseDouble(scanner.nextLine());
                moneySaved += money;
                if (moneySaved >= budget) {
                    System.out.println("Going to " + destination + "!");
                    flag = true;
                }
            }

            command = scanner.nextLine();
        }
    }
}
