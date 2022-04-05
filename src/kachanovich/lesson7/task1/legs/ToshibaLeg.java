package kachanovich.lesson7.task1.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
