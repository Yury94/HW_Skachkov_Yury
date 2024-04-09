import java.util.Scanner;

public class GroundTransportPassengers extends GroundTransport{

    private String type;//обьявление переменной - Тип кузова (Седан, универсал & so on)
    private int passengers;//обьявление переменной - Количество пассажиров

    public GroundTransportPassengers(int power, int maxspeed, int weight, String brend, int wheels, double fuel, String type, int passengers) {
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

    public boolean countPlaces() throws CountOfPassengersAreAlreadyPlus {//метод рассчета вместимости пассажиров
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of passengers: ");//вводим время движения
        int total = scan.nextInt();//задаем необходимое количество мест для перевозки пассажиров
        if (total <= getPassengers() && total >= 0) {
            System.out.println("The car is capable of carrying a given number of passengers!");
            return true;
        }
        if (total > getPassengers()) {
            System.out.println("\nYou need another car!\n");
            return true;
        } else {
            throw new CountOfPassengersAreAlreadyPlus("The number of passengers cannot be negative!");//ссылка на конструктор
        }
    }

    public double oil(double road) {//метод double oil() использует расчет переменной double road
        return road / 100 * getFuel();//расчет расхода топлива
    }

    public void way() {//метод рассчета пути за заданное время с максимальной скоростью
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of hours to calculate the route: ");//вводим время движения
        double time = scan.nextDouble();
        double road = getMaxspeed() * time;//рассчет расстояния
        System.out.printf("During %.2f ч, car %s, moving at top speed %s km/h, " +
                "will pass %.2f km and will use up %.2f liters of fuel.\n", time, getBrend(), getMaxspeed(), road, oil(road));
        System.out.println("---------------------------");
    }
}
