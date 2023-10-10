package homeworks.hw2.tasks;

public class Task2 {
    public static void task2() {
        int[] intArray = new int[]{96, 93, 65, 45, 40, 29, 68, 30, 27, 14};
        try {
            int d = 0;
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
