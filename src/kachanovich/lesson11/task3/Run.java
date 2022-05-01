package kachanovich.lesson11.task3;

import static kachanovich.lesson11.task2.TextFormater.censor;
import static kachanovich.lesson11.task2.TextFormater.readerStringFile;

public class Run {
    public static void main(String[] args) {//TODO
        String text = readerStringFile("text1Lesson11Task3.txt");
        String blackList = readerStringFile("text2Lesson11Task3.txt");
        censor(text,blackList);
    }
}
