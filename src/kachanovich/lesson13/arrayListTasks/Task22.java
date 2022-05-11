package kachanovich.lesson13.arrayListTasks;

import java.util.ArrayList;

public class Task22 {
    public static void main(String[] args) {
        ArrayList<String> list_color = new ArrayList<>();
        list_color.add("Red");
        list_color.add("Green");
        list_color.add("Yellow");
        list_color.add("Black");
        System.out.println(list_color);
        for (int i = 0; i < list_color.size(); i++) {
            System.out.println(list_color.get(i));
        }
    }
}
