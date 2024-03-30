//Пользователь вводит строку. Выводим в консоль эту строку посимвольно (одна строка – один символ).
import java.util.Scanner;

public class TaskAdd_Cycles5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любую строку: ");
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();
        for (char anySymbol : charArray) {
            System.out.printf("%s \n", anySymbol);
        }
    }
}

