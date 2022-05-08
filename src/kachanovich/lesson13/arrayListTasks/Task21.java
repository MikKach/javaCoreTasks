package kachanovich.lesson13.arrayListTasks;

import java.util.ArrayList;

public class Task21 {
    public static void main(String[] args) {
        ArrayList<String> list_color = new ArrayList<>();
        list_color.add("Red");
        list_color.add("Green");
        list_color.add("Yellow");
        list_color.add("Black");
        System.out.println(list_color);
        list_color.set(2,"Pink");
        System.out.println(list_color);
    }
}
