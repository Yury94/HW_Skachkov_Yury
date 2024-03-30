import java.util.Scanner;

//Пользователь вводит число. Выводим в консоль факториал этого числа.
public class TaskAdd_Cycles4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number1 = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number1; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}

