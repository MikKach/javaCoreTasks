package kachanovich.multithreading.task4;

import java.util.Scanner;

public class MaxMinTaskRun {
    static int maxMain = 0, minMain = 0;

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите пять чисел");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Thread thread1 = new Thread(new MaxRunnable(array));
        Thread thread2 = new Thread(new MinRunnable(array));
        thread1.start();
        thread2.start();
        System.out.println("max="+maxMain);
        System.out.println("min=" + minMain);
    }
}
