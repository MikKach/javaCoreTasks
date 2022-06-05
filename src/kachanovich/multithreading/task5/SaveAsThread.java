package kachanovich.multithreading.task5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class SaveAsThread implements Runnable {
    /*
    Условие задачи. Заданы три целочисленных массива. Записать эти массивы в файл в паралельних потоках.
     Создать класс SaveAsThread для представления потока, который записывает целочисленный массив в файл.

     */
    private int[] array;
    Object lock = new Object();

    public SaveAsThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try (FileWriter fileWriter = new FileWriter("lessonMultiThreadingTask5.txt", true)){
                fileWriter.append(Thread.currentThread().getName());
                fileWriter.append("\n");
                for (int i = 0; i < array.length; i++) {
                fileWriter.append(Integer.toString(array[i]));
                fileWriter.append(" ");
                }
                fileWriter.append("\n");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
