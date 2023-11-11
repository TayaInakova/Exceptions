package homeworks.hw2.tasks;

// Напишите программу, которая вычисляет значение выражения intArray[8] / d,
// гдеintArray- массив целых чисел, а d - делитель.
//Программа проверяет, имеется ли в массиве intArray элемент с индексом 8,
// и если нет, выводит сообщение о невозможности выполнения операции.
//Также программа проверяет, равен ли делитель d нулю, и если да, выводит соответствующее сообщение.
public class Task2 {
    public static double task2(int[] intArray, int d) {
        try {
            if (d == 0) {
                throw new RuntimeException("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            } else if (intArray.length < 9) {
                throw new RuntimeException("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            } else {
                double result = (double) (intArray[8] / d);
                System.out.printf("intArray[8] / d = %d / %d = %.1f\n", intArray[8], d, result);
                return result;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Double.NaN;
        }
    }
}
