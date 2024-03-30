import java.io.IOException;

public class Main {
    public static void main(String[] args) throws CountOfPassengersAreAlreadyPlus, IOException {

        AnyTransport.readingData();
        GroundTransportPassengers carAudi = new GroundTransportPassengers(150, 180, 1600, "Audi", 4, 9.8, "Sedan", 5);
        System.out.println("\nCharacteristics for passenger vehicles:\n");
        carAudi.display();
        carAudi.countPlaces();
        carAudi.way();

        GroundTruck man = new GroundTruck(500, 200, 20000, "MAN", 6, 13.7, 56.7);
        System.out.println("Characteristics for truck:\n");
        man.display();
        man.cargo();
        AnyTransport.addNewObject();
    }
}