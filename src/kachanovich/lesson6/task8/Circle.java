package kachanovich.lesson6.task8;

import java.util.Objects;

public class Circle extends Shape {
    private int circleX;
    private int circleY;

    public Circle() {
    }

    public Circle(String color, int circleX, int circleY) {
        super(color);
        this.circleX = circleX;
        this.circleY = circleY;
    }

    @Override
    public void draw() {
        System.out.printf("Рисует круг с координатами x=%d y=%d цветом %s\n", circleX,circleY,this.getColor());
    }

    public int getCircleX() {
        return circleX;
    }

    public void setCircleX(int circleX) {
        this.circleX = circleX;
    }

    public int getCircleY() {
        return circleY;
    }

    public void setCircleY(int circleY) {
        this.circleY = circleY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return circleX == circle.circleX && circleY == circle.circleY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), circleX, circleY);
    }
}
