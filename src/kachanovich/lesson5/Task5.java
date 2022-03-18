package kachanovich.lesson5;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(0, 15);
            array2[i] = random.nextInt(0, 15);
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        int average1 = 0;
        int average2 = 0;
        for (int element : array1) {
            average1 += element;
        }
        average1 = average1 / 5;
        for (int element : array2) {
            average2 += element;
        }
        average2 = average2 / 5;
        if (average1 == average2) {
            System.out.println("Средние арифметические равны");
        } else {
            average1 = average1 > average2 ? 1 : 2;
            System.out.println("Для массива " + average1 + " среднее арифметическое больше");
        }
    }
}
