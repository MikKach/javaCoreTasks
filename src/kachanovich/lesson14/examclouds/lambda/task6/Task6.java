package kachanovich.lesson14.examclouds.lambda.task6;

import java.util.Random;
import java.util.function.Supplier;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier supplier = ()->random.nextInt(1,10);
        System.out.println(supplier.get());
    }
}
