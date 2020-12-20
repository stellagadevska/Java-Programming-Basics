import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int countOvernight = Integer.parseInt(scanner.nextLine());
        double studioCount = 0;
        double apartmentCount = 0;

        if (("May".equals(month)) || ("October".equals(month))) {
            studioCount = countOvernight * 50;
            apartmentCount = countOvernight * 65;
            if ((countOvernight > 7) && (countOvernight <= 14)) {
                studioCount = studioCount - (studioCount * 0.05);
            } else if (countOvernight > 14) {
                studioCount = studioCount - (studioCount * 0.3);
                apartmentCount = apartmentCount - (apartmentCount * 0.1);
            }
        } else if (("June".equals(month)) || ("September".equals(month))) {
            studioCount = countOvernight * 75.2;
            apartmentCount = countOvernight * 68.7;
            if (countOvernight > 14) {
                studioCount = studioCount - (studioCount * 0.2);
                apartmentCount = apartmentCount - (apartmentCount * 0.1);
            }
        } else if (("July".equals(month)) || ("August".equals(month))) {
            studioCount = countOvernight * 76;
            apartmentCount = countOvernight * 77;
            if (countOvernight > 14) {
                apartmentCount = apartmentCount - (apartmentCount * 0.1);
            }
        }
        System.out.printf("Apartment: %.2f lv. %n", apartmentCount);
        System.out.printf("Studio: %.2f lv.", studioCount);
    }
}