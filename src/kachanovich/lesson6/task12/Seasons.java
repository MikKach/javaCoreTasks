package kachanovich.lesson6.task12;

public enum Seasons {
    WINTER("Зима",-10, "холодно"),
    SPRING("Весна",10, "тепло"),
    SUMMER("Лето",25, "жарко") {
        @Override
        public String getDescriptions() {
            return "Теплое время года";
        }
    },
    AUTUMN("Осень",5, "холодно");

    private final String season;
    private final int temperature;
    private final String description;

    Seasons(String season, int temperature, String description) {
        this.season =season;
        this.temperature = temperature;
        this.description = description;
    }

    public String getDescriptions() {
        return "Холодное время года";
    }
    public void showsThatILove(Seasons seasons){
        switch (seasons){
            case WINTER:{ System.out.println("Я люблю зиму");
            break;
            }
            case SPRING:{
                System.out.println("Я люблю весну");
                break;
            }
            case SUMMER:{
                System.out.println("Я люблю лето");
                break;
            }
            case AUTUMN:{
                System.out.println("Я люблю осень");
                break;
            }

        }
    }

    public String getDescription() {
        return description;
    }

    public String getSeason() {
        return season;
    }

    public int getTemperature() {
        return temperature;
    }
}
