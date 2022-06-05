package kachanovich.myTest.practStream;

import java.util.List;
import java.util.Objects;

public class Car {
    private String company;

    private  String model;
    private int power;
    private List<Engine> engineList;


    public Car() {
    }

    public Car(String company, String model, int power, List<Engine> engineList) {
        this.company = company;
        this.model = model;
        this.power = power;
        this.engineList = engineList;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public List<Engine> getEngineList() {
        return engineList;
    }

    public void setEngineList(List<Engine> engineList) {
        this.engineList = engineList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return power == car.power && Objects.equals(company, car.company) && Objects.equals(model, car.model) && Objects.equals(engineList, car.engineList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, model, power, engineList);
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                ", engineList=" + engineList +
                '}';
    }
}
