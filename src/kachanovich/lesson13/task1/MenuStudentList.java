package kachanovich.lesson13.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MenuStudentList {
    private StudentList studentList;
    private ArrayList<Student> studentArrayList;
    private Student student;
    private Scanner scanner;

    public MenuStudentList() {
        studentList = new StudentList();
        studentArrayList = studentList.getStudentsArrayList();
        scanner = new Scanner(System.in);
    }

    public void start() {
        studentList = new StudentList();
        Student student;
        for (int i = 0; i < 50; i++) {
            student = new Student();
            this.studentList.addStudentToList(student);
        }
        menuStart();
    }

    private int inputNumber() {
        int number = 0;
        System.out.print("Введите номер пункта меню: ");
        while (number < 1) {
            try {
                scanner = new Scanner(System.in);
                number = scanner.nextInt();
                if (number >= 1 || number < Student.getID()) {
                    return number;
                } else {
                    System.out.println("Такого ID не существует. Повторите ввод...");
                    continue;
                }

            } catch (Exception e) {
                System.out.println("Неверный формат. Повторите ввод...");
                continue;
            }
        }
        return 0;
    }

    public void menuStart() {
        while (true) {
            System.out.println("========================================================================================");
            System.out.println("1 - добавление нового студента в список");
            System.out.println("2 - удаление студента из списка по id");
            System.out.println("3 - редактирование студента по id");
            System.out.println("4 - получить всех студентов в отсортированном виде по имени и возрасту");
            System.out.println("5 - получить все уникальные факультеты и имена студентов и их возраст на этом факультете");
            System.out.println("6 - выход");
            System.out.println("========================================================================================");
            switch (inputNumber()) {
                case 1: {
                    studentList.addNewStudentToList(new Student());
                    studentList.printStudentList();
                    break;
                }
                case 2: {
                    studentList.deletingStudentByID();
                    break;
                }
                case 3: {//TODO
                    menuEditiongStudent();
                    break;
                }
                case 4: {
                    System.out.println("вывод отсортированых студентов");
                    break;
                }
                case 5: {
                    System.out.println("уникальные студенты");
                    break;
                }
                case 6: {
                    System.out.println("===========================================================");
                    System.out.println("Работа завершена...");
                    System.out.println("===========================================================");
                    System.exit(0);
                }
            }
        }
    }

    public void menuEditiongStudent() {
        int idToEdit = studentList.returnID();
        Student studentWork ;
        Iterator<Student> iterator = studentArrayList.iterator();
        while (iterator.hasNext()) {
            Student studentIterator = iterator.next();
            if (studentIterator.getIdStudent() == idToEdit) {
                student = studentIterator;
            }
        }
        student.printStudent();
        System.out.println("===========================");
        System.out.println("1 - редактировать имя");
        System.out.println("2 - редактировать возраст");
        System.out.println("3 - редактировать факультет");
        System.out.println("4 - редактировать курс");
        System.out.println("5 - предыдущее меню");
        System.out.println("===========================");
        switch (inputNumber()) {
            case 1: {
                System.out.println("Новое имя");
                break;
            }
            case 2: {
                System.out.println("Новый возраст");
                break;
            }
            case 3: {
                System.out.println("Новый факультет");
                break;
            }
            case 4: {
                System.out.println("Новый курс");
                break;
            }
            case 5: {
                System.out.println("предыдущее меню");
            }
        }
    }
}
