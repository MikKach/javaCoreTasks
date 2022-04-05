package kachanovich.lesson7.task2.jacket;

public class OliverJacket implements Jacket{
    public OliverJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Одет жакет Oliver");
    }

    @Override
    public void pullOff() {
        System.out.println("Снят жакет Oliver");
    }
}
