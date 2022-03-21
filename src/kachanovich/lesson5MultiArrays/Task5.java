package kachanovich.lesson5MultiArrays;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    /*
    5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
строкой и т. д.)
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

        int[][] matrixInverted = new int[column][line];
        for (int i = 0; i < matrixInverted.length; i++) {
            for (int j = 0; j < matrixInverted[i].length; j++) {
                matrixInverted[i][j] = matrix[j][i];
            }
        }
        System.out.println();
        for (int i = 0; i < matrixInverted.length; i++) {
            for (int j = 0; j < matrixInverted[i].length; j++) {
                System.out.printf("%d\t", matrixInverted[i][j]);
            }
            System.out.println();
        }
    }
}
