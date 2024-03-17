public class GroundTransport extends Transport{

        private int wheels;//обьявление переменной - количество колес (шт)
        private double fuel;//обьявление переменной - расход топлива (л/100 км)

        public GroundTransport(int power, int maxspeed, int weight, String brend, int wheels, double fuel) {
            super(power, maxspeed, weight, brend);//super - ссылка на конструктор родителя Transport
            this.wheels = wheels;//добавляем конструктору количество колес
            this.fuel = fuel;//добавляем конструктору рас
        }

        public double getFuel() {
            return fuel;
        }

        public void display() {
            super.display();
            System.out.printf("wheels: %d items, fuel: %.2f l/100, ", wheels, getFuel());
        }

}
