package kachanovich.lesson7.task3;


public class Spaceport {
    public void launch(IStart iStart) throws InterruptedException {
        if (iStart.checkSystem()){
            iStart.engineStarting();
            for (int i = 10; i >0; i--) {
                System.out.printf("%d",i);
                Thread.sleep(20);
                System.out.printf("\r");
            }
            iStart.start();
        }
        else {
            System.out.println("Предстартовая проверка провалена.");
        }
    }

}
