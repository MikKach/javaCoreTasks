package kachanovich.lesson9.task2;

import java.util.Scanner;

public class Task2 {
    /*
    2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
позиции 0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = scanner.nextLine();
        StringBuilder sb1 = new StringBuilder(string);
        char char0 = sb1.charAt(0);
        char char3 = sb1.charAt(3);
        for (int i = 1; i < sb1.length(); i++) {
            if (sb1.charAt(i) == char3) {
                sb1.replace(i,i+1, String.valueOf(char0));
            }
        }
        System.out.println(sb1.toString());
    }
}
