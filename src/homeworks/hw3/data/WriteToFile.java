package homeworks.hw3.data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void writeToFile(Data data) {
        File f = new File(String.format("src/homeworks/hw3/data/profile/" + data.getLastName()));
        try (FileWriter writer = new FileWriter(data.getLastName(), true)) {
            writer.write(String.format("<%s><%s><%s><%s><%s><%s>\n", data.getLastName(), data.getFirstName(),
                    data.getPatronymic(), data.getDateOfBirth(), data.getPhoneNumber(), data.getGender()));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

