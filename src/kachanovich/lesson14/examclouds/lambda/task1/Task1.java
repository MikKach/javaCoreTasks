package kachanovich.lesson14.examclouds.lambda.task1;

import java.util.function.Predicate;

public class Task1 {//TODO изучить лямбды по видео

    /*
    Написать лямбда выражение для интерфейса Printable, который содержит один метод void print()
     */


    public static void main(String[] args) {
        Printable printable = System.out::println;
        Printable printable1 = System.out::println;
        printable.print("Gus");

        Predicate<Integer> predicate = (a) -> a > 0;
        System.out.println(predicate.test(6));

        Predicate<String> contA = s -> s.contains("A");
        Predicate<String> contB = s -> s.contains("F");
        System.out.println(contA.or(contB).test("ABCD"));
    }
}
