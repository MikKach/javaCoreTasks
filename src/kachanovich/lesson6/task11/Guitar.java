package kachanovich.lesson6.task11;

public class Guitar implements Tool {
    private int numberString;

    public Guitar() {
    }

    public Guitar(int numberString) {
        this.numberString = numberString;
    }

    @Override
    public void play() {
        System.out.printf("Играет гитара, количество струн %s", numberString);
    }

    public int getNumberString() {
        return numberString;
    }

    public void setNumberString(int numberString) {
        this.numberString = numberString;
    }
}
