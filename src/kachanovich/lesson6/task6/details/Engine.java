package kachanovich.lesson6.task6.details;

import java.util.Objects;
import java.util.Scanner;

public class Engine {
    private int power;
    private String company;
    Scanner scanner = new Scanner(System.in);


    public Engine() {
        System.out.print("Введите мощность двигателя: ");
        this.power = scanner.nextInt();
        System.out.print("Введите производителя двигателя: ");
        this.company = scanner.next();
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power && Objects.equals(company, engine.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, company);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", manufacturer='" + company + '\'' +
                '}';
    }
}
