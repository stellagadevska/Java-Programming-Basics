import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int days = 0;
        int spendCounter = 0;

        while(availableMoney < vacationMoney) {
            String action = scanner.nextLine(); // save/ spend
            double actionMoney = Double.parseDouble(scanner.nextLine());
            days++;

            if (action.equals("save")) {
                availableMoney += actionMoney;
                if (availableMoney >= vacationMoney) {
                    break;
                }
                spendCounter = 0;
            } else if (action.equals("spend")) {
                if (availableMoney - actionMoney >= 0) {
                    availableMoney -= actionMoney;
                } else  {
                    availableMoney = 0;
                }
                spendCounter++;

                if (spendCounter == 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(days);
                    break;
                }
            }

        }

        if (availableMoney >= vacationMoney) {
            System.out.println("You saved the money for " + days + " days.");
        }
    }

}
