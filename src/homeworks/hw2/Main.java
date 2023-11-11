package homeworks.hw2;

import homeworks.hw2.tasks.*;

public class Main {
    public static void main(String[] args) {
        InputFloat.inputFloat();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Task2.task2(arr, 1);
        Task3.task3();
        InputEmptyString.inputString();
        System.out.println(HW3.expr(12, 5));

    }
}
