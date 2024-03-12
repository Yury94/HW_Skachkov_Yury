import java.util.Random;

//Дан двумерный массив 10х10 с целыми числами. Вывести в консоль все числа по диагонали от [0][10] до [10][0].
public class TaskAdd_Arrays7 {
    public static void main(String[] args) {
        int[][] twoDimArr = new int[10][10];//инициализация двумерного массива
        Random random = new Random();//заполнение массива случайными числами
        for (int i = 0; i < 10; i++) {//итерация (проходка) по строкам массива (для n строк)
            for (int j = 0; j < 10; j++) {//итерация (проходка) по столбцам массива (для m столбцов)
                twoDimArr[i][j] = random.nextInt(10);//случайные числа будут от 0 до 10
            }
        }
        System.out.println("Вывод массива в консоль: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(twoDimArr[i][j] + " ");//вывод массива в консоль
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
        System.out.println("Все числа по диагонали от [0][10] до [10][0]: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.printf("%d ", twoDimArr[i][twoDimArr[i].length - 1 - i]);
                }
            }
        }
    }
}
