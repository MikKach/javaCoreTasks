package kachanovich.lesson6.task6.progfessions;

import java.util.Objects;
import java.util.Scanner;

public class Person extends Driver {
    private String firstName;
    private int age;
    Scanner scanner = new Scanner(System.in);



    public Person() {
        super();
        System.out.print("Введите имя водителя: ");
        this.firstName = scanner.next();
        System.out.print("Введите возраст водителя: ");
        this.age = scanner.nextInt();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
