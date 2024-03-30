public class Transport {
    private int power;
    private int maxspeed;
    private int weight;
    private String brend;

    public Transport(int power, int maxspeed, int weight, String brend) {
        this.power = power;
        this.maxspeed = maxspeed;
        this.weight = weight;
        this.brend = brend;
    }

    public String toString() {
        return "Transport{power=" + this.power + ", maxspeed=" + this.maxspeed + ", weight=" + this.weight + ", brend='" + this.brend + "'}";
    }

    public int getPower() {
        return this.power;
    }

    public int getMaxspeed() {
        return this.maxspeed;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getBrend() {
        return this.brend;
    }

    public double powerinkW() {
        return (double)this.getPower() * 0.74;
    }

    public void display() {
        System.out.printf("power: %d h.p., maxspeed: %d km/h, weight: %d kg, brend: %s; powerinkW: %.2f; ", this.power, this.maxspeed, this.weight, this.brend, this.powerinkW());
    }
}
