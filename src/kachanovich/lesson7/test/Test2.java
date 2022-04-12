package kachanovich.lesson7.test;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = getArrayNumber(1, 100, 2);
        int[] arr1 = getArrayNumber(2, 110, 3);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] getArrayNumber(int from, int to, int number) {
        int[] arr = new int[to - from];
        int j = 0;
        for (int i = from; i <= to; i++) {
            if (i % number != 0) {
                arr[j++] = i;
            }
        }
        return Arrays.copyOf(arr,j);

    }
}
