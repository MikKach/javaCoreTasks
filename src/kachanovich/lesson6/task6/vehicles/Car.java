package kachanovich.lesson6.task6.vehicles;

import kachanovich.lesson6.task6.details.Engine;
import kachanovich.lesson6.task6.progfessions.Driver;
import kachanovich.lesson6.task6.progfessions.Person;

import java.util.Objects;

public class Car {
    /*
    Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
    Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся",
    "Поворот направо" или "Поворот налево". А также метод printInfo(), который выводит полную информацию
    об автомобиле, ее водителе и моторе.
     */
    private String carModel;
    private String carClass;
    private int carWeight;
    private Driver driver;
    private Engine engine;

    public Car() {
    }

    public Car(String carModel, String carClass, int carWeight) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.carWeight = carWeight;
        driver = new Person();
        engine = new Engine();
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.printf("Модель: %s\nКласс: %s\nВес: %d\nСтаж вождения: %d\nМощность двигателя: %d\n",
                this.getCarModel(), this.getCarClass(), this.getCarWeight(),
                this.getDriver().getExperiense(), this.getEngine().getPower());
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carWeight == car.carWeight && Objects.equals(carModel, car.carModel) && Objects.equals(carClass, car.carClass) && Objects.equals(driver, car.driver) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carModel, carClass, carWeight, driver, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carClass='" + carClass + '\'' +
                ", carWeight=" + carWeight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
