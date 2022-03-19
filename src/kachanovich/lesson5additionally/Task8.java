package kachanovich.lesson5additionally;

import java.util.Random;
import java.util.Scanner;

public class Task8 {
    /*
    8) Найти второй по величине (т.е. следующий по величине за максимальным)
элемент в массиве.
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
        int max = array[0];
        int lessMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                lessMax = max;
                max = array[i];
            }
            if ((max != array[i]) && (lessMax < array[i])) {
                lessMax = array[i];
            }
        }
        System.out.printf("Второй по величине (т.е. следующий по величине за максимальным) элемент в массиве %d", lessMax);
    }
}
