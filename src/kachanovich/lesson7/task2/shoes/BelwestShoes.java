package kachanovich.lesson7.task2.shoes;

public class BelwestShoes implements Shoes{
    public BelwestShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Одеты ботинки Belwest");
    }

    @Override
    public void pullOff() {
        System.out.println("Сняты ботинки Belwest");
    }
}