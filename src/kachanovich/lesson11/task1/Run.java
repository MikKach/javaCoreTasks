package kachanovich.lesson11.task1;

public class Run {
    public static void main(String[] args) {
        String fileName = "textLesson11.txt";
        ReturnPalindrom returnPalindrom = new ReturnPalindrom(fileName);
        returnPalindrom.readerStringFile();
        returnPalindrom.palindrome();
        returnPalindrom.writeStringInFile();
    }
}
