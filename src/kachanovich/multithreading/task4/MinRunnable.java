package kachanovich.multithreading.task4;

public class MinRunnable implements Runnable {
    int[] array;

    public MinRunnable(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        synchronized (array) {
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            MaxMinTaskRun.minMain = min;
        }
    }
}
