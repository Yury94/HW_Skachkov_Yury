//
import java.util.Scanner;

public class TaskAdd1_conditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = scanner.nextInt();
        if (number>10) {
            System.out.println("Число больше десяти");
        } else if (number<10) {
            System.out.println("Число меньше десяти");
        } else {
            System.out.println("Число равно десяти");
        }
    }
}
