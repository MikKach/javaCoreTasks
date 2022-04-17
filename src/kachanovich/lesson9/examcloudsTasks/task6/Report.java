package kachanovich.lesson9.examcloudsTasks.task6;

public class Report {
    public static void generateReport(Employee[] employees){
        System.out.printf("Фамилия     Зарплата\n");
        System.out.println("--------------------");
        for (Employee el: employees) {
            System.out.printf("%-13s%5.2f\n",el.getFullname(),el.getSalary());
        }
    }
}
