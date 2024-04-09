import java.io.IOException;

public class Main {
    public static void main(String[] args) throws CountOfPassangersAreAlreadyPlus, IOException {

        AnyTransport.readingData();
        GroundTrPass carAudi = new GroundTrPass(150, 180, 1600, "Audi", 4, 9.8, "Sedan", 5);
        System.out.println("\nХарактеристики для легкового автотранспорта:\n");
//        carAudi.display();
//        carAudi.countPlaces();
//        carAudi.way();

        GroundTruck man = new GroundTruck(500, 200, 20000, "MAN", 6, 13.7, 56.7);
        System.out.println("Характеристики для грузового автотранспорта:\n");
//        man.display();
//        man.cargo();
        AnyTransport.addNewObject();
    }
}