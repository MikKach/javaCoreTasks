package kachanovich.lesson13.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrowserHistory {
    private String homepage;

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
        address.add(url);
        System.out.printf("You are in \"%s\". Visit \"%s\"\n", address.get(indexAddress), url);
        indexAddress++;
    }

    public String back(int steps) {
        if ((indexAddress - steps) <= 0) {
            System.out.printf("You are in \"%s\", move back to \"%s\"\n", address.get(indexAddress), address.get(0));
            indexAddress = 0;
        } else {
            System.out.printf("You are in \"%s\", move back to \"%s\"\n", address.get(indexAddress), address.get(indexAddress - steps));
            indexAddress -= steps;
        }
        return address.get(indexAddress);
    }

    public String forward(int steps) {
        if (indexAddress + steps < address.size()) {
            System.out.printf("You are in \"%s\", move forward to \"%s\"s\n", address.get(indexAddress), address.get(indexAddress + steps));
            indexAddress += steps;
        } else {
            System.out.printf("You are in \"%s\", move forward to \"%s\"\n", address.get(indexAddress), address.get(address.size() - 1));
            indexAddress = address.size() - 1;
        }
        return address.get(indexAddress);
    }
}
