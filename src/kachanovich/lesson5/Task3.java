package kachanovich.lesson5;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 99);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                num++;
            }
        }
        System.out.println("Количество четных элементов в массиве " + num);
    }
}
