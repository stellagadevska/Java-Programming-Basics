import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profitLv = Double.parseDouble(scanner.nextLine());
        double averageSuccess = Double.parseDouble(scanner.nextLine());
        double minimalWorkingSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0;
        double excellentScholarship = 0;

        boolean canGetSocialScholarship = false;
        boolean canGetExcellentScholarship = false;

        if(((profitLv < minimalWorkingSalary) && (averageSuccess >= 4.50)) || (averageSuccess >= 5.5)) {
            if ((profitLv < minimalWorkingSalary) && (averageSuccess >= 4.50)) {
                socialScholarship = minimalWorkingSalary * 0.35;
                canGetSocialScholarship = true;
            }
            if (averageSuccess >= 5.5) {
                excellentScholarship = averageSuccess * 25;
                canGetExcellentScholarship = true;
            }

            if (canGetSocialScholarship && canGetExcellentScholarship) {
                if (socialScholarship > excellentScholarship) {
                    System.out.println("You get a Social scholarship " + (int) Math.floor(socialScholarship) + " BGN");
                } else {
                    System.out.println("You get a scholarship for excellent results " + (int) Math.floor(excellentScholarship) + " BGN");
                }

            }
        } else {
            System.out.println("You cannot get a scholarship!");
        }


    }
}
