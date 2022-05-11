package kachanovich.lesson13.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsList {
    private List<Student> studentList ;
    private Student student;

    public StudentsList() {
        this.studentList = new ArrayList<>();
    }

    public void deleteStudent() {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            double averRat = student.getAverageRating();
            String name = student.getName();
            if (averRat<3){
                System.out.printf("%s отчислен\n", name);
                iterator.remove();
            }
        }
    }

    public void nextCourse(){
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            double averRat = student.getAverageRating();
            String name = student.getName();
            int course = student.getCourse();
            if (averRat>3){
                student.setCourse(course+1);
                System.out.printf("%s переведен на %d курс\n", name,student.getCourse());

            }
        }
    }

    public void transitionToNextCourse() {
        for (Student el : studentList) {
            if (el.getAverageRating() > 3) {
                System.out.printf("%s переведен на %d курс\n", el.getName(), el.getCourse() + 1);
                el.setCourse(el.getCourse() + 1);
            }
        }
    }

    public void printStudents(List<Student> students, int course) {
        System.out.printf("Имена студентов обучающихся на %d курсе\n", course);
        int num = 0;
        for (Student el : studentList) {
            if (el.getCourse() == course) {
                System.out.println(el.getName());
                num++;
            }
        }
        if (num == 0) {
            System.out.printf("На %s курсе никто не учится\n", course);
        }
    }

    public  void printListStudent(){
        for (Student el : studentList) {
            System.out.println(el.getName());
        }
    }

    public void addStudentInList(String name, String group, int course, double averageRating){
        this.studentList.add(new Student(name,group,course,averageRating));
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
