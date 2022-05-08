package kachanovich.lesson13.arrayListTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<String> list_color = new ArrayList<>();
        list_color.add("Red");
        list_color.add("Green");
        list_color.add("Yellow");
        list_color.add("Black");
        System.out.println(list_color);
        List<String> listNew = new ArrayList<>();
        listNew.addAll(list_color);
        System.out.println(listNew);
    }
}
