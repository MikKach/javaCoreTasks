package kachanovich.multithreading.tregulov;

public class Ex1 {
    public static void main(String[] args) {
        Thread thread1 = new MyThread1();
        Thread thread2 = new MyThread2();
        thread1.start();
        thread2.start();
    }
}

    class MyThread1 extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(this.getName());
                System.out.println(i);
            }
        }
    }

    class MyThread2 extends Thread {
        public void run() {
            for (int i = 10; i > 0; i--) {
                System.out.println(this.getName());
                System.out.println(i);
            }
        }
    }
