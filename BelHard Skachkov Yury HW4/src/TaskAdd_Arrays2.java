import java.util.Random;
import java.util.Scanner;

//Дан массив с целыми числами. Вывести в консоль сумму элементов с четными индексами.
public class TaskAdd_Arrays2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // ввод количества строк
        System.out.printf("Вывод массива в консоль\n");
        int[] Array = new int[n];//инициализация одномерного массива
        Random random = new Random();//заполнение массива случайными числами
        for (int i = 0; i < n; i++) {//итерация (проходка) по строкам массива
            Array[i] = random.nextInt(9);//случайные числа будут от 0 до 9
        }
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + " ");//вывод массива в консоль
        }
        int sum = 0;//инициализация переменной для подсчета четных значений
        for (int i = 0; i < Array.length; i+= 2) {
            sum += 1;
        }
        System.out.printf("\nCумма элементов с четными индексами равна %s.", sum);
    }
}





