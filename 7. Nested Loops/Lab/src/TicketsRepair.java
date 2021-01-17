import java.util.Scanner;

public class TicketsRepair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Броячите - от тип int
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;

        int counterTotal = 0;

        String movieName = scanner.nextLine();
        while (!(movieName.equals("Finish"))) {
            int freeSpaces = Integer.parseInt(scanner.nextLine());
            // Нулираме при всеки филм
            counterTotal = 0;

            // Използвайки for, вече нямаме нужда от counter
            // Завъртаме докато има свободни места или в случай на команда End
            for (int i = 0; i < freeSpaces; i++) {
                String type = scanner.nextLine();
                if (type.equals("End")) {
                    break;
                }

                counterTotal++;
                switch (type) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    default:
                        kidCount++;
                        break;
                }
            }

            // Променливата може да бъде създадена направо тук
            double hall = (double) counterTotal / freeSpaces * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, hall);

            movieName = scanner.nextLine();
        }

        counterTotal = studentCount + standardCount + kidCount;
        System.out.printf("Total tickets: %d%n", counterTotal);

        // Променливите, изчисляващи процентите се използват само в края на тази програма,
        // затова можем да ги създадем директно преди да ги използваме
        double studentPercent = (100.0 / counterTotal ) * studentCount;
        System.out.printf("%.2f%% student tickets.%n", studentPercent);

        double standardPercent = (100.0 / counterTotal) * standardCount;
        System.out.printf("%.2f%% standard tickets.%n", standardPercent);

        double kidPercent = (100.0 / counterTotal) * kidCount;
        System.out.printf("%.2f%% kids tickets.", kidPercent);

    }
}

