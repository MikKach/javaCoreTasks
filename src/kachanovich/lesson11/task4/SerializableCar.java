package kachanovich.lesson11.task4;

import java.io.*;

public class SerializableCar {
    public static void main(String[] args) {
        Car car1 = new Car("BMV", 300, 50000);
        try (FileOutputStream fileOutputStream = new FileOutputStream("catSerilizable.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            objectOutputStream.writeObject(car1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

