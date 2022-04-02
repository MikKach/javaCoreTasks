package kachanovich.lesson6.task9_InternetShop;

import java.util.Arrays;

public class Basket {
    private Product[] buyProduct;

    public Basket() {
        this.buyProduct = new Product[0];
    }

    public Product[] getBuyProduct() {
        return buyProduct;
    }

    public void setBuyProduct(Product... buyProduct) {
        Product[] temporaryArray = new Product[this.buyProduct.length + buyProduct.length];
        int count = 0;
        for (int i = 0; i < this.buyProduct.length; i++) {
            temporaryArray[i] = this.buyProduct[i];
            count++;
        }
        for (int j = 0; j < buyProduct.length; j++) {
            temporaryArray[count++] = buyProduct[j];
        }
        this.buyProduct = new Product[count];
        for (int i = 0; i < this.buyProduct.length; i++) {
            this.buyProduct[i] = temporaryArray[i];
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Arrays.equals(buyProduct, basket.buyProduct);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(buyProduct);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "buyProduct=" + Arrays.toString(buyProduct) +
                '}';
    }
}
