package MyPackage;
import java.util.Scanner;

    public class Zadanie_1 {
    public static void main(String[] args) {
        printOddNumbers();
    }

    public static void printOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int index = 1; // Индекс текущего числа

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) break; // Завершаем ввод

            if (index % 2 != 0) {
                System.out.println(number); // Выводим нечетные элементы
            }

            index++;
        }
    }
}