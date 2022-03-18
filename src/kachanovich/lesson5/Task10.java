package kachanovich.lesson5;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    /*
    10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение. Создать массив из n случайных
целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
только из чётных элементов первого массива, если они там есть, и вывести его
на экран.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Введите число больше 3: ");
            n = scanner.nextInt();
            if (n > 3) {
                break;
            }
            System.out.println("Неверное число.");
        }
        int[] array = new int[n];
        int numberEvenElements = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, n + 1);
            System.out.printf("%d ", array[i]);
            if(array[i]%2==0){
                numberEvenElements++;
            }
        }
        System.out.println();
        System.out.printf("В массиве %d четных элементов.\n", numberEvenElements);
        int index =0;
        int[] array2 = new int[numberEvenElements];
        if(numberEvenElements==0){
            System.out.printf("Четных элементов в массиве нет.\n");
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if (array[i]%2==0){
                    array2[index]=array[i];
                    System.out.printf("%d ",array[i]);
                    index++;
                }
            }
        }
    }
}
