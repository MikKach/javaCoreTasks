package kachanovich.lesson6.task13;

public class Tie extends Clothing implements MenClothing{
    public Tie() {
    }

    public Tie(ClothingSize clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressMen() {
        System.out.print("Одет галстук\n");
    }
}
