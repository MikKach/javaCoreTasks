package kachanovich.lesson13.task1Second.comparator;

import kachanovich.lesson13.task1Second.Student;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
