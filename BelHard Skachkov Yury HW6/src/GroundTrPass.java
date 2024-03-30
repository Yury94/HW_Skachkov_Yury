import java.util.Scanner;

public class GroundTrPass extends GroundTransport {
    private String type;//обьявление переменной - Тип кузова (Седан, универсал & so on)
    private int passengers;//обьявление переменной - Количество пассажиров

    public GroundTrPass(int power, int maxspeed, int weight, String brend, int wheels, double fuel, String type, int passengers) {
        super(power, maxspeed, weight, brend, wheels, fuel);
        this.type = type;
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void display() {
        super.display();
        System.out.printf("passengers: %d items, type: %s;\n", passengers, type);
    }

    public boolean countPlaces() throws CountOfPassangersAreAlreadyPlus {//метод рассчета вместимости пассажиров
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите необходимое количество пассажиров для перевозки: ");//вводим время движения
        int total = scan.nextInt();//задаем необходимое количество мест для перевозки пассажиров
        if (total <= getPassengers() && total >= 0) {
            System.out.println("Автомобиль способен перевезти данное количество пассажиров!");
            return true;
        }
        if (total > getPassengers()) {
            System.out.println("\nВам нужен автомобиль большей вместительности!\n");
            return true;
        } else {
                throw new CountOfPassangersAreAlreadyPlus("Количество пассажиров не может быть отрицательным!");//ссылка на конструктор
            }
        }

    private double oil(double road) {//метод double oil() использует расчет переменной double road
        return road / 100 * getFuel();//расчет расхода топлива
    }

    public void way() {//метод рассчета пути за заданное время с максимальной скоростью
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество часов для рассчета пути: ");//вводим время движения
        double time = scan.nextDouble();
        double road = getMaxspeed() * time;//рассчет расстояния
        System.out.printf("За время %.2f ч, автомобиль %s, двигаясь с максимальной скоростью %s км/ч, " +
                "проедет %.2f км и израсходует %.2f литров топлива.\n", time, getBrend(), getMaxspeed(), road, oil(road));
        System.out.println("---------------------------");
    }
}
