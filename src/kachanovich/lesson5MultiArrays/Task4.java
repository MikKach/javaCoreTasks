package kachanovich.lesson5MultiArrays;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    /*
    4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
включительно)
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix[i].length; j++) {
                if (matrix[i][j]%2==0){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.printf("Сумма четных элементов стоящих над побочной диагональю (не\n" +
                "включительно) %d",sum);
    }
}
