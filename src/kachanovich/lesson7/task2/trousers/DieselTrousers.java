package kachanovich.lesson7.task2.trousers;

public class DieselTrousers implements Trousers {
    public DieselTrousers() {
    }

    @Override
    public void putOn() {
        System.out.println("Одеты брюки Diesel");
    }

    @Override
    public void pullOff() {
        System.out.println("Сняты брюки Diesel");
    }
}
