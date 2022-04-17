package kachanovich.lesson9.examcloudsTasks.task4;

import java.util.Scanner;

public class Task4 {
    /*
    4. Найти два средних знака строки
    Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака. Например, если дана
    строка "string"  результат будет "ri", для строки "code" результат "od",  для "Practice" результат "ct".
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (str.length() % 2 != 0) {
            System.out.println("The number of characters in the string is odd");
            System.exit(0);
        }
        System.out.println(str.charAt(str.length() / 2 - 1) + "" + str.charAt(str.length() / 2));
    }
}
