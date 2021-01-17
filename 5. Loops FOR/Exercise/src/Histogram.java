import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int number = 0;

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;

        for (int i = 1; i <= count; i++) {
//            number = Integer.parseInt(scanner.nextLine());
            number = scanner.nextInt();
            if (number >= 1 && number < 200) {
                c1 += 1;
            } else if (number >= 200 && number <= 399) {
                c2 += 1;
            } else if (number >= 400 && number <= 599) {
                c3 += 1;
            } else if (number >= 600 && number <= 799) {
                c4 += 1;
            } else if (number >= 800) {
                c5 += 1;
            }
        }

        double p1 = (double) c1/count*100;
        double p2 = (double) c2/count*100;
        double p3 = (double) c3/count*100;
        double p4 = (double) c4/count*100;
        double p5 = (double) c5/count*100;
        
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}
