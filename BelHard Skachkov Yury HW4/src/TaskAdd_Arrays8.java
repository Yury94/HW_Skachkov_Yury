//Дан двумерный массив 5х5 с целыми числами. Посчитать суммы чисел в каждом столбце и вывести наибольшую из них.

import java.util.Random;

public class TaskAdd_Arrays8 {
    public static void main(String[] args) {
        int[][] twoDimArr = new int[5][5];//инициализация двумерного массива
        Random random = new Random();//заполнение массива случайными числами
        for (int i = 0; i < 5; i++) {//итерация (проходка) по строкам массива (для n строк)
            for (int j = 0; j < 5; j++) {//итерация (проходка) по столбцам массива (для m столбцов)
                twoDimArr[i][j] = random.nextInt(10);//случайные числа будут от 0 до 100
            }
        }
        System.out.println("Вывод массива в консоль: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(twoDimArr[i][j] + " ");//вывод массива в консоль
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
        int sum1 = 0; int sum2 = 0; int sum3 = 0; int sum4 = 0; int sum5 = 0;
                for (int i = 0; i < 5; i++) {
            sum1 += twoDimArr[i][0]; sum2 += twoDimArr[i][1]; sum3 += twoDimArr[i][2]; sum4 += twoDimArr[i][3]; sum5 += twoDimArr[i][4];
        }
        System.out.printf("Суммы чисел в столбце: 1 = %d, 2 = %d, 3 = %d, 4 = %d, 5 = %d. \n", sum1, sum2, sum3, sum4, sum5);
        int[] oneDimArr = new int[5];//инициализация одномерного массива
        oneDimArr[0] = sum1;//заполняем одномерный массив индекса 0
        oneDimArr[1] = sum2;//заполняем одномерный массив индекса 1
        oneDimArr[2] = sum3;//заполняем одномерный массив индекса 2
        oneDimArr[3] = sum4;//заполняем одномерный массив индекса 3
        oneDimArr[4] = sum5;//заполняем одномерный массив индекса 4
        int maxSum = oneDimArr[0];
        for (int i = 1; i < 5; i++) {
            if (oneDimArr[i-1] <= oneDimArr[i]) {
                maxSum = oneDimArr[i];
            }
        }System.out.printf("Hаибольшая сумма = %s.", maxSum);
    }
}
