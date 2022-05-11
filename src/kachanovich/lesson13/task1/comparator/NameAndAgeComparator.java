package kachanovich.lesson13.task1.comparator;

import kachanovich.lesson13.task1.Student;

import java.util.Comparator;

public class NameAndAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
//        return o1.getName().compareTo(o2.getName());
        if (o1.getName().compareTo(o2.getName())==0){
            return o1.getAge()-o2.getAge();
        }
        else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
