package kachanovich.lesson4;

public class Task1 {
    public static void main(String[] args) {
        double ranDistace = 10;
        double distance = 0;
        for (int i = 0; i < 7; i++) {
            distance += ranDistace;
            ranDistace += ranDistace * 0.1;
        }
        System.out.println("За 7 дней спортсмен пробежал " + (int)distance + " километра");
    }
}
