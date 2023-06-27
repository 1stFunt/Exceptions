// Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class Task3 {
    public static void checkPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        
        try {
            if (number <= 0) {
                throw new InvalidNumberException("Некорректное число");
            } else {
                System.out.println("Число корректно");
            }
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        checkPositiveNumber();
    }
}