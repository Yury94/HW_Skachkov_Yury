//Вывести в консоль таблицу умножения на 4.
public class TaskAdd_Cycles1 {
    public static void main(String[] args) {
        int x = 4;
        for (int i = 0; i <= 10; i++) {
            int p = x * i;
            System.out.printf("%s * %s = %s\n", i, x, p);
        }
    }
}
