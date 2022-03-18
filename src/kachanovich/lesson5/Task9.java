package kachanovich.lesson5;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        while (true) {
            System.out.print("Введите положительное число: ");
            value = scanner.nextInt();
            if (value > 0) {
                break;
            } else {
                System.out.println("Неверное число.");
            }
        }
        int[] array = new int[value];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 16);
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sum1 += array[i];
            if (value % 2 == 0) {
                sum2 += array[(array.length / 2) + i];
            } else {
                sum2 += array[((array.length / 2) + 1) + i];
            }
        }
        if (sum1 == sum2 && value > 1) {
            System.out.println("Суммы равны");
        } else if (sum1 > sum2 && value > 1) {
            System.out.println("Левая часть больше");
        } else if (sum1 < sum2 && value > 1) {
            System.out.println("Правая часть больше");
        }
        else {
            System.out.println("В массиве один элемент.");
        }
    }
}
