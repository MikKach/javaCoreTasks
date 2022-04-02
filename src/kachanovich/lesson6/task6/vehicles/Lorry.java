package kachanovich.lesson6.task6.vehicles;

import java.util.Objects;

public class Lorry extends Car {
    private int carrying;

    public Lorry() {
    }

    public Lorry(String carModel, String carClass, int carWeight, int carrying) {
        super(carModel, carClass, carWeight);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lorry lorry = (Lorry) o;
        return carrying == lorry.carrying;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrying);
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }


}
