package controllers;
import java.util.Comparator;

public class SortByDate implements Comparator<MatchSchedule> {

//compareTo method
    @Override
    public int compare(MatchSchedule o1, MatchSchedule o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}

