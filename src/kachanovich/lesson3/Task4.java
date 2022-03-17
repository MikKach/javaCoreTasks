package kachanovich.lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int value1 = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int value2 = scanner.nextInt();
        System.out.println("Введите число 3: ");
        int value3 = scanner.nextInt();
        int num = 0;
        if (value1 > 0) {
            num++;
        }
        if (value2 > 0) {
            num++;
        }
        if (value3 > 0) {
            num++;
        }
        System.out.println("Количество положительных чисел в наборе " + num);
    }
}
