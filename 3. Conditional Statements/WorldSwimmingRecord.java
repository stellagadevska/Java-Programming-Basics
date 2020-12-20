import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSecs = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double speed = Double.parseDouble(scanner.nextLine());

        double swimTime = distance * speed;
        double delay = Math.floor(distance / 15) * 12.5;

        double time = swimTime + delay;

        if (time < recordInSecs) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        } else {
            double diff = time - recordInSecs;
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }
    }


}
