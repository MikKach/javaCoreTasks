package kachanovich.lesson7.task2;

import kachanovich.lesson7.task2.shoes.ECCOShoes;
import kachanovich.lesson7.task2.trousers.DieselTrousers;

public class Run {
    public static void main(String[] args) {
        Human human1 = new Human("Vasya");
        Human human2 = new Human("Goga");
        human1.getDressed(new ECCOShoes(),new DieselTrousers());
        human1.undress();
    }
}
