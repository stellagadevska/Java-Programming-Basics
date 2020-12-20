import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        String convertedType = scanner.nextLine();

        if (type.equals("mm")) {
            if (convertedType.equals("cm")) {
                number = number / 10;
            } else if (convertedType.equals("m")) {
                number = number / 1000;
            }
        } else if (type.equals("cm")) {
            if (convertedType.equals("mm")) {
                number = number * 10;
            } else if (convertedType.equals("m")) {
                number = number / 100;
            }
        } else if (type.equals("m")) {
            if (convertedType.equals("mm")) {
                number = number * 1000;
            } else if (convertedType.equals("cm")) {
                number = number * 100;
            }
        }

        System.out.printf("%.3f", number);
    }
}
