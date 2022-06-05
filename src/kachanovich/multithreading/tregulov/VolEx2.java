package kachanovich.multithreading.tregulov;

public class VolEx2 extends Thread {
    public static void main(String[] args) {
        MyRunImp1 runnable = new MyRunImp1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;
}

class MyRunImp1 implements Runnable {
    public void implement() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            implement();
        }
    }
}