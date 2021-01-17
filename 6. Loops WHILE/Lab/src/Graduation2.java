import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double sum = 0.00;

        int n = 1;
        int failCount = 0;
        while (n <= 12) {
            if (failCount == 2) {
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if(grade >= 4.00) {
                sum += grade;
                n++;
            } else {
                failCount++;
            }

        }

        if (failCount < 2) {
            double avGrade = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avGrade);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, n);
        }

    }
}
