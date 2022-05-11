package kachanovich.lesson14.examclouds.lambda.task7;

import kachanovich.lesson14.examclouds.lambda.task1.Printable;

public class Task7{

    public static void main(String[] args) {
        Printable printable = System.out::println;
        printable.print("Gus7");
    }

}
