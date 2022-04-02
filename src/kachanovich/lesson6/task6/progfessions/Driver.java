package kachanovich.lesson6.task6.progfessions;

import java.util.Objects;
import java.util.Scanner;

public class Driver {
    private int experiense;
    Scanner scanner = new Scanner(System.in);


    public Driver() {
        System.out.print("Введите стаж вождения: ");
        this.experiense = scanner.nextInt();
    }

    public int getExperiense() {
        return experiense;
    }

    public void setExperiense(int experiense) {
        this.experiense = experiense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experiense == driver.experiense;
    }

    @Override
    public int hashCode() {
        return Objects.hash(experiense);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experiense=" + experiense +
                '}';
    }
}
