package kachanovich.lesson13.arrayListTasks;

import java.util.ArrayList;
import java.util.List;

public class Task16 {
    public static void main(String[] args) {
        ArrayList<String> list_color = new ArrayList<>();
        list_color.add("Red");
        list_color.add("Green");
        list_color.add("Yellow");
        list_color.add("Black");
        System.out.println(list_color);
        List<String> listNew = (ArrayList<String>)list_color.clone();
        System.out.println(listNew);
    }
}
