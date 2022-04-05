package kachanovich.lesson7.task2.trousers;

public class HollisterTrousers implements Trousers {
    public HollisterTrousers() {
    }

    @Override
    public void putOn() {
        System.out.println("Одеты брюки Hollister");
    }

    @Override
    public void pullOff() {
        System.out.println("Сняты брюки Hollister");
    }
}