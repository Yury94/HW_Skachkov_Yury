//Запросить на ввод строку, ввести произвольный текст с клавиатуры и вывести
// на экран результат работы всех рассмотренных методолв работы со строками.


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите произвольный текст: ");//вводим текст с клавиатуры
        String text = scan.nextLine();
        System.out.println("Вы ввели:" + text);
        int stringLength = text.length();
        System.out.println("Количество символов в строке = " + stringLength);
        boolean stringisEmpty = text.isEmpty();
        System.out.println("Пустая ли строка? - " + stringisEmpty);
        char charNr7 = text.charAt(7);
        System.out.println("Какой символ является 8-ым по счету? Ответ: " + charNr7 + ";");
        System.out.println("-------------------------------");
        System.out.print("Введите второй произвольный текст: ");//вводим текст с клавиатуры
        String text2 = scan.nextLine();
        boolean stringAreEquals = text.equals(text2);
        System.out.println("Строки совпадают? - " + stringAreEquals);
        System.out.println("-------------------------------");
        System.out.print("Введите первый произвольный текст с измененным регистром: ");
        String text3 = scan.nextLine();
        boolean stringAreEqualsCaseInsensitive = text.equalsIgnoreCase(text3);
        System.out.println("Строки одинаковы? - " + stringAreEqualsCaseInsensitive);
        System.out.println("-------------------------------");
        boolean startsWithThis = text.startsWith("This");
        boolean endsWithMine = text.endsWith("mine");
        boolean containsMany = text.contains("many");
        System.out.println("Текст начинается с This? - " + startsWithThis + "\nТекст заканчивается на mine? - " + endsWithMine
                + "\nTекст содержит mane? - " + containsMany);
        System.out.println("-------------------------------");
        String updatedString = text.replace('a', 'A');
        String newUpdatedString = text.replace("is","");
        System.out.println("Обновленный текст, где \"a\" заменили на \"A\" - " + updatedString);
        System.out.println("Обновленный текст без \"is\" - " + newUpdatedString);
        System.out.println("-------------------------------");
        String lowerCaseString = text.toLowerCase();
        System.out.printf("Вывести первый текст \"%s\" прописными буквами - \"%s\"\n", text, lowerCaseString);
        System.out.println("-------------------------------");
        String city = "Минск";
        String street = "Казимировская";
        int houseNr = 21;
        System.out.printf("Моё место жительства: город %s, улица %s, дом %d.\n", city, street, houseNr);
        System.out.println("-------------------------------");
        System.out.println("Проверка работы метода \".append()\"");
        StringBuffer mutableString = new StringBuffer("Привет! ");
        mutableString.append("Меня зовут ");
        mutableString.append("Юрий!");
        System.out.println(mutableString);
    }
}
