package kachanovich.lesson6.task13;

import java.util.Objects;

public abstract class Clothing implements MenClothing,WomenClothing{
    private ClothingSize clothingSize;
    private int price;
    private String color;

    public Clothing() {
    }

    public Clothing(ClothingSize clothingSize, int price, String color) {
        this.clothingSize = clothingSize;
        this.price = price;
        this.color = color;
    }

    @Override
    public void dressMen() {

    }

    @Override
    public void dressWomen() {

    }

    public ClothingSize getClothingSize() {
        return clothingSize;
    }

    public void setClothingSize(ClothingSize clothingSize) {
        this.clothingSize = clothingSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothing clothing = (Clothing) o;
        return price == clothing.price && clothingSize == clothing.clothingSize && Objects.equals(color, clothing.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clothingSize, price, color);
    }


}
