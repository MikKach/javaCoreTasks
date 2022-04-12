package kachanovich.lesson7.task3;

import java.awt.*;
import java.util.Random;

public class Shuttle implements IStart {
    Random random;

    public Shuttle() {
        random = new Random();
    }

    @Override
    public boolean checkSystem() {
        if (random.nextInt(0, 11) > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() throws InterruptedException {

        System.out.println("Старт Шатла");
        for (int i = 0; i < 30; i++) {


            Tools.playDrum(Drum.d76_Hi_Wood_Block, 120, 3000);
            Thread.sleep(200);
            Tools.playNote(Note.i2_Electric_Grand_Piano, Note.i43_Contrabass,127, 3000);
        }
    }
}
