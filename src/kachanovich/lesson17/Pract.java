package kachanovich.lesson17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pract {
    public static void main(String[] args) {
        String input = "325-98-24";
        String patternString = "^\\d{3}-\\d{2}-\\d{2}$";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.find());
    }
}
