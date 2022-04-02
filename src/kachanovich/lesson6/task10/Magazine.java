package kachanovich.lesson6.task10;

public class Magazine implements Printable {
    public static void printMagazines(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Magazine) {
                System.out.print("Печать журнала\n");
            }
        }
    }

    @Override
    public void print() {
        System.out.print("Печать журнала\n");
    }
}
