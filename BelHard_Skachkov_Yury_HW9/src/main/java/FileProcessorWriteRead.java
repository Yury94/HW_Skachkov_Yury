import java.io.*;
import java.util.ArrayList;


public class FileProcessorWriteRead {
    public static void writingData(ArrayList<Transport> unitCar) throws IOException {
        FileWriter writer = new FileWriter("src/main/java/resources/FileWriter.txt", false);
        writer.write(String.valueOf(unitCar));
        writer.write("\n");
        writer.close();
    }

    public static void readingData() {
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