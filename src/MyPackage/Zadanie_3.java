package MyPackage;

import java.util.Scanner;

public class Zadanie_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printDigitsRightToLeft(number);
    }

    public static void printDigitsRightToLeft(int number) {
        if (number < 10) {
            System.out.println(number); // Базовый случай: одна цифра
        } else {
            System.out.println(number % 10);    // Печатаем текущую цифру
            printDigitsRightToLeft(number / 10); // Печатаем оставшуюся часть
        }
    }
}
