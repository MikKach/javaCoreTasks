package kachanovich.lesson11.task4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesializableCar {
    public static void main(String[] args) {
        Car car;
        try (FileInputStream fileInputStream = new FileInputStream("catSerilizable.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            car = (Car) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(car.toString());
    }
}
