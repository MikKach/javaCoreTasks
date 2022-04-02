package kachanovich.lesson6.task9;

import java.util.Arrays;

public class ShopStart {
    public static void main(String[] args) {
        InternetShop internetShop = new InternetShop();
        Category candyCategory = new Category("Конфеты");
        Category biscuitCategory = new Category("Печенье");
        Product candy1 = new Product("Трюфель", 60, 6);
        Product candy2 = new Product("Аленка", 45, 4);
        Product candy3 = new Product("Батончик", 43, 4);
        Product candy4 = new Product("Аэрофлотские", 51, 5);
        Product biscuit1 = new Product("Шахматное", 35, 3);
        Product biscuit2 = new Product("Земляничное", 31, 4);
        Product biscuir3 = new Product("Постное", 25, 2);
        Product biscuit4 = new Product("Овсяное", 30, 6);
        internetShop.setCategoryArray(candyCategory,biscuitCategory);
        candyCategory.setProductsArray(candy1,candy2,candy3,candy4);
        biscuitCategory.setProductsArray(biscuit1,biscuit2,biscuir3,biscuit4);
        User user1 = new User("Mik","123");
        User user2 = new User("Sam","123");
        internetShop.setUserArray(user1,user2);
        MenuShop menuShop = new MenuShop(internetShop);
        menuShop.menuStart();





    }
}
