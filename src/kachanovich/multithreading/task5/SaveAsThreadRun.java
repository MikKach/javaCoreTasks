package kachanovich.multithreading.task5;

public class SaveAsThreadRun {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {6, 5, 4, 3, 2, 1};
        int[] array3 = {7, 8, 9,};
        SaveAsThread saveAsThread1 = new SaveAsThread(array1);
        SaveAsThread saveAsThread2 = new SaveAsThread(array2);
        SaveAsThread saveAsThread3 = new SaveAsThread(array3);
        Thread thread1 = new Thread(saveAsThread1);
        Thread thread2 = new Thread(saveAsThread2);
        Thread thread3 = new Thread(saveAsThread3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
