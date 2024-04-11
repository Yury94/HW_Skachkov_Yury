public class GroundTransport extends Transport{
    private int wheels;
    private double fuel;

    public GroundTransport(int power, int maxspeed, int weight, String brend, int wheels, double fuel) {
        super(power, maxspeed, weight, brend);
        this.wheels = wheels;
        this.fuel = fuel;
    }

    public double getFuel() {
        return this.fuel;
    }

    public void display() {
        super.display();
        System.out.printf("wheels: %d items, fuel: %.2f l/100, ", this.wheels, this.getFuel());
    }
}

