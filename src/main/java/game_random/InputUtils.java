package game_random;

import java.util.Scanner;

public class InputUtils {
    public static int scanInt() {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();

        while (!hasNextInt) {
            scanner = new Scanner(System.in);
            System.out.println("Введите число");
            hasNextInt = scanner.hasNextInt();
        }

        return scanner.nextInt();
    }
}
