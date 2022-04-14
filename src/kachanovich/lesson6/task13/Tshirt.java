package kachanovich.lesson6.task13;

public class Tshirt extends Clothing implements MenClothing,WomenClothing{


    public Tshirt() {
    }

    public Tshirt(ClothingSize clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressMen() {
        System.out.print("Одета мужская футболка\n");
    }



    @Override
    public void dressWomen() {
        System.out.print("Одета женская футболка\n");
    }
}
