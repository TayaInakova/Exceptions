package homeworks.hw1;

import java.util.Arrays;

class Answer3 {
    public int[] divArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        int[] res = {};
        if (a.length != b.length) {
            return res = new int[]{0};
        }
        else {
            res = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                if (b[i] != 0) {
                    res[i] = a[i] / b[i];
                } else {
                    throw new RuntimeException("На ноль делить нельзя!");
                }
            }
            return res;
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task3 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 0};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer3 ans = new Answer3();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}