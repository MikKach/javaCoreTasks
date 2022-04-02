package kachanovich.lesson6.task1;

import java.util.Objects;

public class Phone {
    private int number;
    private String model;
    private double weight;
    private String name;

    public Phone() {
    }

    public Phone(int number) {
        this.number = number;
    }

    public Phone(int number, String model) {
        this(number);
        this.model = model;
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.printf("Call %s\n", name);
    }

    public void receiveCall(String name, int number) {
        System.out.printf("Call %s , number %d\n", name, number);
    }

    public static void sendMessage(int... number) {
        for (int element : number) {
            System.out.print(element + " ");
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return number == phone.number && Double.compare(phone.weight, weight) == 0 && Objects.equals(model, phone.model) && Objects.equals(name, phone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, weight, name);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
