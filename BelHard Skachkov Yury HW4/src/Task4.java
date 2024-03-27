import java.util.Scanner;

//Реализуйте “пульт дистанционного управления телевизора”:
// пользователь вводит номер канала, программа выводит название канала.
// Выход из программы по вводу “0”. Используйте массив.
public class Task4 {
    public static void main(String[] args) {
        String[] panelControl = {"Exit", "NTV", "TNT", "ORT", "BT", "MIR"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер канала от 1 до 5, кнопка 0 - выход из программы");
        int number = scanner.nextInt();
        String result = (number >= 1 && number <= 5) ? "Название программы: " : "Выход из программы: ";
        System.out.println(result + panelControl[number]);

    }
}
