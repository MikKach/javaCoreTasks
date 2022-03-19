package kachanovich.lesson5additionally;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    /*
    2) Найти среднее арифметическое элементов с нечетными номерами.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray;
        while (true) {
            System.out.print("Введите размер массива: ");
            sizeArray = scanner.nextInt();
            if (sizeArray > 1) {
                break;
            } else {
                System.out.println("Размер массива не может быть меньше единицы.");
            }
        }
        int[] array = new int[sizeArray];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
        int average = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", array[i]);
                average += array[i];
                num++;
            }
        }
        System.out.printf("\nСреднее арифметическое %d", average / num);
    }
}
