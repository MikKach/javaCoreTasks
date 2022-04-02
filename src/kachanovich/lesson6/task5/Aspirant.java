package kachanovich.lesson6.task5;

public class Aspirant extends Student {

    private String scientificWork;

    public Aspirant() {
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        if (this.getAverageMark() == 5) {
            return 200;
        } else {
            return 180;
        }
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }
}
