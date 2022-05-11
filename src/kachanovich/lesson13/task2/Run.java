package kachanovich.lesson13.task2;

public class Run {
    public static void main(String[] args) {
        StudentsList studentsList =new StudentsList();
        studentsList.addStudentInList("Mik","25T",2,2.8);
        studentsList.addStudentInList("Liko","16R",4,4.1);
        studentsList.addStudentInList("Jora","77W",1,3.1);
        studentsList.addStudentInList("Moris","18Q",3,2.1);
        studentsList.addStudentInList("Reo","22C",1,4.3);
        studentsList.addStudentInList("Leo","17V",2,2.4);
        studentsList.addStudentInList("Seo","36L",4,5.0);
        studentsList.printListStudent();
        studentsList.printStudents(studentsList.getStudentList(),1);
        studentsList.deleteStudent();
        studentsList.nextCourse();
    }
}
