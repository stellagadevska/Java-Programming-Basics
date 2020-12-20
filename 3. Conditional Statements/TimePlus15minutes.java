import java.util.Scanner;

public class TimePlus15minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int sumMinutes = hour*60 + minutes;
        int sumPlus15Min = sumMinutes + 15;

        int finalHour = sumPlus15Min / 60;
        if (finalHour == 24) {
            finalHour = 0;
        }
        int finalMinutes = sumPlus15Min % 60;

        if(finalMinutes < 10) {
            System.out.println(finalHour + ":0" + finalMinutes);
        } else {
            System.out.println(finalHour + ":" + finalMinutes);
        }
    }
}
