package kachanovich.lesson13.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class StudentList {
    /*
    2 В консоли выбрать:
3 - редактирование студента по id
4 - получить всех студентов в отсортированном виде по имени и возрасту
5 - получить все уникальные факультеты и имена студентов и их возраст на этом факультете

     */

    private ArrayList<Student> studentsArrayList;
    private Student student;
    private Scanner scanner;


    public StudentList() {
        studentsArrayList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addStudentToList(Student student) {
        this.studentsArrayList.add(student);
    }

    public int returnID() {
        int userID = 0;
        while (true) {
            System.out.println("Введите ID студента: ");
            try {
                userID = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception ex) {
                System.out.println("Неверный ввод.");
                continue;
            }
            if (userID < 1 || userID > Student.getID()) {
                System.out.println("Такого ID не существует.");
                continue;
            }
            return userID;
        }
    }

    public void addNewStudentToList(Student student) {
        this.studentsArrayList.add(student);
        System.out.println("===========================================================");
        System.out.println("В список добавлен студент: ");
        student.printStudent();
    }

    public void deletingStudentByID() {
        int id = returnID();
        Iterator <Student> iterator = studentsArrayList.iterator();
        while (iterator.hasNext()){
            int idNext = iterator.next().getIdStudent();
            if (id == idNext){
                iterator.remove();
            }
        }
    }

    public void printStudentList() {
        System.out.printf("%-5s%-12s%-10s%-12s%-4s\n", "ID", "Имя", "Возраст", "Факультет", "Курс");
        System.out.println("===========================================");
        for (Student el : this.studentsArrayList) {
            el.printStudent();
        }
    }

    public void editingStudentByID(int idToEdit) { //TODO
        int id = returnID();
    }

    public ArrayList<Student> getStudentsArrayList() {
        return studentsArrayList;
    }

    public void setStudentsArrayList(ArrayList<Student> studentsArrayList) {
        this.studentsArrayList = studentsArrayList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentList that = (StudentList) o;
        return Objects.equals(studentsArrayList, that.studentsArrayList) && Objects.equals(student, that.student) && Objects.equals(scanner, that.scanner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentsArrayList, student, scanner);
    }

    @Override
    public String toString() {
        return "StudentList{" +
                "studentsList=" + studentsArrayList +
                '}';
    }
}
