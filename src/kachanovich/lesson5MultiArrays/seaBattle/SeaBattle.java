package kachanovich.lesson5MultiArrays.seaBattle;

import java.util.Random;

public class SeaBattle {
    public static void main(String[] args) {
        Random random = new Random();
        String[][] field = new String[10][10];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = "-";
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int shipPosition = random.nextInt(0, 2);
        System.out.printf("Position %d\n",shipPosition);
        int indexX;
        int indexY;
        if (shipPosition == 0) {
            indexX = random.nextInt(0, 10);
            indexY = random.nextInt(0, 7);
            System.out.printf("%d, %d\n", indexX, indexY);
            for (int i = 0; i < 4; i++) {
                field[indexX][indexY+i] = "+";
            }
        }
        else {
            indexX = random.nextInt(0, 7);
            indexY = random.nextInt(0, 10);
            System.out.printf("%d, %d\n", indexX, indexY);
            for (int i = 0; i < 4; i++) {
                field[indexX+i][indexY] = "+";
            }
        }

        for (int i = 0; i < 2; i++) {
            shipPosition = random.nextInt(0, 2);
            if (shipPosition == 0) {

            }
            else {

            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
