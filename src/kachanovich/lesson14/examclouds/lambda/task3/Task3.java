package kachanovich.lesson14.examclouds.lambda.task3;

import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate<String> predicate1 = s-> (s.charAt(0) == 'J' || s.charAt(0) == 'N') && s.charAt(s.length()-1) == 'A';
        System.out.println(predicate1.test("JIRA"));
    }
}
