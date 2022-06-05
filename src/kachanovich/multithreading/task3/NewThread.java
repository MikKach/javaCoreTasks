package kachanovich.multithreading.task3;

public class NewThread extends Thread {
    private StringBuilder lock ;

    public NewThread(StringBuilder lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 100; i++) {
                System.out.print(lock + " ");
            }
            System.out.println();
            int num = (int)lock.charAt(0);
            num++;
            lock.setCharAt(0,(char)num);
        }
    }
}
