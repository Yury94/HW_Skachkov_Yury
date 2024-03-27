//Дан массив с целыми числами. Вывести в консоль наиболее часто встречающееся.
// Если таких несколько, то вывести наибольшее из них, если повторяющихся нет, вывести соответствующее сообщение.

import java.util.Arrays;
import java.util.Random;

public class TaskAdd_Arrays5 {
    public static void main(String[] args) {
        int[] Array = new int[10];////инициализация одномерного массива с целыми числами.
        Random random = new Random();
        System.out.printf("Вывод массива в консоль: \n");
        for (int i = 0; i < 10; i++) {//итерация (проходка) по столбцам массива
            Array[i] = random.nextInt(9);//заполнение массива целыми случайными числами от -5 до 9
        }
        for (int i = 0; i < 10; i++) {
            Arrays.sort(Array);//сделаем сортировку нашего массива
            System.out.print(Array[i] + " ");//вывод массива в консоль
        }
        System.out.println();
        int sum = 0;//счетчик количества совпадений
        int max = 0;//количество максимальных совпадений для какого либо значения
        int value = 0;//переменная для значения, которое совпадает
        for (int i = 0; i < Array.length; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[i] == Array[j]) {
                    sum++;
                }
            }
            if (sum > max) {
                max = sum;
                value = Array[i];
                System.out.printf("Для значение массива = %s : количество совпадений %s \n", value, max);
            }
            sum = 0;
        }
        System.out.printf("Максимальное количество совпадений %s \n", max);
    }
}
