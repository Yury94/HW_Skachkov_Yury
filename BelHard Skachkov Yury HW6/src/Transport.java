//Для объекта, созданного в предыдущем задании, разработайте иерархию классов, выберите несколько подобных объектов,
// создайте для них родительский класс с общими свойствами и методами, напишите свои реализации свойств и методов для схожих объектов.
// Следуйте принципам ООП
//* Добавьте возможность пользователю вводить какие-то свойства ваших объектов в консоли и выводить их в консоль.
//Добавьте обработку исключений.

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

    public int getPower() {//расширяем доступ переменной
        return power;
    }

    public int getMaxspeed() {//расширяем доступ переменной
        return power;
    }

    public int getWeight() {//расширяем доступ переменной
        return power;
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
