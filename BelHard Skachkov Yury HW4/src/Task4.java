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
        switch (number) {
            case 0:
                System.out.printf("Выход из программы: %s\n", panelControl [0]);
                break;
            case 1:
                System.out.printf("Название программы: %s\n", panelControl [1]);
                break;
            case 2:
                System.out.printf("Название программы: %s\n", panelControl [2]);
                break;
            case 3:
                System.out.printf("Название программы: %s\n", panelControl [3]);
                break;
            case 4:
                System.out.printf("Название программы: %s\n", panelControl [4]);
                break;
            case 5:
                System.out.printf("Название программы: %s\n", panelControl [5]);
                break;
        }

    }
}
