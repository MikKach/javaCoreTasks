package kachanovich.lesson11.test;

import java.io.*;

public class TestFileReader {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        File file = new File("Text.txt");
        try (FileReader fileReader = new FileReader(file)) {
            int character;
            while ((character = fileReader.read()) != -1) {
                char character1 = (char) character;
                sb.append((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb.toString());
    }
}
