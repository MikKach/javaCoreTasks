package kachanovich.lesson6.task5;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Дорн", "C85", 4.6);
        Student student2 = new Student("Валерий", "Поляк", "H35", 5.0);
        Student student3 = new Aspirant("Николай", "Михайлов", "P87", 4.7, "Будущее, как цель.");
        Student student4 = new Aspirant("Сергей", "Гамон", "Л55", 5.0, "Любовь или размножение.");

        Student [] studentArray = {student1,student2,student3,student4};

        for (Student el:studentArray) {
            System.out.printf("%s %s, группа %s стипендия: %d\n",el.getFirstName(),el.getLastName(),el.getGroup(),el.getScholarship());
        }
    }
}
