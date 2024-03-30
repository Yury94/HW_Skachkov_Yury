//Выберите любой объект из окружающего мира, который вам важен, интересен, полезен.
//Опишите его в виде класса/набора классов, обязательно добавьте несколько полей и конструктор.
//Создайте экземпляр этого класса в методе main
//* Переработайте программу с выводом информации о себе под вывод информации о вашем объекте.
import java.util.Scanner;

public class Transport {

    private int power;
    private int maxspeed;
    private int weight;
    private String brend;
    private String type;//обьявление переменной - Тип кузова (Седан, универсал & so on)
    private int passengers;//обьявление переменной - Количество пассажиров

    public Transport(int power, int maxspeed, int weight, String brend, String type, int passengers) {
        this.power = power;
        this.maxspeed = maxspeed;
        this.weight = weight;
        this.brend = brend;
        this.type = type;
        this.passengers = passengers;
    }
    public int getPassengers() {//расширяем доступ переменной
        return passengers;
    }
    public void display() {
        System.out.printf("power: %d h.p., maxspeed: %d km/h, weight: %d kg, brend: %s; type: %s; passengers: %d. \n",
                power, maxspeed, weight, brend, type, passengers);
    }
    public void countPlaces() {//метод рассчета вместимости пассажиров
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите необходимое количество пассажиров для перевозки: ");//вводим время движения
        int total = scan.nextInt();//задаем необходимое количество мест для перевозки пассажиров
        if (total <= getPassengers()) {
            System.out.println("Автомобиль способен перевезти данное количество пассажиров!");
        } else
            System.out.println("Вам нужен автомобиль большей вместительности!");
        System.out.println("---------------------------");
    }

}
