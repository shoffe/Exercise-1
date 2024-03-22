package game_random;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    private final Gamer gamer;

    public RandomNumberGame(Gamer gamer) {
        this.gamer = gamer;
    }

    public void run() {
        boolean reload;

        do {
            startGame(askBorder());
            reload = reload();
        } while (reload);
    }

    private void startGame(int secretNumber) {
        greetings();
        boolean gameContinue = true;

        while (gameContinue) {
            int inputNumber = scanInt();
            gameContinue = compareInts(secretNumber, inputNumber);

        }
    }

    private int askBorder() {
        System.out.println("Введите верхнюю границу числа");
        return new Random().nextInt(1, scanInt()+1);
    }

    private void greetings() {
        System.out.println("Угадай число и попытай удачу!");
    }

    /**
     * Метод сравнивает два числа
     * @param secret загаданное число
     * @param input введенное число
     * @return true если не угадал число, false если угадал
     */
    private boolean compareInts(int secret, int input) {
        if (secret > input) {
            System.out.println("Ваше число меньше");
            return true;
        } else if (secret < input) {
            System.out.println("Ваше число больше");
            return true;
        }
        System.out.println("Поздравляю! Победа!");
        gamer.addWin();
        return false;
    }


    /**
     * Запрашивает число до корректного ввода.
     * @return число введенное пользователем
     */
    private int scanInt() {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();
        gamer.addTry();

        while (!hasNextInt) {
            scanner = new Scanner(System.in);
            System.out.println("Введите число");
            hasNextInt = scanner.hasNextInt();
            gamer.addTry();
        }

        return scanner.nextInt();
    }

    private boolean scanIntFail() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return 1 == scanner.nextInt();
        }
        return false;
    }

    private boolean reload() {
        System.out.println("Хотите продолжить? 1 - да");
        return scanIntFail();
    }
}
