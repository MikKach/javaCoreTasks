package kachanovich.lesson15.taskFilter;

import kachanovich.lesson15.taskPeople.Sex;

import java.util.List;
import java.util.Objects;

public class People {
    /*
    с полями name — имя, age — возраст, sex — пол
     */
    private String name;
    private int age;
    private Gender sex;
    private List<Hobby> hobby;


    public People(String name, int age, Gender sex, List<Hobby> hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobby = hobby;
    }

    public People(String name, int age, Gender sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public People() {
    }

    public boolean isContains(People p) {
        String s = p.getName().toUpperCase();
        if (s.contains("a") && !s.contains("b")){
            return true;
        }
            return false;
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

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public List<Hobby> getHobby() {
        return hobby;
    }

    public void setHobby(List<Hobby> hobby) {
        this.hobby = hobby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name) && sex == people.sex && Objects.equals(hobby, people.hobby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, hobby);
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", hobby=" + hobby +
                '}';
    }
}
