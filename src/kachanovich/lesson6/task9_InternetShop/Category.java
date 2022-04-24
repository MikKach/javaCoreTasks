package kachanovich.lesson6.task9_InternetShop;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Category implements Serializable {
    private String categoryName;
    private Product[] productsArray;

    public Category() {
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.productsArray = new Product[0];
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Product[] getProductsArray() {
        return productsArray;
    }

    public void setProductsArray(Product... product) {
        Product[] temporaryArray = new Product[this.productsArray.length + product.length];
        int count = 0;
        for (int i = 0; i < this.productsArray.length; i++) {
            this.productsArray[i].setCategoryProduct(this.getCategoryName());
            temporaryArray[i] = this.productsArray[i];
            count++;
        }
        for (int j = 0; j < product.length; j++) {
            product[j].setCategoryProduct(this.getCategoryName());
            temporaryArray[count++] = product[j];
        }
        this.productsArray = new Product[count];
        for (int i = 0; i < this.productsArray.length; i++) {
            this.productsArray[i] = temporaryArray[i];
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(categoryName, category.categoryName) && Arrays.equals(productsArray, category.productsArray);
    }


}
