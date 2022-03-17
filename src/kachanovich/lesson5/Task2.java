package kachanovich.lesson5;

public class Task2 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                num++;
            }
        }
        int[] array = new int[num];
        int index = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                array[index] = i;
                index++;
            }
        }
    }
}
