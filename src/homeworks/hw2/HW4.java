package homeworks.hw2;
// Напишите программу, которая принимает символ a в качестве аргумента и выполняет следующую проверку:
//если символ a равен пробелу '', программа должна выбрасывать исключение с сообщением
//"Пустая строка введена.".
//В противном случае программа должна возвращать сообщение
//"Ваш ввод - [символ]", где [символ] заменяется на введенный символ a.
public class HW4 {
    public static String expr(char a) throws Exception {
// Введите свое решение ниже
        try {
            if (a == ' ') {
                throw new RuntimeException("Пустая строка введена.");
            } else return String.format("Your input was - %s", a);
        }
        catch (RuntimeException e) {
            return e.getMessage();
        }
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

