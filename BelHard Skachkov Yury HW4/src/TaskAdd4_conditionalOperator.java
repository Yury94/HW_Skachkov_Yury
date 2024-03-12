//Пользователь вводит в консоли четыре числа.
// Рассчитываем и выводим в консоль количество отрицательных и положительных чисел
import java.util.Scanner;

public class TaskAdd4_conditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четыре числа: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int plus = 0;
        int minus = 0;
        if (number1 >=0) {
            plus ++;
        }else {
            minus ++;
        }
        if (number2 >=0) {
            plus ++;
        }else {
            minus ++;
        }if (number3 >=0) {
            plus ++;
        }else {
            minus ++;
        }
        if (number4 >=0) {
            plus ++;
        }else {
            minus ++;
        }
        System.out.printf("Количество положительных чисел = %s; \n" +
                "Количество отрицательных чисел = %s.\n", plus, minus);
    }
}
