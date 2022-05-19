package kachanovich.lesson15.taskFilter;

import kachanovich.lesson6.task2.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Hobby hobby1 = new Hobby("IT", new Random().nextInt(0, 11));
        Hobby hobby2 = new Hobby("Movie", new Random().nextInt(0, 11));
        Hobby hobby3 = new Hobby("Squash", new Random().nextInt(0, 11));

        People people1 = new People("Mik", 19, Gender.MALE, List.of(hobby1, hobby2));
        People people2 = new People("Stanb", 21, Gender.MALE, List.of(hobby1));
        People people3 = new People("Stas", 22, Gender.MALE, List.of(hobby1, hobby3));
        People people4 = new People("Vika", 19, Gender.FEMALE, List.of(hobby2, hobby3));
        People people5 = new People("Jora", 24, Gender.MALE, List.of(hobby1, hobby2, hobby3));
        People people6 = new People("Arina", 25, Gender.MALE, List.of(hobby2));

        List<People> peoples = List.of(people1, people2, people3, people4, people5, people6);
        double average = peoples.stream().mapToInt(people -> people.getAge()).average().orElse(0);
        System.out.println(average);

        List<People> hobPeopleAv = peoples.stream()
                .filter(people -> people.getHobby().stream()             //создали новый поток Hobby и с ним работаем, по нему проверяем каждого юзика на сопадение хобби IT череъз anyMatch
                        .anyMatch(hobby -> hobby.getName().equals("IT")))
                .toList();
        System.out.println("-----------------------------------------");
        peoples.stream().filter(p -> PeopleBirthdayInfo.isLeapYears(p.getAge())).forEach(System.out::println);

        System.out.println("------------------------------------------");
        peoples.stream()
                .filter(p -> {
                    String s = p.getName().toLowerCase();
                    return s.contains("a") && !s.contains("b");
                })
                .forEach(System.out::println);
        System.out.println("------------------------------------------");
        peoples.stream().sorted(new SortedPeopleName()).forEach(System.out::println);
        System.out.println("--------------------------------------------");
        peoples.stream().sorted(Comparator.comparing(People::getName).reversed()).forEach(System.out::println);
        System.out.println("--------------------------------------------");

        peoples.stream().sorted(Comparator.comparingInt(p -> p.getHobby().size())).forEach(System.out::println);
        System.out.println("--------------------------------------------");

        peoples.stream()
                .min(Comparator.comparingInt(People::getAge)
                        .reversed()
                        .thenComparing(people -> people.getHobby()
                                .size()))
                .orElse(new People());

        System.out.println("-------------------------------------------");

        String hello = "Hello";
        Arrays.stream(hello.split(""))
                .collect(Collectors
                        .groupingBy(c -> c, Collectors.counting()))
                .forEach((k, v) -> System.out.printf("%s=  %d\n", k, v));
        System.out.println("--------------------------------------------");

        maxMale(peoples);
        System.out.println("---------------------------------------------");




    }

    public static People maxMale(List<People> peopleList) {
        People maxHobbyPeople = peopleList.get(0);
        int maxMale = 0;
        int sumMale ;
        for (People p : peopleList) {
            sumMale=0;
            System.out.println(p);
            List<Hobby> hobbies = p.getHobby();
            for (Hobby h : hobbies) {
                sumMale += h.getMale();
            }
            if(maxMale<sumMale){
                maxMale=sumMale;
                maxHobbyPeople =p;
            }

        }
        System.out.println(" maxHobbyPeople - " + maxHobbyPeople);
        return maxHobbyPeople;
    }
}
