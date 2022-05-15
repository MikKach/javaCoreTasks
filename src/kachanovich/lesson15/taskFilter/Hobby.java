package kachanovich.lesson15.taskFilter;

import java.util.Objects;

public class Hobby {
    private String name;
    private int male;

    public Hobby() {
    }

    public Hobby(String name, int male) {
        this.name = name;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hobby hobby = (Hobby) o;
        return male == hobby.male && Objects.equals(name, hobby.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, male);
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", male=" + male +
                '}';
    }
}
