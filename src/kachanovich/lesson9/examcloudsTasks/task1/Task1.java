package kachanovich.lesson9.examcloudsTasks.task1;

public class Task1 {
    /*
   1 Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
   2 Распечатать последний символ строки. Используем метод String.charAt().
   3 Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
   4 Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
   5 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
   6 Найти позицию подстроки “Java” в строке “I like Java!!!”.
   7 Заменить все символы “а” на “о”.
   8 Преобразуйте строку к верхнему регистру.
   9 Преобразуйте строку к нижнему регистру.
   10 Вырезать строку Java c помощью метода String.substring().
     */
    public static void main(String[] args) {
        lastCharacter("I like Java!!!");
        lastSubstring("I like Java!!!");
        startSubstring("I like Java!!!");
        substrings("I like Java!!!");
        positionSubstringOfString("I like Java!!!");
        replecesCharacter("I like Java!!!");
        upRegistr("I like Java!!!");
        lowerRegistr("I like Java!!!");
        cutsOutSubstring("I like Java!!!");
    }

    //2
    public static void lastCharacter(String string) {
        System.out.println(string.charAt(string.length() - 1));
    }

    //3
    public static void lastSubstring(String string) {
        System.out.println(string.endsWith("!!!"));
    }

    //4
    public static void startSubstring(String string) {
        System.out.println(string.startsWith("I like"));
    }

    //5
    public static void substrings(String string) {
        System.out.println(string.contains("Java"));
    }

    //6
    public static void positionSubstringOfString(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'J' && (i + 3) < string.length()) {
                if (string.charAt(i + 1) == 'a' && string.charAt(i + 2) == 'v' && string.charAt(i + 3) == 'a') {
                    System.out.printf("The position of the substring \"Java\" in the string is %d\n", i);
                }
            }
        }
    }

    //7
    public static void replecesCharacter(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                System.out.print("o");
            } else {
                System.out.print(string.charAt(i));
            }
        }
        System.out.println();
    }

    //8
    public static void upRegistr(String string) {
        System.out.println(string.toUpperCase());
    }

    //9
    public static void lowerRegistr(String string) {
        System.out.println(string.toLowerCase());
    }

    //10
    public static void cutsOutSubstring(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'J' && (i + 3) < string.length()) {
                if (string.charAt(i + 1) == 'a' && string.charAt(i + 2) == 'v' && string.charAt(i + 3) == 'a') {
                    i += 3;
                    continue;
                }
            }
            sb.append(string.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
