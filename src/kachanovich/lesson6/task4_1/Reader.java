package kachanovich.lesson6.task4_1;

public class Reader {
    /*
    4. Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета,
    факультет, дата рождения, телефон. Методы takeBook(), returnBook().
    Разработать программу, в которой создается массив объектов данного класса. Перегрузить методы takeBook(), returnBook():
        - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
        - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение
    "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
        - takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий
        имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
    Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения,
    Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
    Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в
    порядке убывания в противном случае. Использовать рекурсию.
     */

    private String fio;
    private int libraryCardNumber;
    private String faculty;
    private String dateBirth;
    private int phoneNumber;

    public Reader() {
    }

    public Reader(String fio, int libraryCardNumber, String faculty, String dateBirth, int phoneNumber) {
        this.fio = fio;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberBooks) {
        System.out.printf("%s взял %d книги\n", this.fio, numberBooks);
    }

    public void returnBook(int numberBooks) {
        System.out.printf("%s вернул %d книги\n", this.fio, numberBooks);
    }

    public void takeBook(String... title) {
        System.out.printf("%s взял книги: ", this.fio);
        for (int i = 0; i < title.length; i++) {
            System.out.print(title[i]);
            if (i < title.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void returnBook(String... title) {
        System.out.printf("%s вернул книги: ", this.fio);
        for (int i = 0; i < title.length; i++) {
            System.out.print(title[i]);
            if (i < title.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void takeBook(Book... book) {
        System.out.printf("%s взял книги: ", this.fio);
        for (int i = 0; i < book.length; i++) {
            System.out.print(book[i].getTitle());
            if (i < book.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void returnBook(Book... book) {
        System.out.printf("%s вернул книги: ", this.fio);
        for (int i = 0; i < book.length; i++) {
            System.out.print(book[i].getTitle());
            if (i < book.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}
