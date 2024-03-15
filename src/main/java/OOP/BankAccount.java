package OOP;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String nameAccount;
    private int numberAccount;
    private double balanceAccount;
    double money;

    void cashWithdrawal(double money) {
        if (money <= balanceAccount)
            balanceAccount = balanceAccount - money;
        else {
            System.out.println("Недостаточно средств");
        }
    }

    void deposit(double money) {
        balanceAccount = balanceAccount + money;
    }

    void printInfo() {
        System.out.println("Ваше имя: " + nameAccount + "\nВаш баланс: " + balanceAccount + "\nВаш счёт: " + numberAccount);
    }

    public BankAccount(String nameAccount, int numberAccount, double balanceAccount) {
        this.nameAccount = nameAccount;
        this.numberAccount = numberAccount;
        this.balanceAccount = balanceAccount;
    }

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount("Иван Иванов", 12345, 1000));
        accounts.add(new BankAccount("Петр Петров", 67890, 3000));

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Введите номер своего счета");
            int idScan = scanner.nextInt();

            System.out.println("\nВыберите действие:");
            System.out.println("1. Посмотреть счет");
            System.out.println("2. Снять деньги");
            System.out.println("3. Зачислить деньги");
            System.out.println("4. Выйти");

            int choice = scanner.nextInt();

            boolean found = false;

            for (BankAccount account : accounts) {
                if (account.numberAccount == idScan) {
                    found = true;

                    switch (choice) {
                        case 1:
                            account.printInfo();
                            break;
                        case 2:
                            System.out.println("Введите кол-во денег для снятия.");
                            int draw = scanner.nextInt();
                            account.cashWithdrawal(draw);
                            break;
                        case 3:
                            System.out.println("Введите сколько хотите положить");
                            int dep = scanner.nextInt();
                            account.deposit(dep);
                            break;
                        case 4:
                            System.out.println("Выход...");
                            scanner.close();
                            System.exit(0);
                        default:
                            System.out.println("Неправильный выбор!");
                            break;
                    }
                }
            }
            if (!found) {
                System.out.println("Счет с указанным номером не найден");
            }
        }
    }
}