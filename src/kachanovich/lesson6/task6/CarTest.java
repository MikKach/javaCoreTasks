package kachanovich.lesson6.task6;

import kachanovich.lesson6.task6.vehicles.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Gar","C",1500);
        car1.printInfo();
        System.out.println(car1.toString());
    }
}
