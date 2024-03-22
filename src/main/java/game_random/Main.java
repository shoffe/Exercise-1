package game_random;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nickname = askNickname();


        Gamer gamer = new Gamer(nickname);
        boolean exitGame = false;


        do {
            System.out.println("Выберите действие:");
            System.out.println("1 - играть");
            System.out.println("2 - распечатать информацию об игроке");
            System.out.println("3 - создать аккаунт");
            System.out.println("4 - выход из программы");
            int choice = InputUtils.scanInt();

            if (choice == 1) {
                RandomNumberGame randomNumberGame = new RandomNumberGame(gamer);
                randomNumberGame.run();
            } if (choice == 2) {
                gamer.printAccInfo();
            } if (choice == 3) {
                gamer = new Gamer(askNickname());
            }
            if (choice == 4) {
                exitGame = true;
            }
        } while (!exitGame);

    }

    private static String askNickname() {
        System.out.println("Введите имя игрока");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
