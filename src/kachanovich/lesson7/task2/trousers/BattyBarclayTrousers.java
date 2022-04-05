package kachanovich.lesson7.task2.trousers;

public class BattyBarclayTrousers implements Trousers {
    public BattyBarclayTrousers() {
    }

    @Override
    public void putOn() {
        System.out.println("Одеты брюки Batty Barclay");
    }

    @Override
    public void pullOff() {
        System.out.println("Сняты брюки Batty Barclay");
    }
}
