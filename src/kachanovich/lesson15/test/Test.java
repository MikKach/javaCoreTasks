package kachanovich.lesson15.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a1");
        int[] arrInt = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            arrInt[i] = Integer.parseInt(String.valueOf(s.charAt(1)));
        }
        System.out.println(Arrays.toString(arrInt));
    }
}
