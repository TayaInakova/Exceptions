package homeworks.hw3;

import homeworks.hw3.data.Data;
import homeworks.hw3.data.WriteToFile;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Data data = new Data();
            WriteToFile.writeToFile(data);
        }
    }
}
