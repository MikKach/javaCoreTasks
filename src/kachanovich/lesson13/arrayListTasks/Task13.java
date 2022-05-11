package kachanovich.lesson13.arrayListTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        List<String> list_color = new ArrayList<>();
        list_color.add("Red");
        list_color.add("Green");
        list_color.add("Yellow");
        list_color.add("Black");
        System.out.println(list_color);
        List<String> listNew = new ArrayList<>();
        listNew.add("Red");
        listNew.add("Green");
        listNew.add("Yello");
        listNew.add("Black");
        List<String> listNewNew = new ArrayList<>();
        for (String e : list_color)
            listNewNew.add(listNew.contains(e) ? "Yes" : "No");
        System.out.println(listNewNew);
    }
}
