package kachanovich.lesson9.task1;

import java.util.Scanner;

public class Task1 {
    /*
    1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
последнего вхождения сивола(B).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = scanner.nextLine();
        StringBuilder sb1 = new StringBuilder(string);
        System.out.println("Enter character A: ");
        char charA = scanner.next().charAt(0);
        System.out.println("Enter character B: ");
        char charB = scanner.next().charAt(0);
        if (sb1.indexOf(String.valueOf(charA)) < sb1.lastIndexOf(String.valueOf(charB))) {
            System.out.println(sb1.substring(sb1.indexOf(String.valueOf(charA)), sb1.lastIndexOf(String.valueOf(charB)) + 1));
        } else {
            System.out.println("Missing substring.");
        }

    }
}
