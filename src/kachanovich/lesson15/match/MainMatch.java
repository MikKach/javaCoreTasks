package kachanovich.lesson15.match;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class MainMatch {

    /*
    anyMatch, allMatch, noneMatch

    Найти существуют ли хоть один «a1» элемент в коллекции - true
    Найти существуют ли хоть один «a8» элемент в коллекции - false
    Найти есть ли символ «1» у всех элементов коллекции	- false
    Проверить что не существуют ни одного «a7» элемента в коллекции	- true

     */
    public static void main(String[] args) {
        Collection col = Arrays.asList("a1", "a2", "a3", "a1");

        System.out.printf("Наличие \"a1\" в коллекции - %s\n",col.stream().anyMatch("a1"::equals));

        System.out.printf("Наличие \"a8\" в коллекции - %s\n",col.stream().anyMatch("a8"::equals));

        Stream<String> colNew = col.stream();
        System.out.printf("Наличие \"1\" у всех элементов коллекции - %s\n", colNew.allMatch(s->s.contains("1")));

        Stream<String> colNew1 = col.stream();
        System.out.printf("Наличие элементов \"a7\" в коллекции - %s \n", colNew1.noneMatch(e->e.contains("a7")));
    }
}
