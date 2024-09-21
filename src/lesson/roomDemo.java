package lesson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class roomDemo {

    private static void parseRooms (Scanner s) {
        var line = s.nextLine();
        while (!line.equals("#0")) {
            System.out.println(line);   // заглушка
            line = s.nextLine();
        }
    }

    public static void main(String[] args) {
        try {
            var scanner = new Scanner(new File("src/resources/school.are"));
            int count = 0;  // заглушка
            while (scanner.hasNextLine()) {
                var line = scanner.nextLine();
                if (line.equals("#ROOMS")) {
                    System.out.printf("Обработано строк до секции - %d строк\n", count);
                    count = 0;
                    parseRooms(scanner);
                    continue;
                }
                count++;
            }
            System.out.printf("Обработано строк после секции - %d строк\n", count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
