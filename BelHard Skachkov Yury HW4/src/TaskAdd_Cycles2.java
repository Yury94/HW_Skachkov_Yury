import java.util.Scanner;

//Пользователь вводит число - х. Выводим в консоль все четные числа от нуля до х.
public class TaskAdd_Cycles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        System.out.printf("Список всех четных чисел:\n");
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.printf("%s \n", i);
            }
        }
    }
}

