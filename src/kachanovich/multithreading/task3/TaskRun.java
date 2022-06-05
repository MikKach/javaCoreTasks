package kachanovich.multithreading.task3;

public class TaskRun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a");
        NewThread newThread1 = new NewThread(sb);
        NewThread newThread2 = new NewThread(sb);
        NewThread newThread3 = new NewThread(sb);
        newThread1.start();
        newThread2.start();
        newThread3.start();

    }
}
