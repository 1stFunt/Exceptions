// Обработка некорректного ввода
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        String input = scanner.nextLine();

        try {
            int age = Integer.parseInt(input);
            System.out.println("Ваш возраст: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Некорректный ввод");
        }
    }
}