package kachanovich.lesson9.examcloudsTasks.task6;

import static kachanovich.lesson9.examcloudsTasks.task6.Report.*;

public class Run {
    public static void main(String[] args) {
        Employee em1 = new Employee("Хмелев",452.6);
        Employee em2 =new Employee("Трубочкин", 625);
        Employee em3 =new Employee("Мастак", 233.4);
        Employee em4 =new Employee("Южик", 923.1);
        Employee[] employees = {em1,em2,em4,em3};
        generateReport(employees);
    }
}
