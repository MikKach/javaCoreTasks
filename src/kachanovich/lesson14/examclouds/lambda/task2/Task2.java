package kachanovich.lesson14.examclouds.lambda.task2;

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Predicate<String> noNull = s -> s != null;
        Predicate<String> noEmpty = s -> !s.isEmpty();
        Predicate<String> noNullAndNoEmpty = noNull.and(noEmpty);
        System.out.println(noNullAndNoEmpty.test("a"));
    }
}
