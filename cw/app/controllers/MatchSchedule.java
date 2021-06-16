package controllers;
import java.io.Serializable;

public class MatchSchedule implements Serializable {
    private String teamOne;
    private String teamTwo;
    private String date;
    private String teamOneScore;
    private String teamTwoScore;

    public MatchSchedule(){//no argument constructor
    }

    public MatchSchedule(String teamOne, String teamTwo, String date, String teamOneScore,String teamTwoScore) {// argument Constructor
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
        this.date    = date;
        this.teamOneScore = teamOneScore;
        this.teamTwoScore = teamTwoScore;
    }

    //getters and setters
    public String getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(String teamOne) {
        this.teamOne = teamOne;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(String teamTwo) {
        this.teamTwo = teamTwo;
    }

    public String getDate() {
        return date;
    }

    public String getTeamOneScore() {
        return teamOneScore;
    }

    public void setTeamOneScore(String teamOneScore) {
        this.teamOneScore = teamOneScore;
    }

    public String getTeamTwoScore() {
        return teamTwoScore;
    }

    public void setTeamTwoScore(String teamTwoScore) {
        this.teamTwoScore = teamTwoScore;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // to String method
    @Override
    public String toString() {
        return "MatchSchedule\n" +
                "\nteamOne        =>" + teamOne +
                "\nteamTwo        =>" + teamTwo +
                "\ndate           =>" + date +
                "\nteamOneScore   =>" + teamOneScore +
                "\nteamTwoScore   =>" + teamTwoScore;

    }
}

