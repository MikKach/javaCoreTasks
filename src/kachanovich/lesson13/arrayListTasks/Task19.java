package kachanovich.lesson13.arrayListTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task19 {
    public static void main(String[] args) {
        ArrayList<String> list_color = new ArrayList<>(4);
        list_color.add("Red");
        list_color.add("Green");
        list_color.add("Yellow");
        list_color.add("Black");
        System.out.println(list_color);
        list_color.ensureCapacity(2);
        list_color.add("Pink");
        list_color.add("White");
        System.out.println(list_color);
    }
}
