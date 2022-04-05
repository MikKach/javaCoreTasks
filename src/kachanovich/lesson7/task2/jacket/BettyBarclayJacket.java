package kachanovich.lesson7.task2.jacket;

public class BettyBarclayJacket implements Jacket{
    public BettyBarclayJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Одет жакет Betty Barclay");
    }

    @Override
    public void pullOff() {
        System.out.println("Снят жакет Betty Barclay");
    }
}