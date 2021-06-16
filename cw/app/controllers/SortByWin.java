package controllers;

import java.util.Comparator;

public class SortByWin implements Comparator<FootballClub> {

    //CompareTo Method
    @Override
    public int compare(FootballClub o1, FootballClub o2) {
        if (o1.getFootballWin()  <  o2.getFootballWin()){
            return 1;
        }else if (o1.getFootballWin()  >  o2.getFootballWin()){
            return -1;
        }else {
            return 0;
        }
    }

}

