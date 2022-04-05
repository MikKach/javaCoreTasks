package kachanovich.lesson7.task2.shoes;

public class NikeShoes implements Shoes{
    public NikeShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Одеты ботинки Nike");
    }

    @Override
    public void pullOff() {
        System.out.println("Сняты ботинки Nike");
    }
}