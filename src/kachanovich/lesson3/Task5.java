package kachanovich.lesson3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int value1 = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int value2 = scanner.nextInt();
        System.out.println("Введите число 3: ");
        int value3 = scanner.nextInt();
        int positiveNumber = 0;
        int negativeNumber = 0;
        if (value1 > 0) {
            positiveNumber++;
        }
        else {
            negativeNumber++;
        }
        if (value2 > 0) {
            positiveNumber++;
        }
        else {
            negativeNumber++;
        }
        if (value3 > 0) {
            positiveNumber++;
        }
        else {
            negativeNumber++;
        }
        System.out.println("Количество положительных чисел в наборе " + positiveNumber);
        System.out.println("Количество отрицательных чисел в наборе " + negativeNumber);
    }
}
