package kachanovich.lesson13.arrayListTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task14 {
    public static void main(String[] args) {
        List<String> list_color = new ArrayList<>();
        list_color.add("Red");
        list_color.add("Green");
        list_color.add("Yellow");
        list_color.add("Black");
        System.out.println(list_color);
        Collections.swap(list_color,0,3);
        System.out.println(list_color);
    }
}
