package kachanovich.lesson5;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        double[] array3 = new double[10];
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(0, 10);
            array2[i] = random.nextInt(0, 10);
            if (array2[i] == 0) {
                array3[i] = 0;
            } else {
                array3[i] = (double) array1[i] / array2[i];
            }
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] == (int) array3[i] && array3[i] != 0) {
                System.out.print((int)array3[i] + " ");
            }
        }
    }
}
