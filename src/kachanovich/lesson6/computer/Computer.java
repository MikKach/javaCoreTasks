package kachanovich.lesson6.computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    /*
    Поля:
- процессор
- оперативка
- жесткий диск
- ресурс полных циклов работы (включений/выключений)
Методы:
- метод описание(вывод всех полей)
- метод включить, при включении может произойти сбой, при вывзове метода
рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
угадали комп выключается, если нет сгорает.Если комп сгорел, при попытке
включить нужно выдать сообщение что ему конец
- выключить (аналогично включению)
- при превышении лимита ресурса комп сгорает
     */
    private int cpu;
    private int ram;
    private int hdd;
    private int resource;
    private boolean turn = false;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public Computer() {
    }

    public Computer(int cpu, int ram, int hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = 10;
    }

    public void printInfo() {
        System.out.printf("CPU: %d\nRAM: %d\nHDD: %d\nResource: %d\n", this.cpu, this.ram, this.hdd, this.resource);
    }

    public void turnComputer() {
        if (this.turn == true) {
            System.out.println("Компьютер работает, включать не надо.");
            return;
        }
        if (this.resource <= 0) {
            System.out.println("Компьютер сгорел");
            return;
        }
        int number = random.nextInt(0, 2);
        System.out.println("Введите число 0 или 1");
        int numberUser;
        while (true) {
            numberUser = scanner.nextInt();
            if (numberUser == 0 || numberUser == 1) {
                scanner.nextLine();
                break;
            }
        }
        if (number == numberUser) {
            this.resource--;
            this.turn = true;
            System.out.println("Компьютер включился");
        } else {
            System.out.println("Компьютер не включился");
        }
    }

    public void turhOffComputer() {
        if (this.turn == false) {
            System.out.println("Компьютер не работает, выключать не надо.");
            return;
        }
        if (this.resource <= 0) {
            System.out.println("Компьютер сгорел");
            return;
        }
        int number = random.nextInt(0, 2);
        System.out.println("Введите число 0 или 1");
        int numberUser;
        while (true) {
            numberUser = scanner.nextInt();
            if (numberUser == 0 || numberUser == 1) {
                scanner.nextLine();
                break;
            }
        }
        if (number == numberUser) {
            this.resource--;
            this.turn = false;
            System.out.println("Компьютер выключился");
        } else {
            System.out.println("Компьютер не выключился");
        }
    }

    public int getResource() {
        return resource;
    }
}
