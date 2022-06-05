package kachanovich.lesson17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pract {
    public static void main(String[] args) {
        String input = "abbcdeffgllmn";
        String patternString = "";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.find());
    }
}
