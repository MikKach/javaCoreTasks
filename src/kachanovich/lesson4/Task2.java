package kachanovich.lesson4;

public class Task2 {
    public static void main(String[] args) {
        int hour = 0;
        int numberAmoebas = 1;
        do {
            hour += 3;
            numberAmoebas *= 2;
            System.out.println("Через " + hour + " часа будет " + numberAmoebas + " амеб.");
        }
        while (hour < 24);

    }
}
