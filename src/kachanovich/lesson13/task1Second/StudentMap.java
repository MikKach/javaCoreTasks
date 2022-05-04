package kachanovich.lesson13.task1Second;

import kachanovich.lesson13.task1Second.comparator.NameComparator;

import java.util.*;

public class StudentMap {
    private Map<Integer, Student> studentMap;
    private Student student;
    private Scanner scanner;

    public StudentMap() {
        studentMap = new HashMap<>();
        for (int i = 0; i < 50; i++) {
            student = new Student();
            studentMap.put(student.getIdStudent(), student);
        }
        scanner = new Scanner(System.in);
    }

    public void printStudentMap() {
        System.out.printf("%-5s%-12s%-10s%-12s%-4s\n", "ID", "Имя", "Возраст", "Факультет", "Курс");
        System.out.println("===========================================");
        for (Student printStudentsFromMap : studentMap.values()) {
            printStudentsFromMap.printStudent();
        }
    }

    public void addStudent() {
        Student studentNew = new Student();
        studentMap.put(studentNew.getIdStudent(), studentNew);
    }

    public void deleteStudent() {
        Integer key = returnID();
        studentMap.remove(key);
    }

    public void sortByName() {//TODO
        List<Student> arrayListStudent = new ArrayList<>(studentMap.values());
        Collections.sort(arrayListStudent,new NameComparator());
        printStudentList(arrayListStudent);
    }

    public void printStudentList(List<Student> list ) {
        System.out.printf("%-5s%-12s%-10s%-12s%-4s\n", "ID", "Имя", "Возраст", "Факультет", "Курс");
        System.out.println("===========================================");
        for (Student printStudentsFromList : list) {
            printStudentsFromList.printStudent();
        }
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
            if (!studentMap.containsKey(userID)) {
                System.out.println("Такого ID не существует.");
                continue;
            }
            return userID;
        }
    }

    public Map<Integer, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<Integer, Student> studentMap) {
        this.studentMap = studentMap;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentMap that = (StudentMap) o;
        return Objects.equals(studentMap, that.studentMap) && Objects.equals(student, that.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentMap, student);
    }

    @Override
    public String toString() {
        return "StudentList{" +
                "studentMap=" + studentMap +
                '}';
    }


}
