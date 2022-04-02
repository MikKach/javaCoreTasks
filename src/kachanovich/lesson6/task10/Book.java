package kachanovich.lesson6.task10;

public class Book implements Printable {
    public static void printBooks(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Book) {
                System.out.print("Печать книги\n");
            }
        }
    }

    @Override
    public void print() {
        System.out.printf("Печать книги\n");
    }
}
