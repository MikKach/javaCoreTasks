package kachanovich.lesson6.task8;

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle1 = new Circle("Red", 1, 2);
        Shape circle2 = new Circle("Yellow", 4, 6);
        Shape rec1 = new Rectangle("Black", 4, 2);
        Shape rec2 = new Rectangle("Green", 7, 3);

        Shape[] shape = {circle1,circle2,rec1,rec2};
        for (Shape el : shape) {
            el.draw();
        }

    }
}
