import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = scanner.nextInt();
        int salary = scanner.nextInt();

        for (int i = 1; i <= tabs; i++) {
            String type = scanner.nextLine();
            switch (type){
                case "Facebook":
                    salary-= 150;
                    break;
                case "Instagram":
                    salary-= 100;
                    break;
                case "Reddit":
                    salary-= 50;
                    break;
            }
            if (salary <= 0){
                System.out.println("You have lost your salary.");
                return;
            }
        }


        if (salary > 0) {
            System.out.println(salary);
        }

    }
}
