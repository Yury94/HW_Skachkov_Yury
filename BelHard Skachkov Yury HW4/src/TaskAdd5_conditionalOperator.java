//Пользователь вводит в консоли три числа, выводим самое большое из них.
import java.util.Scanner;

public class TaskAdd5_conditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три любых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.printf("Максимальное число = %d\n", Math.max(Math.max(a, b), c));
    }
}
