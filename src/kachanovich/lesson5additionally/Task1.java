package kachanovich.lesson5additionally;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    /*
    1) Найти произведение элементов, кратных 3.
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
        long mult = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.printf("%d ",array[i]);
                mult *= array[i];
            }
        }
        System.out.println();
        System.out.printf("Произведение элементов кратных 3 равно %d\n", mult);
    }
}
