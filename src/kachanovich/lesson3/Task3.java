package kachanovich.lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();
        if (value > 0) {
            ;
            System.out.println("Число положительное, результат: " + (value + 1));
        } else if (value < 0) {
            value += 2;
            System.out.println("Число отрицательное, результат: " + (value + 2));
        } else {
            value = 10;
            System.out.println("Число равно 0, результат:  " + 10);
        }
    }
}
