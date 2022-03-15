package kachanovich.lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();
        if (value >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
        if (Math.abs(value) < 10) {
            System.out.println("Однозначное");
        } else if (Math.abs(value) < 100) {
            System.out.println("Двузначное");
        } else if (Math.abs(value) < 1000) {
            System.out.println("Трехзначное");
        }
    }
}
