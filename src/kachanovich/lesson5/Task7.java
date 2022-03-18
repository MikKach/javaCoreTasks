package kachanovich.lesson5;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 16);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Элемент массива " + max + " максимальный и его индекс " + index);
    }
}
