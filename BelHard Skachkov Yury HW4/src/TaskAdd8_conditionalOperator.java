//Программа “Магазин”, выводим меню из трех товаров с ценами. Пользователь выбирает товар, вводит сумму денег.
// Если сумма меньше цены, выводим сообщение: “Денег не хватает!”, если сумма равна цене – “Спасибо за покупку!”,
// если больше – “Ваша сдача: [сумма сдачи]”

import java.util.Arrays;
import java.util.Scanner;

public class TaskAdd8_conditionalOperator {

    public static void main(String[] args) {
        String[] listOfProduct = {"0.Coffee: $12", "1.Tea: $7", "2.Cacao: $9"};
        System.out.println(Arrays.toString(listOfProduct));
        System.out.println("Выберите товар для покупки согласно порядкового номера от 0 до 2 ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int price;
        System.out.printf("Вы выбрали товар: %s\n", listOfProduct[number]);
        if(number == 0) {
            price = 12;
        }else if (number == 1){
            price = 7;
        }else  {price = 9;
        }
        System.out.println("Введите сумму для оплаты: ");
        int amount = scanner.nextInt();
        if (amount < price) {
            System.out.println("Денег не хватает!");
        }
        if (amount == price) {
            System.out.println("Спасибо за покупку!");
        } else if (amount > price) {
            int dif = amount - price;
            System.out.printf("Ваша сдача: $%s", dif);
        }
    }
}
