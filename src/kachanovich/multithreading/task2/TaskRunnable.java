package kachanovich.multithreading.task2;

public class TaskRunnable implements Runnable {
    private String nameThread;

    public TaskRunnable(String nameThread) {
        this.nameThread = nameThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.printf("%s - %d\n", nameThread, i);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        TaskRunnable thread1 = new TaskRunnable("Thread1");
        TaskRunnable thread2 = new TaskRunnable("Thread2");
        TaskRunnable thread3 = new TaskRunnable("Thread3");
        thread1.run();
        thread2.run();
        thread3.run();
    }
}
