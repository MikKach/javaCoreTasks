package kachanovich.lesson13.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrowserHistory {
    List<String> address;
    private int indexAddress;
    public BrowserHistory() {
    }

    public BrowserHistory(String homepage) {
        address = new ArrayList<>();
        address.add(homepage);
        indexAddress = 0;
    }

    public void visit(String url) {
        if (address.size() > indexAddress + 1) {
            address.subList(indexAddress + 1, address.size()).clear();
        }
        address.add(url);
        indexAddress++;
    }


    public String back(int steps) {
        if (indexAddress - steps <= 0) {
            indexAddress = 0;
        } else {
            indexAddress -= steps;
        }
        return address.get(indexAddress);
    }

    public void printInfo() {
        System.out.println(address.get(indexAddress));
    }

    public String forward(int steps) {
        if (indexAddress + steps >= address.size()) {
            indexAddress = address.size() - 1;
        } else {
            indexAddress += steps;
        }
        return address.get(indexAddress);
    }


}
