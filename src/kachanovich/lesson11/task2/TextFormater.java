package kachanovich.lesson11.task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFormater {
    /*
    2)Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл.
Пишем все в ООП стиле. Создаём класс TextFormater
в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false
В main считываем файл.
Разбиваем текст на предложения. Используя методы класса TextFormater
определяем подходит ли нам предложение. Если подходит добавляем его в
новый файл
     */

    public static int numberOfWordsInString(String string) {
        int num = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                num++;
            }
        }
        return num;
    }

    public static boolean checksForPalindrome(String string) {
        boolean bool;
        String[] arrayWord = string.split(" ");
        for (String word : arrayWord) {
            word = word.toLowerCase();
            bool = false;
            for (int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--) {
                if (word.charAt(i) != word.charAt(j)) {
                    bool = false;
                    break;
                } else {
                    bool = true;
                }
            }
            if (bool) {
                return true;
            }
        }
        return false;
    }

    public static String readerStringFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(fileName)) {
            int a;
            while ((a = fileReader.read()) != -1) {
                stringBuilder.append((char) a);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }

    public static void writeStringInFile(String string) {
        try (FileWriter fileWriter = new FileWriter("text2Lesson11Task2.txt")) {
            for (int i = 0; i < string.length(); i++) {
                fileWriter.write(string.charAt(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean wordInLine(String[] arrayLine, String word) {
        boolean bool = false;
        for (String wordLine : arrayLine) {
            bool = true;
            if (word.length() > wordLine.length()) {
                continue;
            }
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != wordLine.charAt(i)) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                return true;
            }
        }
        return bool;
    }

    public static void censor(String text, String blackList) {
        StringBuilder censorString = new StringBuilder();
        boolean bool;
        int nyumStringCensor = 0;
        String[] arrayText = text.split("\\.");
        String[] arrayBlackList = blackList.split("\n");
        int num = 0;
        for (String line : arrayText) {
            String[] arrayLine = line.split(" ");
            for (String word : arrayBlackList) {
                if (wordInLine(arrayLine, word)) {
                    num++;
                    censorString.append(line + ".");
                    break;
                }
            }
        }
        text = censorString.toString();
        writeStringInFile(text);

    }
}
