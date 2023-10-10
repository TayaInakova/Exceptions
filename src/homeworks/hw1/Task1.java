package homeworks.hw1;

class Answer1 {
    public void arrayOutOfBoundsException() {
        int[] arr = new int[5];
        for (int i = 0; i <= arr.length; i++) arr[i] = 1;
    }

    public void divisionByZero() {
        int a = 3;
        int b = 0;
        int res = a / b;
    }

    public void numberFormatException() {
        int num = Integer.parseInt("one");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Answer1 ans = new Answer1();
        try {
            ans.arrayOutOfBoundsException();
        } catch (Exception e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}