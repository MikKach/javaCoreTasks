package kachanovich.lesson6.task13;

public class Skirt extends Clothing implements WomenClothing{

    public Skirt() {
    }

    public Skirt(ClothingSize clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.print("Одета юбка\n");
    }
}

