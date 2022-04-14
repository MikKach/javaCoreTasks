package kachanovich.lesson6.task13;

public class Trousers extends Clothing implements MenClothing,WomenClothing{
    public Trousers() {
    }

    public Trousers(ClothingSize clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressMen() {
        System.out.print("Одеты мужские брюки\n");
    }

    @Override
    public void dressWomen() {
        System.out.print("Одеты женские брюки\n");
    }


}
