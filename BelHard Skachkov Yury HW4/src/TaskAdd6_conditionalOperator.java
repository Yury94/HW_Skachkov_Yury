//Пользователь вводит в консоли три числа. Рассчитываем и выводим в консоль сумму наибольшего и наименьшего из них.
import java.util.Scanner;

public class TaskAdd6_conditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три любых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.printf("Сумма максиьального и минимального числа = %d\n", Math.max(Math.max(a, b), c) + Math.min(Math.min(a, b), c));
    }
}
