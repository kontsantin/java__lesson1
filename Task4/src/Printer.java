// Задача 4*. Нахождение максимального из трех чисел Реализуйте две функции:
// 1. Функция findMaxOfTwo должна принимать два числа и возвращать
// максимальное из них, используя только знак сравнения.
// 2. Функция findMaxOfThree должна принимать три числа и находить
// максимальное из них, используя первую функцию

class Answer {
    // Функция для нахождения максимума из двух чисел
    public int findMaxOfTwo(int a, int b) {
        if (a < b) {
            return b;
        }
        return a;
    }

    // Функция для нахождения максимума из трех чисел
    public int findMaxOfThree(int a, int b, int c) {
        if (a < b) {
            return b < c ? c : b;

        }
        return a;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int a = 515, b = 10, c = 3;
        if (args.length == 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        }
        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.findMaxOfThree(a, b, c);
        System.out.println(itresume_res);
    }
}