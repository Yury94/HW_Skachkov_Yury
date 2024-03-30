import java.util.Scanner;

public class GroundTruck extends GroundTransport{
    private double carring;

    public GroundTruck(int power, int maxspeed, int weight, String brend, int wheels, double fuel, double carring) {
        super(power, maxspeed, weight, brend, wheels, fuel);
        this.carring = carring;
    }

    public void display() {
        super.display();
        System.out.printf("carring: %.3f t;\n", this.carring);
    }

    public void cargo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight of cargo (kg):");
        float wOfCargo = scan.nextFloat();
        if (wOfCargo <= (float)this.getWeight()) {
            System.out.println("Truck loaded");
        } else {
            System.out.println("You need another truck");
        }

        System.out.println("---------------------------");
    }
}
