package kachanovich.lesson9.examcloudsTasks.task5;

public class Student {
    private String surname;
    private int grade;
    private String itemName;

    public Student() {
    }

    public Student(String surname, int grade, String itemName) {
        this.surname = surname;
        this.grade = grade;
        this.itemName = itemName;
    }

    public void printInfo() {
        System.out.printf("Студент %-12s получил %3d по предмету %-10s\n", this.surname, this.grade, this.itemName);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
