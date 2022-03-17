package kachanovich.lesson3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int value1 = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int value2 = scanner.nextInt();
        if (value1 == value2) {
            System.out.println("Числа равны");
        } else {
            value1 = value1 > value2 ? value1 : value2;
            System.out.println("Большее число " + value1);
        }
    }
}
