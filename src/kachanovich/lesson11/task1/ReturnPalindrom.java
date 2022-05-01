package kachanovich.lesson11.task1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReturnPalindrom {
    /*
    1)В исходном файле находятся слова, каждое слово на новой стороке. После
запуска программы должен создать файл, который будет содержать в себе
только полиндромы
     */
    private String fileName;
    private StringBuilder textFromFile;

    private StringBuilder textForFile;
    public ReturnPalindrom() {
    }

    public ReturnPalindrom(String fileName) {
        this.fileName = fileName;
        textFromFile = new StringBuilder();
        textForFile = new StringBuilder();
    }

    public void palindrome() {
        String str = textFromFile.toString();
        String[] arrayString = str.split("\n");
        for (String el : arrayString) {
            StringBuilder sb2 = new StringBuilder(el);
            if (el.equalsIgnoreCase(String.valueOf(sb2.reverse()))) {
                this.textForFile.append(el + "\n");
            }
        }
    }

    public void readerStringFile() {
        try (FileReader fileReader = new FileReader(this.fileName)) {
            int a;
            while ((a = fileReader.read()) != -1) {
                this.textFromFile.append((char) a);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeStringInFile() {
        try (FileWriter fileWriter = new FileWriter("text2Lesson11.txt")) {
            for (int i = 0; i < textForFile.length(); i++) {
                fileWriter.write(textForFile.charAt(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

