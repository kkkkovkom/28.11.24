package MyPackage;

import java.util.Scanner;

public class Zadanie_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printDigitsLeftToRight(number);
    }

    public static void printDigitsLeftToRight(int number) {
        if (number < 10) {
            System.out.println(number); // Базовый случай: одна цифра
        } else {
            printDigitsLeftToRight(number / 10); // Печатаем все цифры слева
            System.out.println(number % 10);    // Печатаем текущую цифру
        }
    }
}