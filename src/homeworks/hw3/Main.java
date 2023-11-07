package homeworks.hw3;

import homeworks.hw3.data.Data;
import homeworks.hw3.data.WriteToFile;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data("Перов", "Пётр", "Петрович",
                "12.12.2000", "89536005555", "m");
        Data data2 = new Data("Иванов", "Иван", "Иваноич",
                "12.12.2001", "89536005555", "m");
        Data data3 = new Data("Иванов", "Сергей", "Иваноич",
                "12.12.2002", "89536005555", "m");
        WriteToFile.writeToFile(data1);
        WriteToFile.writeToFile(data2);
        WriteToFile.writeToFile(data3);
    }
}
