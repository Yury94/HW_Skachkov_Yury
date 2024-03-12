//Пользователь вводит в консоли два числа, выводим сообщение “первое число больше/меньше, чем второе”
// в зависимости от результата их сравнения
import java.util.Scanner;

public class TaskAdd2_conditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1>number2) {
            System.out.println("Число 1 больше числа 2");
        } else if (number1<number2) {
            System.out.println("Число 1 меньше числа 2");
        } else {
            System.out.println("Число 1 и 2 равны");
        }
    }
}
