package kachanovich.lesson3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество программистов: ");
        int numberProgrammers = scanner.nextInt();
        if(numberProgrammers>=0) {
            switch (numberProgrammers) {
                case 1: {
                    System.out.println(numberProgrammers + " программист");
                    break;
                }
                case 2:
                case 3:
                case 4: {
                    System.out.println(numberProgrammers + " программиста");
                    break;
                }
                default: {
                    System.out.println(numberProgrammers + " программистов");
                }
            }
        }
        else {
            System.out.println("Введено некорректное число");
        }
    }
}
