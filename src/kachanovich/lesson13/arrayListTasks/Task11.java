package kachanovich.lesson13.arrayListTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        List<String> list_color = new ArrayList<>();
        list_color.add("Red");
        list_color.add("Green");
        list_color.add("Yellow");
        list_color.add("Black");
        System.out.println(list_color);
        String color = list_color.get(0);
        list_color.set(0,list_color.get(list_color.size()-1));
        list_color.set(list_color.size()-1,color );
        System.out.println(list_color);
        Collections.reverse(list_color);
        System.out.println(list_color);
    }
}
