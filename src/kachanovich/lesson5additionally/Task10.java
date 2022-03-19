package kachanovich.lesson5additionally;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    /*
    10) Найти максимальный элемент в массиве и поменять его местами с нулевым
элементом
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
        int index = 0;
        int max = array[index];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        array[index] = array[0];
        array[0] = max;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
