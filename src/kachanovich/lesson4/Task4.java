package kachanovich.lesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int value1 = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int value2 = scanner.nextInt();
        int mult = 0;
        for (int i = 0; i < value2; i++) {
            mult += value1;
        }
        System.out.println(value1 + " * " + value2 + " = " + mult);
    }
}
