package kachanovich.myTest.practStream;

import java.util.Objects;

public class Engine {
    private String companyEngine;
    private String typeEngine;
    private double engineCapacity;

    public Engine() {
        this.companyEngine = "Reno";
        this.typeEngine = "R4";
        this.engineCapacity = 2.0;
    }

    public Engine(String companyEngine, String typeEngine, double engineCapacity) {
        this.companyEngine = companyEngine;
        this.typeEngine = typeEngine;
        this.engineCapacity = engineCapacity;
    }

    public String getCompanyEngine() {
        return companyEngine;
    }

    public void setCompanyEngine(String companyEngine) {
        this.companyEngine = companyEngine;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.engineCapacity, engineCapacity) == 0 && Objects.equals(companyEngine, engine.companyEngine) && Objects.equals(typeEngine, engine.typeEngine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyEngine, typeEngine, engineCapacity);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "companyEngine='" + companyEngine + '\'' +
                ", typeEngine='" + typeEngine + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
