package kachanovich.lesson6.task8;

import java.util.Objects;

public abstract class Shape {
    /*
    8 Создайте супер класс Shape и его наследники Circle, Rectangle. Класс Shape содержит абстрактный
    метод draw() и переменную хранящую цвет.
    Классы Circle, Rectangle содержат координаты точек.
    Создать массив содержащий эти фигуры. В цикле нарисовать их (вызвать метод draw).
    Добавить метод equals() для классов Shape, Circle, Rectangle.
     */
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
