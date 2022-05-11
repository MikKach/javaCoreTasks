package kachanovich.lesson14.examclouds.lambda.task5;

import java.util.function.Function;

public class Task5 {
    public static void main(String[] args) {
        Function<Integer,String> function = num->{
            if(num>0)return "Положительное число";
            else if (num==0)return "Ноль";
            else return "Отрицательное число";
        };
        System.out.println(function.apply(6));
    }
}
