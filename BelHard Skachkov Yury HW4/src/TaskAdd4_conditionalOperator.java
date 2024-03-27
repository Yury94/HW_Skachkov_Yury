//Пользователь вводит в консоли четыре числа.
// Рассчитываем и выводим в консоль количество отрицательных и положительных чисел
import java.util.Scanner;

public class TaskAdd4_conditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четыре числа: ");
        int plus = 0;//инициализировали счетчик
        for (int a = 0; a < 4; a++) {
            int number = scanner.nextInt();//вводим столько чисел сколько постребуется согласно циклу
            if (number >= 0) plus++;
        }
        System.out.printf("Количество положительных чисел = %s; \n" +
                "Количество отрицательных чисел = " + (4 - plus) + "\n", plus);
    }
}
