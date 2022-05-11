package kachanovich.lesson11.task3;

public class TextFormaterTask2 {
    public static void censorship(String line, String[] arrayWord) {
        String[] arrayLineWord = line.split(" ");
        int num;
        for (String word : arrayWord) {
            for (String lineWord : arrayLineWord) {
                num = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (lineWord.charAt(i) == word.charAt(i)) {
                        num++;
                    }
                }
            }
        }
    }
}
