package kachanovich.lesson11.task2;

import java.util.Arrays;

import static kachanovich.lesson11.task2.TextFormater.*;

public class Run {
    /*
    В main считываем файл.
Разбиваем текст на предложения. Используя методы класса TextFormater
определяем подходит ли нам предложение. Если подходит добавляем его в
новый файл
     */
    public static void main(String[] args) {
        String text = readerStringFile("text1Lesson11Task2.txt");
        String[] arrayText = text.split("\\.");
        StringBuilder stringBuilder = new StringBuilder();
        for (String el: arrayText) {
            int num = numberOfWordsInString(el);
            if((num>2 && num<5) || checksForPalindrome(el)){
                stringBuilder.append(el);
                stringBuilder.append(". ");
            }
        }
        writeStringInFile(stringBuilder.toString());
//
    }
}
