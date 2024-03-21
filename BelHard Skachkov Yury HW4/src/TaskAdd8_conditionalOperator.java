//Программа “Магазин”, выводим меню из трех товаров с ценами. Пользователь выбирает товар, вводит сумму денег.
// Если сумма меньше цены, выводим сообщение: “Денег не хватает!”, если сумма равна цене – “Спасибо за покупку!”,
// если больше – “Ваша сдача: [сумма сдачи]”

import java.util.Arrays;
import java.util.Scanner;

public class TaskAdd8_conditionalOperator {

    public static void main(String[] args) {
        String[] listOfProduct = {"1.Coffee: $12", "2.Tea: $7", "3.Cacao: $9"};
        System.out.println(Arrays.toString(listOfProduct));
        System.out.println("Выберите товар для покупки согласно порядкового номера от 1 до 3 ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int price = 0;
        switch (number) {
            case 1:
                System.out.printf("Вы выбрали товар: %s\n", listOfProduct[0]);
                price = 12;
                break;
            case 2:
                System.out.printf("Вы выбрали товар: %s\n", listOfProduct[1]);
                price = 7;
                break;
            case 3:
                System.out.printf("Вы выбрали товар: %s\n", listOfProduct[2]);
                price = 9;
                break;
        }
        System.out.println("Введите сумму для оплаты: ");
        int amount = scanner.nextInt();

        if (amount < price) {
            System.out.println("Денег не хватает!");
        }
        if (amount == price) {
            System.out.println("Спасибо за покупку!");
        } else {
            int dif = amount - price;
            System.out.printf(" Ваша сдача: $%s", dif);
        }
    }
}
