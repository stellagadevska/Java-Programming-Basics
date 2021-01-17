import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxBadGrades = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int badGradesReceived = 0;
        int sumGrades = 0;
        int countTasks = 0;
        String lastTask = "";

        while (!command.equals("Enough")) {
            String taskName = command;
            int grade = Integer.parseInt(scanner.nextLine());

            sumGrades += grade;
            countTasks++;

            if (grade <= 4) {
                badGradesReceived++;
            }

            if (badGradesReceived == maxBadGrades) {
                System.out.println("You need a break, " + badGradesReceived + " poor grades.");
                break;
            }

            lastTask = taskName;

            command = scanner.nextLine();
        }

        double avGrade = sumGrades*1.0 / countTasks;

        if (command.equals("Enough")) {
            System.out.printf("Average score: %.2f", avGrade);
            System.out.println();
            System.out.println("Number of problems: " + countTasks);
            System.out.println("Last problem: " + lastTask);
        }

    }
}
