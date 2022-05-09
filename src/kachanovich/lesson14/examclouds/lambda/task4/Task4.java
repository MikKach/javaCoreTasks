package kachanovich.lesson14.examclouds.lambda.task4;

import java.util.function.Consumer;

public class Task4 {
    public static void main(String[] args) {
        Consumer<HeavyBox> consumer= (e)-> System.out.printf("Отгрузили ящик с весом %d.\n", e.getWeight());
        Consumer<HeavyBox> consumer1 = (e)-> System.out.printf("Отправляем ящик с весом %d\n",e.getWeight());
        HeavyBox heavyBox = new HeavyBox(32);
        consumer.accept(new HeavyBox(32));
        consumer1.accept(new HeavyBox(25));
        consumer.andThen(consumer1).accept(new HeavyBox(245));
    }
}
