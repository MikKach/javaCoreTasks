package kachanovich.lesson15.taskPeople;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PeopleSec people1 = new PeopleSec("Ivan", 79, Sex.MAN);
        PeopleSec people2 = new PeopleSec("Oksana", 56, Sex.WOMEN);
        PeopleSec people3 = new PeopleSec("Mik", 20, Sex.MAN);
        PeopleSec people4 = new PeopleSec("Sam", 69, Sex.MAN);
        PeopleSec people5 = new PeopleSec("Vasiliy", 26, Sex.MAN);
        PeopleSec people6 = new PeopleSec("Viktoriya", 42, Sex.WOMEN);
        PeopleSec people7 = new PeopleSec("Mihail", 16, Sex.MAN);
        PeopleSec people8 = new PeopleSec("Roman", 24, Sex.MAN);
        PeopleSec people9 = new PeopleSec("Nataliya", 21, Sex.WOMEN);
        List<PeopleSec> peoples = new ArrayList<>();
        peoples.add(people1);
        peoples.add(people2);
        peoples.add(people3);
        peoples.add(people4);
        peoples.add(people5);
        peoples.add(people6);
        peoples.add(people7);
        peoples.add(people8);
        peoples.add(people9);
        /*
        Выбрать мужчин-военнообязанных (от 18 до 27 лет) - [{name='Петя', age=23, sex=MAN}]
        Найти средний возраст среди мужчин - 36.0
        Найти кол-во потенциально работоспособных людей в выборке (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)
         */

        List<PeopleSec> peoples1 = peoples.stream().filter(e -> e.getAge() > 17 && e.getAge() < 28 && e.getSex() == Sex.MAN).toList();
        System.out.printf("Военнообязянные: " + peoples1);
        System.out.println();

        double averPeop = peoples.stream().filter(e -> e.getSex() == Sex.MAN).mapToInt(PeopleSec::getAge).average().getAsDouble();
        System.out.println("Средний возраст мужчин: " + averPeop);

        int countRab = (int) peoples.stream()
                .filter(people -> people.getAge() > 17)
                .filter(e -> ((e.getSex() == Sex.WOMEN && e.getAge() < 56) || (e.getSex() == Sex.MAN && e.getAge() < 60)))
                .count();
        System.out.println("Количество потенциальных работников: " + countRab);
    }
}
