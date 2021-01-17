import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int student = 0;
        int standard = 0;
        int kid = 0;

        while (!input.equals("Finish")) {
            int freePlaces = Integer.parseInt(scanner.nextLine());
            int ticketsBought = 0;

            for (int i = 0; i < freePlaces; i++) {
                String ticketType = scanner.nextLine();
                if (ticketType.equals("End")) {
                    break;
                }
                ticketsBought++;
                switch (ticketType) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    default:
                        kid++;
                        break;
                }
            }

            // След всеки филм да се отпечата, колко процента от кино залата е пълна
            double percentFull = (double) ticketsBought / freePlaces * 100;

            System.out.printf("%s - %.2f%% full.%n", input, percentFull);
            input = scanner.nextLine();
        }

        int ticketsBought = standard + student + kid;
        System.out.printf("Total tickets: %d%n", ticketsBought);
        System.out.printf("%.2f%% student tickets.%n", (student * 1.0/ ticketsBought * 100));
        System.out.printf("%.2f%% standard tickets.%n", (standard * 1.0 / ticketsBought * 100));
        System.out.printf("%.2f%% kids tickets.%n", (kid * 1.0 / ticketsBought * 100));

    }
}
