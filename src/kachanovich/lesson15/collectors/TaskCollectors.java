package kachanovich.lesson15.collectors;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskCollectors {
    public static void main(String[] args) {
        Collection collection = Arrays.asList(1, 2, 3, 4);
        /*
        Получить сумму нечетных чисел - 4
        Вычесть от каждого элемента 1 и получить среднее - 1.5
        Прибавить к числам 3 и получить статистику - 	IntSummaryStatistics{count=4, sum=22, min=4, average=5.5, max=7}
        Разделить числа на четные и нечетные - {false=[1, 3], true=[2, 4]}
         */

        Stream<Integer> stream1 = collection.stream();
        System.out.println(stream1.collect(Collectors.summingInt(p -> p % 2 != 0 ? p : 0)));

        Stream<Integer> stream2 = collection.stream();
        System.out.println(stream2.collect(Collectors.averagingDouble(p -> p - 1)));

        Stream<Integer> stream3 = collection.stream();
        System.out.println(stream3.collect(Collectors.summarizingInt(p -> p + 3)));

        Stream<Integer> stream4 = collection.stream();
        System.out.println(stream4.collect(Collectors.partitioningBy(p -> p % 2 == 0)));


        Collection collection2 = Arrays.asList("a1", "b2", "c3", "a1");

        /*
        Получение списка без дубликатов - [a1, b2, c3]
        Получить массив строк без дубликатов и в верхнем регистре - {A1, B2, C3}
        Объединить все элементы в одну строку через разделитель: и обернуть тегами <b>… </b> - <b> a1: b2: c3: a1 </b>
        Преобразовать в map, где первый символ ключ, второй символ значение	 - {a=1, b=2, c=3}
        Преобразовать в map, сгруппировав по первому символу строки - 	{a=[a1, a1], b=[b2], c=[c3]}
         */

        Stream<String> stream5 = collection2.stream();
        System.out.println(stream5.distinct().collect(Collectors.toList()));

        Stream<String> stream6 = collection2.stream();
        System.out.println(stream6.distinct().map(p->p.toUpperCase()).collect(Collectors.toList()));

        Stream<String> stream7 = collection2.stream();
        System.out.println(stream7.collect(Collectors.joining(":","<b>","<b>")));

        Stream<String> stream8 = collection2.stream();
        System.out.println(stream8.distinct().collect(Collectors.toMap(p->p.substring(0,1),p->p.substring(1,2))));

        Stream<String> stream9 = collection2.stream();
        System.out.println(stream9.collect(Collectors.groupingBy(p->p.substring(0,1))));

    }
}
