import java.util.Scanner;

//Пользователь вводит число - х. Выдаем число из последовательности фибоначчи с индексом х
public class TaskAdd_Cycles3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс числа Фибоначчи: ");
        int number = scanner.nextInt();
        System.out.printf("Число Фибоначчи с индексом %s равно: \n", number);
        long a = 0;
        long b = 1;
        for (int i = 2; i <= number; ++i) {
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println(b);
    }
}

