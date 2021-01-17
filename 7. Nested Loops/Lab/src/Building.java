import java.util.Scanner;

public class Building {
    // Напишете програма, която извежда на конзолата номерата на стаите в една сграда (в низходящ ред), като са изпълнени следните условия:
    //•	На всеки четен етаж има само офиси  if (num % 2 == 0)
    //•	На всеки нечетен етаж има само апартаменти

    //•	На последният етаж винаги има апартаменти и те са по-големи от останалите,
    // за това пред номера им пише 'L', вместо 'А'. Ако има само един етаж, то има само големи апартаменти!


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        int roomsOnFloor = Integer.parseInt(scanner.nextLine());


        for (int floor = numberOfFloors; floor >= 1 ; floor--) {
            for (int r = 0; r < roomsOnFloor; r++) {
                if (floor == numberOfFloors) {
                    System.out.printf("L%d%d ", floor, r);
                } else if (floor % 2 == 0) {
                    System.out.printf("O%d%d ", floor, r);
                } else {
                    System.out.printf("A%d%d ", floor, r);
                }
            }

            System.out.println();
        }

//        if (floor == numberOfFloors) {
//            for (int largeAp = 0; largeAp < roomsOnFloor ; largeAp++) {
//                 System.out.printf("O%d%d ", floor, largeAp);
//            }
//        } else if (floor % 2 == 0) {
//            for (int office = 0; office < roomsOnFloor ; office++) {
//                System.out.printf("O%d%d ", floor, office);
//            }
//        } else {
//            for (int apartment = 0; apartment < roomsOnFloor ; apartment++) {
//                System.out.printf("A%d%d ", floor, apartment);
//            }
//        }
    }
}
