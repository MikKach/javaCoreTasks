package kachanovich.lesson15.map;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainMap {
    public static void main(String[] args) {
        /*
         Добавить "_1" к каждому элементу первой коллекции - [a1_1, a2_1, a3_1, a1_1]
        В первой коллекции убрать первый символ и вернуть массив чисел (int[]) - [1, 2, 3, 1]
        Из второй коллекции получить все числа, перечисленные через запятую из всех элементов	 - [1, 2, 0, 4, 5]
        Из второй коллекции получить сумму всех чисел, перечисленных через запятую - 12
         */

        Collection collection1 = Arrays.asList("a1", "a2", "a3", "a1");
        Collection collection2 = Arrays.asList("1,2,0", "4,5");

        System.out.println(collection1
                .stream()
                .map(e -> e + "_1")
                .collect(Collectors.toList()));

        Stream<String> stream1 = collection1.stream();
        System.out.println(Arrays.toString(stream1
                .mapToInt((s) -> Integer.parseInt(s.substring(1)))
                .toArray()));

        Stream<String> stream2 = collection2.stream();
        System.out.println(Arrays.toString(stream2
                .flatMap((p) -> Arrays.stream(p.split(",")))
                .toArray(String[]::new)));

        Stream<String> stream3 = collection2.stream();
        System.out.println(stream3
                .flatMap((p) -> Arrays.stream(p.split(",")))
                .mapToInt(Integer::parseInt)
                .sum());
    }
}
