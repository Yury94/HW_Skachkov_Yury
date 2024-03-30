import java.io.IOException;
import java.util.Scanner;

public class MenuAddNewObject {
    public static void addNewObject() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 or 0:\n 1.Add object, 0 - Exit \n");
        int score;
        for(score = scanner.nextInt(); score == 1; score = scanner.nextInt()) {
            FileProcessorWriteRead.writingData();
            System.out.println("Do you want new object? Enter 1 or 0:\n 1.Add object, 0 - Exit \n");
        }
        if (score == 0) {
            System.out.println("Data will be saved!");
        } else {
            System.out.println("Sorry, you entered incorrect number. Data will not be saved!");
        }

    }
}
