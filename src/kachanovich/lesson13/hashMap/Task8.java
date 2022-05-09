package kachanovich.lesson13.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Task8 {
    public static void main(String[] args) {
        Map<Integer, String> color = new HashMap<>();
        color.put(1,"Red");
        color.put(2,"Orange");
        color.put(3,"Green");
        color.put(4,"White");
        color.put(5,"Black");
        System.out.println(color);
        if (color.containsValue("Green")){
            System.out.println("Да");
        }
        else {
            System.out.println("Нет такого");
        }
    }
}
