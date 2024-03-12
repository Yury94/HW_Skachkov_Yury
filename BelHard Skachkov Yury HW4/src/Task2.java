//Доработайте пример с циклом while - преобразуйте его в бесконечный цикл с выходом, если введена строка “Exit”:
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter something: ");
            str = scanner.nextLine();
            if (str.equals("Exit")) {
                System.out.println("Cycle is finished");
                break;
            }
        }
    }
}

