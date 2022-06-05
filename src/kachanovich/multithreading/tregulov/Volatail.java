package kachanovich.multithreading.tregulov;

public class Volatail extends Thread {
   boolean b = true;

    public void run() {
        System.out.println("Start thread");
        long count = 0;
        while (b) {
            count++;
        }
        System.out.println("Finish thread, count= " + count);
    }

    public static void main(String[] args) {
        Volatail thread1 = new Volatail();
        System.out.println("Start main");
        thread1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread1.b = false;
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main finish");
    }
}
