package kachanovich.lesson6.task6.vehicles;

import java.util.Objects;

public class SportCar extends Car {
    private int speed;

    public SportCar() {
    }

    public SportCar(String carModel, String carClass, int carWeight, int speed) {
        super(carModel, carClass, carWeight);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SportCar sportCar = (SportCar) o;
        return speed == sportCar.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}';
    }


}
