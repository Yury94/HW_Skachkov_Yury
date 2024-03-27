//Пользователь вводит в консоли длины сторон треугольника (три числа),
// выводим сообщение, является ли треугольник равнобедренным, равносторонним или разносторонним.
import java.util.Scanner;

public class TaskAdd3_conditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три стороны треугольника: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if (number1 == number2 && number2 == number3) {
            System.out.println("Треугольник является равносторонним");
        } else if (number1 != number2 && number2 != number3 && number1 != number3) {
            System.out.println("Треугольник является разносторонним");
        } else {
            System.out.println("Треугоник является равнобедренный");
        }
    }
}
