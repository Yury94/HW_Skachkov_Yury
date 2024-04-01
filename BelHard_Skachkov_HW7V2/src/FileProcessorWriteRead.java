import java.io.*;
import java.util.ArrayList;

public class FileProcessorWriteRead {
    public static void writingData(ArrayList<Transport> unitCar) throws IOException {
        FileWriter writer = new FileWriter("src/resources/FileWriter.txt", false);
        writer.write(String.valueOf(unitCar));
        writer.write("\n");
        writer.close();
    }

    public static void readingData() {
        try (FileInputStream reader = new FileInputStream("src/resources/FileWriter.txt");
             BufferedReader buffered = new BufferedReader(new InputStreamReader(reader))) {//читаем из оперативы
            String i;
            while ((i = buffered.readLine()) != null) {//считываем каждый байт в переменную i до тех пор пока i не станет пустым
                System.out.print(i + "test");//добавил приставку test чтобы понимать, что я читаю из оперативной памяти
            }
        } catch (IOException ex) {
            throw new RuntimeException();
        }
    }
}
