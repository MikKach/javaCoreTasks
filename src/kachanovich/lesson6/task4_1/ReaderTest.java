package kachanovich.lesson6.task4_1;

public class ReaderTest {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 35, "ITTeh", "3.05.1999", 3697425);
        Book book1 = new Book("Приключения", "Савалье Дж.");
        Book book2 = new Book("Словарь", "Жегов Л.П.");
        Book book3 = new Book("Энциклопедия", "Кроп Т.Р.");
        reader1.takeBook(3);
        reader1.returnBook(3);
        reader1.takeBook("Энциклопедия", "Приключения", "Словарь");
        reader1.returnBook("Энциклопедия", "Приключения", "Словарь");
        reader1.takeBook(book1, book2, book3);
        reader1.returnBook(book1, book2, book3);
    }
}
