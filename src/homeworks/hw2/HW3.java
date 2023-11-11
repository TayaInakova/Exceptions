package homeworks.hw2;

// Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
//При этом программа должна проверить, что делитель b не равен нулю,
// и выполнить деление только в этом случае.
//Если b равен нулю, программа должна вывести сообщение о невозможности
// выполнения операции и вернуть результат равный нулю.
//После выполнения операции деления, программа также должна вывести
// сумму чисел a и b с помощью метода printSum.
public class HW3 {
    public static double expr(int a, int b) {
        // Введите свое решение ниже
        printSum(a, b);
        try {
            if (b == 0) {
                throw new RuntimeException("На ноль делить нельзя");
            } else {
                return (double) a / (double) b;
            }
        } catch (Exception e) {
            return 0;
        }
    }

    public static void printSum(int a, int b) {
        // Введите свое решение ниже
        System.out.println(a + b);
    }
}
