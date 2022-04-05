package kachanovich.lesson7.task2;

import kachanovich.lesson7.task2.jacket.Jacket;
import kachanovich.lesson7.task2.shoes.Shoes;
import kachanovich.lesson7.task2.trousers.Trousers;

public class Human {
    private String name;
    private Jacket jacket;
    private Shoes shoes;
    private Trousers trousers;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public void getDressed(Jacket jacket, Shoes shoes, Trousers trousers) {
        System.out.println(getName());
        setJacket(jacket);
        setShoes(shoes);
        setTrousers(trousers);
        jacket.putOn();
        trousers.putOn();
        shoes.putOn();
    }

    public void getDressed(Shoes shoes, Trousers trousers) {
        System.out.println(getName());
        setShoes(shoes);
        setTrousers(trousers);
        trousers.putOn();
        shoes.putOn();
    }

    public void getDressed(Jacket jacket, Trousers trousers) {
        System.out.println(getName());
        setJacket(jacket);
        setTrousers(trousers);
        jacket.putOn();
        trousers.putOn();
    }

    public void getDressed(Jacket jacket, Shoes shoes) {
        System.out.println(getName());
        setJacket(jacket);
        setShoes(shoes);
        jacket.putOn();
        shoes.putOn();
    }

    public void undress() {
        System.out.println(getName());
        if (this.jacket != null) {
            jacket.pullOff();
            setJacket(null);
        } else {
            System.out.println("Жакет не одет");
        }
        if (this.trousers != null) {
            trousers.pullOff();
            setTrousers(null);
        } else {
            System.out.println("Брюки не одеты");
        }
        if (this.shoes != null) {
            shoes.pullOff();
            setShoes(null);
        } else {
            System.out.println("Ботинки не одеты");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Trousers getTrousers() {
        return trousers;
    }

    public void setTrousers(Trousers trousers) {
        this.trousers = trousers;
    }
}
