package kachanovich.lesson5MultiArrays;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    /*
    2)Вывести нечетные элементы находящиеся под главной
диагональю(включительно).
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
        int sum = 0;
        System.out.printf("Нечетные элементы находящиеся под главной диагональю(включительно)\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j <= i && matrix[i][j] % 2 != 0) {
                    System.out.printf("%d ",matrix[i][j]);
                }
            }
        }
    }
}
