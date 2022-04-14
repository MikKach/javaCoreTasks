package kachanovich.lesson7.test;

import java.util.Scanner;

/*
Подсчет повторяющихся символов. Написать программу, которая подсчитывает повторяющиеся символы в заданной строке.
 */
public class Teat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        char velue;
        char[] array = new char[st.length()];
        int index;
        for (int i = 0; i < st.length(); i++) {
            array[i] = st.charAt(i);
            index=1;
        }
    }
}
