package homeworks.hw2.tasks;

import java.util.Scanner;

public class InputEmptyString {
    public static void inputString() {
        String input = askToInput();
        try {
            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя.");
            } else {
                System.out.printf("Вы ввели \"%s\"\n", input);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static String askToInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите строку: ");
        return s.nextLine();
    }
}
