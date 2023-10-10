package homeworks.hw1;

import java.util.Arrays;

class Answer2 {
    public int[] subArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        int[] res = {};
        if (a.length != b.length) res = new int[]{0};
        else {
            res = new int[a.length];
            for (int i = 0; i < a.length; i++) res[i] = a[i] - b[i];
        }
        return res;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{4, 5, 6};
            b = new int[]{1, 2, 3};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer2 ans = new Answer2();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
    }
}