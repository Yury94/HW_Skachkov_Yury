import java.util.Scanner;

public class GroundTruck extends GroundTransport{

    private double carring;//обьявление переменной - грузоподьемность (т)
    public GroundTruck(int power, int maxspeed, int weight, String brend, int wheels, double fuel, double carring) {
        super(power, maxspeed, weight, brend, wheels, fuel);
        this.carring = carring;
    }

    public void display() {
        super.display();
        System.out.printf("carring: %.3f t;\n", carring);
    }

    public void cargo() {//метод рассчета перевозимого груза
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите массу перевозимого груза в килограммах:");//вводим время движения
        float wOfCargo = scan.nextFloat();
        if (wOfCargo <= getWeight()) {
            System.out.println("Грузовик загружен");
        } else
            System.out.println("Вам нужен грузовик побольше");
        System.out.println("---------------------------");
    }
}
