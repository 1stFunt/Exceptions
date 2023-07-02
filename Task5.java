import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class PowerCalculator {
    public double calculatePower(double base, double exponent) throws InvalidInputException {
        if (base == 0 && exponent < 0) {
            throw new InvalidInputException("Некорректный ввод: Основание не может быть нулём при отрицательном показателе.");
        }
        return Math.pow(base, exponent);
    }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите основание: ");
        double base = scanner.nextDouble();

        System.out.print("Введите степень: ");
        double exponent = scanner.nextDouble();

        PowerCalculator calculator = new PowerCalculator();
        try {
            double результат = calculator.calculatePower(base, exponent);
            System.out.println("Результат: " + результат);
        } catch (InvalidInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка.");
        }
    }
}