package kachanovich.lesson15.taskFilter;

import java.time.LocalDate;

public class PeopleBirthdayInfo {
    public static boolean isLeapYears(int age){
        return LocalDate.now().minusYears(age).isLeapYear();
    }
}
