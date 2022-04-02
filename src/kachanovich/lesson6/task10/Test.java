package kachanovich.lesson6.task10;

import static kachanovich.lesson6.task10.Book.printBooks;
import static kachanovich.lesson6.task10.Magazine.printMagazines;

public class Test {
    public static void main(String[] args) {
        Printable printable1 = new Book();
        Printable printable2 = new Magazine();
        Printable printable3 = new Book();
        Printable printable4 = new Book();
        Printable printable5 = new Magazine();
        Printable printable6 = new Book();
        Printable printable7 = new Magazine();
        Printable[] printablesArray = {printable1, printable2, printable3, printable6, printable4, printable7, printable5};
        for (int i = 0; i < printablesArray.length; i++) {
            printablesArray[i].print();
        }
        System.out.println();
        printBooks(printablesArray);
        printMagazines(printablesArray);
    }
}
