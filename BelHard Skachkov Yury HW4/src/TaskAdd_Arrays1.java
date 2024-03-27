import java.util.Random;
import java.util.Scanner;

//Дан массив с целыми числами. Вывести в консоль количество положительных и отрицательных чисел в нем
public class TaskAdd_Arrays1 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // ввод количества строк
        System.out.printf("Вывод массива в консоль\n");
        int[] Array = new int[n];//инициализация одномерного массива
        Random random = new Random();//заполнение массива случайными числами
        for (int i = 0; i < n; i++) {//итерация (проходка) по строкам массива
            Array[i] = random.nextInt(-9,9);//случайные числа будут от -9 до 9
        }
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + " ");//вывод массива в консоль
        }
        int sumPositive = 0;//инициализация переменной для подсчета положительных значений
        int sumNegative = 0;//инициализация переменной для подсчета отрицательных значений
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] >= 0){//счетчик положительных чисел
                sumPositive += 1;
            } else
                sumNegative += 1;
        }
        System.out.printf("\nCумма элементов положительных чисел равна %s;\n", sumPositive);
        System.out.printf("Cумма элементов отрицательных чисел равна %s.\n", sumNegative);
    }
}
