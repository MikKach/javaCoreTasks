package kachanovich.multithreading.tregulov;

public class Ex7 {
    public static void main(String[] args) {
        for (int i = 5; i>0 ; i--) {
            System.out.printf("%d \r",i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
