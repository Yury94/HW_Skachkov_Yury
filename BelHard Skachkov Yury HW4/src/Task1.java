// Доработайте пример с оператором if… else - если пользователь вводит значение вне диапазона 0 - 100,
// вывести сообщение “Введено некорректное значение” и попросить повторить ввод (использовать цикл):
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your score: ");
        int score = scanner.nextInt();
        while (score > 100 || score < 0) {
            System.out.println("You entered value is incorrect. Please repeat enter your score: ");
            score = scanner.nextInt();
        }
        if (score >= 70) {
            System.out.println("Congrats! You’ve passed the test!");
        } else {
            System.out.println("Sorry, you’ve failed the test.");
        }
    }
}
