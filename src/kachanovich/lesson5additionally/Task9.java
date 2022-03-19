package kachanovich.lesson5additionally;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    /*
    9) Найти наименьший элемент среди элементов с четными индексами массива
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
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if ((i % 2 == 0) && (min > array[i])) {
                min = array[i];
            }
        }
        System.out.printf("Наименьший элемент среди элементов с четным индексом %d\n",min);
    }
}
