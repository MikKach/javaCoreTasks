package kachanovich.lesson4;

public class Task3 {
    public static void main(String[] args) {
        int value = 1;
        int sum = value;
        do {
            value *= 2;
            sum += value;
        }
        while (value < 256);
        System.out.println("Сумма равна: " + sum);
    }
}
