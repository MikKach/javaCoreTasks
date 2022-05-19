package kachanovich.lesson15.sorted;


import kachanovich.lesson15.taskFilter.Gender;
import kachanovich.lesson15.taskFilter.People;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaimSorted {
    public static void main(String[] args) {
        Collection col1 = Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4");

        Collection peoples = Arrays.asList(new People("Вася", 16, Gender.MALE),
                new People("Петя", 23, Gender.MALE),
                new People("Елена", 42, Gender.FEMALE),
                new People("Иван Иванович", 69, Gender.MALE));

        /*
        Отсортировать коллекцию строк по алфавиту - [a1, a1, a2, a3, a4, a4]
        Отсортировать коллекцию строк по алфавиту в обратном порядке - [a4, a4, a3, a2, a1, a1]
        Отсортировать коллекцию строк по алфавиту и убрать дубликаты - [a1, a2, a3, a4]
        Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты - [a4, a3, a2, a1]
        Отсортировать коллекцию людей по имени в обратном алфавитном порядке - [{'Петя'}, {'Иван Иванович'}, {'Елена'}, {'Вася'}]
        Отсортировать коллекцию людей сначала по полу, а потом по возраст - [{'Вася'}, {'Петя'}, {'Иван Иванович'}, {'Елена'}]
         */

        Stream<String> stream1 = col1.stream();
        System.out.println(stream1
                .sorted()
                .collect(Collectors.toList()));

        Stream<String> stream2 = col1.stream();
        System.out.println(stream2
                .sorted((e1, e2) -> e2.compareTo(e1))
                .collect(Collectors.toList()));

        Stream<String> stream3 = col1.stream();
        System.out.println(stream3
                .sorted()
                .distinct()
                .collect(Collectors.toList()));

        Stream<String> stream4 = col1.stream();
        System.out.println(stream4
                .distinct()
                .sorted((e1, e2) -> e2.compareTo(e1))
                .collect(Collectors.toList()));

        Stream<People> stream5 = peoples.stream();
        System.out.println(stream5
                .sorted((p1, p2) -> p2.getName().compareTo(p1.getName()))
                .collect(Collectors.toList()));

        Stream<People> stream6 = peoples.stream();
        System.out.println(stream6
                .sorted((e1, e2) -> e1.getSex() != e2.getSex() ? e1.getSex().compareTo(e2.getSex()) : e1.getAge() - (e2.getAge()))
                .collect(Collectors.toList()));

        /*
        Найти максимальное значение среди коллекции строк - a3
        Найти минимальное значение среди коллекции строк - a1
        Найдем человека с максимальным возрастом - {name='Иван Иванович', age=69, sex=MAN}
        Найдем человека с минимальным возрастом - {name='Вася', age=16, sex=MAN}
         */
        Collection col2 = Arrays.asList("a1", "a2", "a3", "a1");
        Stream<String> stream7 = col2.stream();
        System.out.println(stream7.max(String::compareTo).get());

        Stream<String> stream8 = col2.stream();
        System.out.println(stream8.min(String::compareTo).get());

        Stream<People> stream9 = peoples.stream();
        System.out.println(stream9.max((e1, e2) -> e1.getAge() - e2.getAge()).get());

        Stream<People> stream10 = peoples.stream();
        System.out.println(stream10.min((e1, e2) -> e1.getAge() - e2.getAge()).get());


        Collection col3 = Arrays.asList(1, 2, 3, 4, 2);
        /*
        Получить сумму чисел или вернуть 0 - 12
        Вернуть максимум или -1 - 4
        Вернуть сумму нечетных чисел или 0 - 4
         */

        Stream<Integer> stream11 = col3.stream();
        System.out.println(stream11.reduce((x, y) -> x + y).orElse(0));

        Stream<Integer> stream12 = col3.stream();
        System.out.println(stream12.reduce(Integer::max).orElse(-1));

        Stream<Integer> stream13 = col3.stream();
        System.out.println(stream13.filter(x -> x % 2 != 0).reduce((x, y) -> x + y).orElse(0));
    }


}
