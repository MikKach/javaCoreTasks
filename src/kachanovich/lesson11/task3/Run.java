package kachanovich.lesson11.task3;

import static kachanovich.lesson11.task2.TextFormater.readerStringFile;

public class Run {
    public static void main(String[] args) {
        String text = readerStringFile("text1Lesson11Task3.txt");
        String[] arrayText = text.split("\\.");
        String textCenz = readerStringFile("text2Lesson11Task3.txt");
        String[] arrayTextCenz = text.split("\n");
    }
}
