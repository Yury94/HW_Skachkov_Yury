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

    @Override
    public String toString() {//переопределили метод toString()
        return "Transport{" +
                "power=" + power +
                ", maxspeed=" + maxspeed +
                ", weight=" + weight +
                ", brend='" + brend + '\'' +
                '}';
    }

    public int getPower() {//расширяем доступ переменной
        return power;
    }

    public int getMaxspeed() {//расширяем доступ переменной
        return maxspeed;
    }

    public int getWeight() {//расширяем доступ переменной
        return weight;
    }

    public String getBrend() {//расширяем доступ переменной
        return brend;
    }

    public double powerinkW() {//методу присвоен результат расчета
        return getPower() * 0.74;//производим вычисление параметра расчета можности в кВт;
    }

    public void display() {
        System.out.printf("power: %d h.p., maxspeed: %d km/h, weight: %d kg, brend: %s; powerinkW: %.2f; \n",
                power, maxspeed, weight, brend, powerinkW());
    }
}

