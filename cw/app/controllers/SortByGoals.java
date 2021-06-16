package controllers;
import java.util.Comparator;

public class SortByGoals implements Comparator<FootballClub> {
//compareTo Method
    @Override
    public int compare(FootballClub o1, FootballClub o2) {
        if (o1.getGoalScored()  <  o2.getGoalScored()){
            return 1;
        }else if (o1.getGoalScored()  >  o2.getGoalScored()){
            return -1;
        }else {
            return 0;
        }
    }
}

