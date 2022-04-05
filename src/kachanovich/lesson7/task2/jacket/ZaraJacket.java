package kachanovich.lesson7.task2.jacket;

public class ZaraJacket implements Jacket {
    public ZaraJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Одет жакет Zara");
    }

    @Override
    public void pullOff() {
        System.out.println("Снят жакет Zara");
    }
}
