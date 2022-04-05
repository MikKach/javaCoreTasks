package kachanovich.lesson7.task1.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
