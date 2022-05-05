package kachanovich.lesson13.task1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

public class Student implements Comparable<Student>{
    private static int ID = 0;

    private int idStudent;
    private String name;
    private int age;
    private String faculty;
    private int course;

    public Student() {
        this.name = randomWordFromArray(createsAnArrayOfWordsFromString(readFileIntoString("lesson13Name.txt")));
        this.age = randomIntAge();
        this.faculty = randomWordFromArray(createsAnArrayOfWordsFromString(readFileIntoString("lesson13Faculty.txt")));
        this.course = randomIntCourse();
        this.idStudent = ++ID;
    }

    private String readFileIntoString(String nameFile) {
        StringBuilder sb = new StringBuilder();
        int a;
        try (FileReader fileReader = new FileReader(nameFile)) {
            while ((a = fileReader.read()) != -1) {
                sb.append((char) a);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    private String[] createsAnArrayOfWordsFromString(String text) {
        return text.split("\n");
    }

    private String randomWordFromArray(String[] arrayWord) {
        Random random = new Random();
        String word;
        int i = random.nextInt(0, arrayWord.length);
        word = arrayWord[i];
        return word;
    }

    private int randomIntCourse() {
        Random random = new Random();
        return random.nextInt(1, 6);
    }

    private int randomIntAge() {
        Random random = new Random();
        return random.nextInt(18, 25);
    }

    public void printStudent() {
        System.out.printf("%-5d%-12s%-10d%-12s%-4d\n", this.idStudent, this.name, this.age, this.faculty, this.course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public static int getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idStudent == student.idStudent && age == student.age && course == student.course && Objects.equals(name, student.name) && Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStudent, name, age, faculty, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + idStudent +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
