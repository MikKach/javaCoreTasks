package kachanovich.lesson13.task1;

import java.util.Map;
import java.util.Scanner;

public class Menu {
    StudentMap studentListInMap;
    Map<Integer, Student> studentMap;
    Student student;
    Scanner scanner;

    public Menu() {
        studentListInMap = new StudentMap();
        studentMap = studentListInMap.getStudentMap();
        scanner = new Scanner(System.in);
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
            switch (inputNumber(6)) {
                case 1: {
                    studentListInMap.printStudentMap();
                    studentListInMap.addStudent();
                    studentListInMap.printStudentMap();
                    break;
                }
                case 2: {
                    studentListInMap.printStudentMap();
                    studentListInMap.deleteStudent();
                    studentListInMap.printStudentMap();
                    break;
                }
                case 3: {
                    studentListInMap.printStudentMap();
                    menuStudentEdit();
                    break;
                }
                case 4: {
                    studentListInMap.sortNameAndAge();
                    break;
                }
                case 5: {//TODO доделать
                    studentListInMap.uniqueFaculty();
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

    private void menuStudentEdit() {
        int idEditStudent = studentListInMap.returnID();
        student = studentMap.get(idEditStudent);
        while (true) {
            System.out.println("===========================");
            student.printStudent();
            System.out.println("===========================");
            System.out.println("1 - редактировать имя");
            System.out.println("2 - редактировать возраст");
            System.out.println("3 - редактировать факультет");
            System.out.println("4 - редактировать курс");
            System.out.println("5 - предыдущее меню");
            System.out.println("===========================");
            switch (inputNumber(5)) {
                case 1: {
                    System.out.println("Введите новое имя: ");
                    String newName = scanner.next();
                    scanner.nextLine();
                    student.setName(newName);
                    break;
                }
                case 2: {
                    while (true) {
                        System.out.println("Введите новый возраст: ");
                        try {
                            int newAge = scanner.nextInt();
                            scanner.nextLine();
                            student.setAge(newAge);
                            break;
                        }
                        catch (Exception e){
                            System.out.println("Неверный формат. Повторите ввод...");
                            scanner.nextLine();
                            continue;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Введите новый факультет: ");
                    String newFaculty = scanner.next();
                    scanner.nextLine();
                    student.setFaculty(newFaculty);
                    break;
                }
                case 4: {
                    while (true) {
                        System.out.println("Введите новый курс: ");
                        try {
                            int newCourse = scanner.nextInt();
                            scanner.nextLine();
                            student.setCourse(newCourse);
                            break;
                        }
                        catch (Exception ex){
                            System.out.println("Неверный формат. Повторите ввод...");
                            scanner.nextLine();
                            continue;
                        }
                    }
                    break;
                }
                case 5: {
                    menuStart();
                }
            }
        }
    }


    private int inputNumber(int num) {
        int number = 0;
        System.out.print("Введите номер пункта меню: ");
        while (number < 1) {
            try {
                scanner = new Scanner(System.in);
                number = scanner.nextInt();
                if (number >= 1 || number <= num) {
                    return number;
                } else {
                    System.out.println("Такого пункта не существует. Повторите ввод...");
                    continue;
                }

            } catch (Exception e) {
                System.out.println("Неверный формат. Повторите ввод...");
                continue;
            }
        }
        return 0;
    }
}
