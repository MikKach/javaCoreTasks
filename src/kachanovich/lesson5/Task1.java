package kachanovich.lesson5;

public class Task1 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 2; i < 21; i++) {
            if (i % 2 == 0) {
                num++;
            }
        }
        int[] array = new int[num];
        int index = 0;
        for (int i = 2; i < 21; i++) {
            if (i % 2 == 0) {
                array[index] = i;
                index++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
