package kachanovich.multithreading.task4;

public class MaxRunnable implements Runnable {
    int[] array;



    public MaxRunnable(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        synchronized (array) {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
           MaxMinTaskRun.maxMain = max;
        }
    }
}
