package kachanovich.lesson13.arrayListTasks;

import java.util.ArrayList;
import java.util.List;

public class Task18 {
    public static void main(String[] args) {
        List<String> list_color = new ArrayList<>();
        list_color.add("Red");
        list_color.add("Green");
        list_color.add("Yellow");
        list_color.add("Black");
        System.out.println(list_color);
        System.out.println(list_color.isEmpty());
        list_color.clear();
        System.out.println(list_color.isEmpty());
    }
}
