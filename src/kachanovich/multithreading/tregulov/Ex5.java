package kachanovich.multithreading.tregulov;

public class Ex5 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("Name myThread1= "+ myThread1.getName() + " Priority = " + myThread1.getPriority());
        MyThread2 myThread2 = new MyThread2();
        System.out.println("Name myThread2= "+ myThread2.getName() + " Priority = " + myThread2.getPriority());
        myThread1.setName("Thread 111111111111111");
        System.out.println("Name myThread1= "+ myThread1.getName() + " Priority = " + myThread1.getPriority());
    }
}
