import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        double totalScore = 0.0;
        int count = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            double currentPresentationScore = 0.0;
            for (int i = 0; i < jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                currentPresentationScore += grade;
            }

            double averageScore = currentPresentationScore / jury;
            System.out.printf("%s - %.2f.%n", input, averageScore);

            totalScore += averageScore;
            count++;

            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", totalScore / count);
    }
}
