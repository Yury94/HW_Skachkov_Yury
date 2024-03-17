//Обьявить и проинициализировать переменные, всех вам известных типов и вывести их значения на экран.
public class Task2 {
    public static void main(String[] args) {
        String month = "April";
        byte small = 127;
        short bigger = 500;
        int big = 371942831;
        long biggest = 999999999;
        float exactly = 56.9f;
        double moreExactly = 45678.345678;
        boolean bin = true, bin2 = false;
        char letter = 'f';
        System.out.printf("%s, %s, %s, %s, %s, %s, %s, %s/%s, %s,", month, small, bigger, big, biggest, exactly,
                moreExactly, bin, bin2, letter);
    }
}
