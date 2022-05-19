package kachanovich.lesson15.practica;
@FunctionalInterface
public interface Testeble {
    void test (int a);

    default int testing(int a){
        a=100;
        printe(a);
        return a;
    }

    private void printe(int a){
        System.out.println(a);
    }
    static int testStat(int a){
        a=100;
        return a;
    }
}
