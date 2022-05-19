package kachanovich.lesson15.taskFilter;

import java.util.Comparator;

public class SortedPeopleName implements Comparator<People>{
    @Override
    public int compare(People o1, People o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

