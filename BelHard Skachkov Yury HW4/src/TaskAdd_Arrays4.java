import java.util.Random;
import java.util.Scanner;

//Дан массив с целыми числами. Вывести в консоль наибольшее из них.
public class TaskAdd_Arrays4 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // ввод количества строк
        System.out.printf("Вывод массива в консоль: \n");
        int[] Array = new int[n];//инициализация одномерного массива
        Random random = new Random();//заполнение массива случайными числами
        for (int i = 0; i < n; i++) {//итерация (проходка) по столбцам массива
            Array[i] = random.nextInt(-9, 9);//случайные числа будут от -9 до 9
        }
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + " ");//вывод массива в консоль
        }
        int bigestValue = Array[0];//инициализация переменной для отображения наибольшего значения
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] >= bigestValue) {//счетчик положительных чисел
                bigestValue = Array[i];
            }
        }
        System.out.printf("\nНаибольшее значение из всех элементов массива равно %s;\n", bigestValue);
    }
}
