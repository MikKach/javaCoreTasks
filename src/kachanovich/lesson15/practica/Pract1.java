package kachanovich.lesson15.practica;

public class Pract1 implements Testeble{

    @Override
    public void test(int a) {

    }

    @Override
    public int testing(int a) {
        return Testeble.super.testing(a);
    }

    int testStat(int a){
        return a;
    }
}
