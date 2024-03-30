import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnyTransport {

    public static void addNewObject() throws IOException{
        ArrayList<Transport> unitCar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 or 0:\n 1.Add object, 0 - Exit \n");
        int score = scanner.nextInt();
        while (score == 1) {
            System.out.println("Enter parameters new object: ");
            System.out.println("Enter power car: ");
            int power = scanner.nextInt();
            System.out.println("Enter maxspeed car: ");
            int maxspeed = scanner.nextInt();
            System.out.println("Enter weight car: ");
            int weight = scanner.nextInt();
            System.out.println("Enter brend car: ");
            System.out.println("Choose brend: 1. BMW, 2. Honda, 3. Mazda");
            Scanner scanner1 = new Scanner(System.in);
            String brend = scanner1.nextLine();
            unitCar.add(new Transport(power, maxspeed, weight, brend));
            System.out.println("Do you want new object? Enter 1 or 0:\n 1.Add object, 0 - Exit \n");
            score = scanner.nextInt();
        }
        if (score == 0) {
            System.out.println("Data saved!");
            FileWriter writer = new FileWriter("src/main/java/resources/FileWriter.txt", false);
            writer.write(String.valueOf(unitCar));
            writer.write("\n");
            writer.close();
        } else {
            System.out.println("Sorry, you entered incorrect number");
        }
    }

    public static void readingData() throws RuntimeException {
        try (FileReader reader = new FileReader("src/main/java/resources/FileWriter.txt")) {
            int i;//считываем каждый байт в переменную i
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);//
            }
        } catch (IOException ex) {
            throw new RuntimeException();
        }
    }
}

