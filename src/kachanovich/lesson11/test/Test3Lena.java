package kachanovich.lesson11.test;

import java.io.IOException;

public class Test3Lena {
    public static int show() throws IOException {
        int choise;
        StringBuilder sb = new StringBuilder("12345");
        do {
            System.out.println(sb);
            choise = System.in.read();

//            System.out.println(choise);

        }while (choise<1 || choise>5);
        return choise;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(show());
    }
}
