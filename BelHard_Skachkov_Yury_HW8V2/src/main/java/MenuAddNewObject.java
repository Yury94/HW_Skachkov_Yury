import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuAddNewObject {
    public static ArrayList<Transport> unitCar = new ArrayList<>();

    public static void addNewObject() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 or 0:\n 1.Add object, 0 - Exit \n");
        int score = scanner.nextInt();
        while (score == 1) {
            System.out.println("Enter parameters new object:\n Enter power car:  ");
            int power = scanner.nextInt();
            System.out.println("Enter maxspeed car: ");
            int maxspeed = scanner.nextInt();
            System.out.println("Enter weight car: ");
            int weight = scanner.nextInt();
            System.out.println("Enter brend car: \nChoose brend: 1. BMW, 2. Honda, 3. Mazda");
            Scanner scanner1 = new Scanner(System.in);
            String brend = scanner1.nextLine();
            unitCar.add(new Transport(power, maxspeed, weight, brend));
            System.out.println("Do you want new object? Enter 1 or 0:\n 1.Add object, 0 - Exit \n");
            score = scanner.nextInt();
        }
        if (score == 0) {
            FileProcessorWriteRead.writingData(unitCar);
            System.out.println("Data will be saved!");
        } else {
            System.out.println("Sorry, you entered incorrect number. Data will not be saved!");
        }
    }
}
