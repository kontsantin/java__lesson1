class Answer {
    public int sumDigits(int n) {
        int sum = 0;              
        while (n>0) {
            sum += n % 10;
            n = n/10;
        }
        return sum;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int n = 666;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.sumDigits(n);
        System.out.println(itresume_res);
    }
}

