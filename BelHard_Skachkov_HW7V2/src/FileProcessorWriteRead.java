import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessorWriteRead {
    public static void writingData() throws IOException {
        ArrayList<Transport> unitCar = new ArrayList();
        Scanner scanner = new Scanner(System.in);
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
        FileWriter writer = new FileWriter("src/resources/FileWriter.txt", false);
        writer.write(String.valueOf(unitCar));
        writer.write("\n");
        writer.close();
    }

    public static void readingData() {
        try (FileReader reader = new FileReader("src/resources/FileWriter.txt")) {
            int i;//считываем каждый байт в переменную i
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);//
            }
        } catch (IOException ex) {
            throw new RuntimeException();
        }
    }
}
