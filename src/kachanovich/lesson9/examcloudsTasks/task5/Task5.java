package kachanovich.lesson9.examcloudsTasks.task5;

public class Task5 {
    /*
    Создать строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету].
    Форматирование и вывод строки на консоль написать в отдельном методе, который принимает фамилию,
    оценку и название предмета в качестве параметров. Выделить под фамилию 15 символов,
    под оценку 3 символа, под предмет – 10.
     */
    public static void main(String[] args) {
        Student st1 = new Student("Петров", 4, "История");
        Student st2 = new Student("Жуковичище", 3, "Рисование");
        Student st3 = new Student("Сук", 5, "Программирование");
        st1.printInfo();
        st2.printInfo();
        st3.printInfo();
    }
}
