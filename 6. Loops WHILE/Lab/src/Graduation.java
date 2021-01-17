import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double sum = 0.00;

        int n = 1;
        while (n <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if(grade >= 4.00) {
                sum += grade;
                n++;
            }
        }

        double avGrade = sum / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, avGrade);
    }
}
