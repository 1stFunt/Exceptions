// Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            int number1 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int number2 = scanner.nextInt();

            if (number2 == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            }

            int result = number1 / number2;
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}