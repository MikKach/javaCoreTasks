package kachanovich.lesson6.task8;

import java.util.Objects;

public class Rectangle extends Shape {
    private int rectangleX;
    private int rectangleY;

    public Rectangle() {
    }

    public Rectangle(String color, int rectangleX, int rectangleY) {
        super(color);
        this.rectangleX = rectangleX;
        this.rectangleY = rectangleY;
    }

    @Override
    public void draw() {
        System.out.printf("Рисует прямоугольник с координатами x=%d y=%d цветом %s\n", rectangleX,rectangleY,this.getColor());
    }

    public int getRectangleX() {
        return rectangleX;
    }

    public void setRectangleX(int rectangleX) {
        this.rectangleX = rectangleX;
    }

    public int getRectangleY() {
        return rectangleY;
    }

    public void setRectangleY(int rectangleY) {
        this.rectangleY = rectangleY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return rectangleX == rectangle.rectangleX && rectangleY == rectangle.rectangleY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rectangleX, rectangleY);
    }
}
