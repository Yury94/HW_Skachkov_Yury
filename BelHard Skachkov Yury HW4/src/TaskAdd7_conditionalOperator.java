//Пользователь вводит в консоли число. Выводим сообщение о том, четное число, или нечетное

import java.util.Scanner;

public class TaskAdd7_conditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number %2==0) {
            System.out.println("Введено четное число");
        } else {
            System.out.println("Введено нечетное число");
        }
    }
}
