import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        int capacity = Integer.parseInt(scanner.nextLine());
        int numBooksChecked = 0;
        boolean found = false;

        while (numBooksChecked < capacity) {
            String book = scanner.nextLine();
            if (book.equals(searchedBook)) {
                found = true;
                break;
            }
            numBooksChecked++;
        }

        if (found) {
            System.out.println("You checked " + numBooksChecked + " books and found it."  );
        } else {
            System.out.println("The book you search is not here!");
            System.out.println("You checked " + numBooksChecked + " books.");
        }
    }
}
