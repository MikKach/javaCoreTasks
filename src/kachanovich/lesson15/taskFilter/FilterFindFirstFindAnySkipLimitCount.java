package kachanovich.lesson15.taskFilter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterFindFirstFindAnySkipLimitCount {
    /*
    Условие: дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»), давайте посмотрим как её можно обрабатывать
    используя методы filter, findFirst, findAny, skip и count:
Вернуть количество вхождений объекта «a1» - 2
Вернуть первый элемент коллекции или 0, если коллекция пуста - a1
Вернуть последний элемент коллекции или «empty», если коллекция пуста - a1
Найти элемент в коллекции равный «a3» или кинуть ошибку - a3
Вернуть третий элемент коллекции по порядку - a3
Вернуть два элемента начиная со второго - [a2, a3]
Выбрать все элементы по шаблону - [a1, a1]
     */
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a1", "a2", "a3", "a1");

        //Вернуть количество вхождений объекта «a1» - 2
        long countNum = list.stream().filter("a1"::equals).count();
        System.out.printf("Количество вхождений \"a1\" - %d \n", countNum);

        //Вернуть первый элемент коллекции или 0, если коллекция пуста - a1
        System.out.printf("Первый элемент коллекции - %s\n", list.stream().findFirst().orElse("0"));

        // Вернуть последний элемент коллекции или «empty», если коллекция пуста - a1
        System.out.printf("Последний элемент коллекции - %s\n",list.stream().skip(list.size()-1).findAny().orElse("empti"));

        //Найти элемент в коллекции равный «a3» или кинуть ошибку - a3
        System.out.println(list.stream().filter("a3"::equals).findAny().get());

        //Вернуть третий элемент коллекции по порядку - a3
        System.out.println(list.stream().skip(2).findFirst().get());

        //Вернуть два элемента начиная со второго - [a2, a3]
        System.out.println(Arrays.toString(list.stream().skip(1).limit(2).toArray()));

        //Выбрать все элементы по шаблону - [a1, a1]
        System.out.println((list.stream().filter(e->e.contains("1")).collect(Collectors.toList())));
    }
}
