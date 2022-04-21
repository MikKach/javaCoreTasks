package kachanovich.lesson10.task1;

public class Run {
    public static void main(String[] args) throws CarStartException {
        for (int i = 0; i < 10; i++) {
            try {
                new Car().start();
            }
            catch (CarStartException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
