package kachanovich.lesson6.computer;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer(4200,2,500);
        computer1.printInfo();
        while (computer1.getResource()>0) {
            computer1.turhOffComputer();
            computer1.turnComputer();
            System.out.println(computer1.getResource());
        }
    }
}
