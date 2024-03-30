public class Main {
    public static void main(String[] args) {

    Transport carAudi = new Transport(150, 180, 1600, "Audi", "Sedan", 5);
    System.out.printf("Характеристики для легкового автотранспорта:\n");

    carAudi.display();
    carAudi.countPlaces();



    }
}