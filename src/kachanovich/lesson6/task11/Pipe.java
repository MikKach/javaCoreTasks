package kachanovich.lesson6.task11;

public class Pipe implements Tool {
    private int diameterPipe;

    public Pipe() {
    }

    public Pipe(int diameterPipe) {
        this.diameterPipe = diameterPipe;
    }

    @Override
    public void play() {
        System.out.printf("Играет труба, её диаметр %s\n", diameterPipe);
    }

    public int getDiameterPipe() {
        return diameterPipe;
    }

    public void setDiameterPipe(int diameterPipe) {
        this.diameterPipe = diameterPipe;
    }
}
