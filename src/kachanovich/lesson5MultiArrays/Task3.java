package kachanovich.lesson5MultiArrays;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    /*
    3)Проверить произведение элементов какой диагонали больше.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
        int line = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int column = scanner.nextInt();
        Random random = new Random();
        int[][] matrix = new int[line][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 51);
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }

        int mult1 = 1;
        int mult2 = 1;
        int index = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            mult2 *= matrix[i][index--];
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    mult1 *= matrix[i][i];
                }

            }
        }
        if (mult1>mult2){
            System.out.printf("Произведения элементов первой диагорнали больше\n");
        }
        else if (mult1<mult2){
            System.out.printf("Произведения элементов второй диагонали больше\n");
        }
        else {
            System.out.printf("Произведения элементов диагоналей равны");
        }
    }
}
