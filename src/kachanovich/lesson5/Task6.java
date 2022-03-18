package kachanovich.lesson5;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        boolean bul = true;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 11);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                bul = false;
                break;
            }
        }
        if(bul){
            System.out.println("Массив является строго возрастающей последовательностью");
        }
        else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
