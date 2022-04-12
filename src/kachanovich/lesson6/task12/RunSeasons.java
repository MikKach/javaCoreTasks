package kachanovich.lesson6.task12;

public class RunSeasons {
    public static void main(String[] args) {
        for (Seasons el : Seasons.values()) {
            System.out.printf("%s, средняя температура сезона %d, ощущение %s\n", el.getSeason(), el.getTemperature(), el.getDescription());
        }
    }
}
