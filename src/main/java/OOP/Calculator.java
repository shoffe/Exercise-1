package OOP;

import java.util.Scanner;

public class Calculator {
    double a;
    double b;

    double addition(double a,double b) {
        return a + b;
    }

    double substraction(double a, double b) {
        return a - b;
    }

    double division(double a, double b) throws Exception {
        if (b > 0) {
            return a / b;
        }
        throw new Exception("на ноль не делят");
    }

    double multiplication(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 число");
        double x = scanner.nextDouble();
        System.out.println("Введите 2 число");
        double y = scanner.nextDouble();

        Calculator calculator = new Calculator();
        System.out.println("Выберите действие: \n 1 - сложение \n 2 - вычитание \n 3 - деление \n 4 - умножение ");

        double d = 0;

        int z = scanner.nextInt();
        switch (z) {
            case 1:
                d = calculator.addition(x,y);
                break;
            case 2:
                d = calculator.substraction(x,y);
                break;
            case 3:
                d = calculator.division(x,y);
                break;
            case 4:
                d = calculator.multiplication(x,y);
                break;
        }
        System.out.println("Результат: " + d);
    }
}
