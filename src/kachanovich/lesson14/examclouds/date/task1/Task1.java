package kachanovich.lesson14.examclouds.date.task1;

import java.time.LocalDate;

public class Task1 {//TODO
    /*
    Создайте объект класса LocalDate, указывая дату своего рождения.
Вывести на консоль день недели, день в году, месяц, год.
Создайте  объект класса LocalDate, представляющий текущее время.
Сравните его со своим днем рождения используя методы isAfter(), isBefore().
     */
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1984,6,8);
        LocalDate localDateNow = LocalDate.now();
        System.out.printf("%s-%d-%s-%d\n",localDate.getDayOfWeek(),localDateNow.getDayOfYear(),localDate.getMonth(),localDate.getYear());
        System.out.println(localDateNow);
        System.out.println(localDate.isAfter(localDateNow));
        System.out.println(localDate.isBefore(localDateNow));
    }
}
