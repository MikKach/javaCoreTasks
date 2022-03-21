package kachanovich.lesson5MultiArrays;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    /*
    Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).
1) Почитать сумму четных элементов стоящих на главной диагонали.
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
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] % 2 == 0) {
                    sum += matrix[i][i];
                }
            }
        }
        System.out.printf("Сумма четных элементов стоящих на главной диагонали %d", sum);
    }
}
