package kachanovich.lesson6.task11;

public class Drum implements Tool {
    private int stringDrum;

    public Drum() {
    }

    public Drum(int stringDrum) {
        this.stringDrum = stringDrum;
    }

    @Override
    public void play() {
        System.out.printf("Играет барабан, его размер %s\n", stringDrum);
    }

    public int getStringDrum() {
        return stringDrum;
    }

    public void setStringDrum(int stringDrum) {
        this.stringDrum = stringDrum;
    }
}
