package kachanovich.lesson6.task5;

public class Student {
    /*
        5 Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
            а) Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
            б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
            в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя
         оценка студента равна 5, то сумма 100 р., иначе 80. Переопределить этот метод в классе Aspirant.
         Если средняя оценка аспиранта равна 5, то сумма 200 р., иначе 180.
            г) Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.

     */
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student() {
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        if (this.averageMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}
