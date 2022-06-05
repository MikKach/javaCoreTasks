package kachanovich.lesson15.taskFilter;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String names  =  "Tror Gvigris Deriana Nori";
        String[] arrName = names.split(" ");
        int i =(int)Arrays.stream(arrName).filter(e->e.length()==4).count();
    }
}
