import java.util.Scanner;

public class GroundTransportPassengers extends GroundTransport{
    private String type;
    private int passengers;

    public GroundTransportPassengers(int power, int maxspeed, int weight, String brend, int wheels, double fuel, String type, int passengers) {
        super(power, maxspeed, weight, brend, wheels, fuel);
        this.type = type;
        this.passengers = passengers;
    }

    public int getPassengers() {
        return this.passengers;
    }

    public void display() {
        super.display();
        System.out.printf("passengers: %d items, type: %s;\n", this.passengers, this.type);
    }

    public boolean countPlaces() throws CountOfPassengersAreAlreadyPlus {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of passengers: ");
        int total = scan.nextInt();
        if (total <= this.getPassengers() && total >= 0) {
            System.out.println("The car is capable of carrying a given number of passengers!");
            return true;
        } else if (total > this.getPassengers()) {
            System.out.println("You need another car!\n");
            return true;
        } else {
            throw new CountOfPassengersAreAlreadyPlus("The number of passengers cannot be negative!");
        }
    }

    private double oil(double road) {
        return road / 100.0 * this.getFuel();
    }

    public void way() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of hours to calculate the route: ");
        double time = scan.nextDouble();
        double road = (double)this.getMaxspeed() * time;
        System.out.printf("During %.2f h, car %s, moving at top speed %s km/h, will pass %.2f km and will use up %.2f liters of fuel.\n", time, this.getBrend(), this.getMaxspeed(), road, this.oil(road));
        System.out.println("---------------------------");
    }
}
