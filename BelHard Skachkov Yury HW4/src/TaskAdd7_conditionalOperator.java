//Пользователь вводит в консоли число. Выводим сообщение о том, четное число, или нечетное

import java.util.Scanner;

public class TaskAdd7_conditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        String rerult = (number % 2 == 0) ? "Введено четное число" : "Введено нечетное число";
        System.out.println(rerult);
    }
}
