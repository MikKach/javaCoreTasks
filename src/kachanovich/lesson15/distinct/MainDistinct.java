package kachanovich.lesson15.distinct;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class MainDistinct {
    public static void main(String[] args) {
        Collection ordered = Arrays.asList("a1", "a2", "a2", "a3", "a1", "a2", "a2");
        Collection nonOrdered = new HashSet<>(ordered);

        ordered.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        nonOrdered.stream()
                .distinct()
                .forEach(System.out::println);


    }
}
