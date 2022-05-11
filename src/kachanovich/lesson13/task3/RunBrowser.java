package kachanovich.lesson13.task3;

public class RunBrowser {
    public static void main(String[] args) {
        BrowserHistory bhNew = new BrowserHistory("zav.com");
        System.out.println(bhNew.address.toString());
        bhNew.visit("kni.com");
        System.out.println(bhNew.address.toString());
        bhNew.back(7);
        bhNew.printInfo();
        bhNew.back(7);
        bhNew.printInfo();
        bhNew.forward(5);
        bhNew.printInfo();
        bhNew.forward(1);
        bhNew.printInfo();
        bhNew.visit("pwrrbnw.com");
        bhNew.printInfo();
        System.out.println(bhNew.address.toString());
        bhNew.visit("mosohif.com");
        bhNew.printInfo();
        System.out.println(bhNew.address.toString());
        bhNew.back(9);
        bhNew.printInfo();

    }
}
