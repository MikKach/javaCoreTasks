package kachanovich.lesson6.task3;

import java.util.Random;

public class Matrix {
    /*
        3. Создать класс "Матрица". Класс должен иметь следующие поля:
         1) двумерный массив вещественных чисел;
         2) количество строк и столбцов в матрице.
        Класс должен иметь следующие методы:
         1) сложение с другой матрицей;
         2) умножение на число;
         3) вывод на печать;
         4) умножение матриц - по желанию.
     */
    private double[][] matrix;
    private int line;
    private int column;
    Random random = new Random();

    public Matrix() {
    }

    public Matrix(int line, int column) {
        this.line = line;
        this.column = column;
        matrix = new double[line][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(0, 100);
            }
        }
    }

    public void addMatrix(double[][] matrix) {
        if (this.line == matrix.length && this.column == matrix[0].length) {
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.printf("%.1f ", this.matrix[i][j] + matrix[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrices of different sizes");
        }
    }

    public void multMatrixNumber(int number) {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                System.out.printf("%.2f ", this.matrix[i][j] * number);
            }
            System.out.println();
        }
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%.2f ", this.matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void matrixMultiplication(double[][] matrix) {//TODO
        if (column ==matrix.length){

        }
    }
}
