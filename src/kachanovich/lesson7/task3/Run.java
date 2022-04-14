package kachanovich.lesson7.task3;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Spaceport spaceport1 = new Spaceport();
        spaceport1.launch(new Shuttle());
    }
}
