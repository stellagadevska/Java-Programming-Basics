import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smaller = Integer.parseInt(scanner.nextLine());
        int bigger = Integer.parseInt(scanner.nextLine());

        for (int num = smaller; num <= bigger ; num++) {
            String currentNum = "" + num;
            int evenSum = 0;
            int oddSum = 0;
            int process = num;

            for (int j = 0; j < currentNum.length(); j++) {
//                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                int currentDigit = process % 10;

                if ((j+1) % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }

                process = (process - currentDigit) / 10;

            }

            if(evenSum == oddSum) {
                System.out.print(num + " ");
            }
        }

    }
}


