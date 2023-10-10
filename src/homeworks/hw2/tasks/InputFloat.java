package homeworks.hw2.tasks;

import java.util.Scanner;

public class InputFloat {
    public static void inputFloat() {
        try {
            float f = Float.parseFloat(askToInput());
            System.out.println(f);
        } catch (Exception e) {
            System.out.println("Введено некорректное число, попробуйте ещё раз.\n");
            inputFloat();
        }
    }

    private static String askToInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        String data = s.next();
        data.replace(" ", "");
        return data;
    }
}
