package kachanovich.lesson7.task2.shoes;

public class ECCOShoes implements Shoes{
    public ECCOShoes() {
    }

    @Override
    public void putOn() {
        System.out.println("Одеты ботинки ECCO");
    }

    @Override
    public void pullOff() {
        System.out.println("Сняты ботинки ECCO");
    }
}
