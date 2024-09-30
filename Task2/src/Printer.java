class Answer {
    public  void printEvenNums() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i); 
            } 
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        ans.printEvenNums();
    }
}
