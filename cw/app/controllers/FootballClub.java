package controllers;
import java.io.Serializable;
import java.util.Objects;

public class FootballClub extends SportClub implements Serializable,Comparable<FootballClub> {
    //attributes
    private int footballWin;
    private int footballDraws;
    private int footballDefeats;
    private int goalsReceived;
    private int goalScored;
    private int footballPoints;
    private int matchesPlayed;
    private String country;
    private String captainName;
    private String viceCaptainName;
    private String noOfPremierLeaguesWon;

//arguments constructor
    public FootballClub(String clubName, String clubLocation, String clubStatistics, String bestPlayer, String country, String captainName, String viceCaptainName, String noOfPremierLeaguesWon) {
        super(clubName, clubLocation, clubStatistics, bestPlayer);
        this.country = country;
        this.captainName = captainName;
        this.viceCaptainName = viceCaptainName;
        this.noOfPremierLeaguesWon = noOfPremierLeaguesWon;
    }

    public FootballClub() { //no argument constructor
    }
//getters and setters
    public int getFootballWin() {
        return footballWin;
    }

    public void setFootballWin(int footballWin) {
        this.footballWin = getFootballWin() + footballWin;
    }

    public int getFootballDraws() {
        return footballDraws;
    }

    public void setFootballDraws(int footballDraws) {
        this.footballDraws = getFootballDraws()  + footballDraws;
    }

    public int getFootballDefeats() {
        return footballDefeats;
    }

    public void setFootballDefeats(int footballDefeats) {
        this.footballDefeats = getFootballDefeats() + footballDefeats;
    }

    public int getGoalsReceived() {
        return goalsReceived;
    }

    public void setGoalsReceived(int goalsReceived) {
        this.goalsReceived = getGoalsReceived() + goalsReceived;
    }

    public int getGoalScored() {
        return goalScored;
    }

    public void setGoalScored(int goalScored) {
        this.goalScored = getGoalScored() + goalScored;
    }

    public int getFootballPoints() {
        return footballPoints;
    }

    public void setFootballPoints(int footballPoints) {
        this.footballPoints = getFootballPoints() + footballPoints;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = getMatchesPlayed() + matchesPlayed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCaptainName() {
        return captainName;
    }

    public void setCaptainName(String captainName) {
        this.captainName = captainName;
    }

    public String getViceCaptainName() {
        return viceCaptainName;
    }

    public void setViceCaptainName(String viceCaptainName) {
        this.viceCaptainName = viceCaptainName;
    }

    public String getNoOfPremierLeaguesWon() {
        return noOfPremierLeaguesWon;
    }

    public void setNoOfPremierLeaguesWon(String noOfPremierLeaguesWon) {
        this.noOfPremierLeaguesWon = noOfPremierLeaguesWon;
    }
// toString Method
    @Override
    public String toString() {
        return "FootballClub " + " football club Name " + getClubName() +
                " \n football location " + getClubLocation() +
                " \n football statistics " + getClubStatistics() +
                " \n best players " + getBestPlayer() +
                " \n country " + getCountry() +
                " \n captain name " + getCaptainName() +
                " \n vice captain name " + getViceCaptainName() +
                " \n No of victory  " + getNoOfPremierLeaguesWon();

    }
// equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballClub that = (FootballClub) o;
        return footballWin == that.footballWin &&
                footballDraws == that.footballDraws &&
                footballDefeats == that.footballDefeats &&
                goalsReceived == that.goalsReceived &&
                goalScored == that.goalScored &&
                footballPoints == that.footballPoints &&
                matchesPlayed == that.matchesPlayed &&
                Objects.equals(country, that.country) &&
                Objects.equals(captainName, that.captainName) &&
                Objects.equals(viceCaptainName, that.viceCaptainName) &&
                Objects.equals(noOfPremierLeaguesWon, that.noOfPremierLeaguesWon);
    }

    // hashcode method
    @Override
    public int hashCode() {
        return Objects.hash(footballWin, footballDraws, footballDefeats, goalsReceived, goalScored, footballPoints, matchesPlayed, country, captainName, viceCaptainName, noOfPremierLeaguesWon);
    }

    //CompareTo method
    @Override
    public int compareTo(FootballClub o) {

        if (o.getFootballPoints()  > this.getFootballPoints() ){
            return 1;
        }else if (o.getFootballPoints()  < this.getFootballPoints()){
            return -1;
        }else {
            if (o.getGoalsReceived() - o.getGoalScored() > goalsReceived- goalScored){
                return 1;
            }if (o.getGoalsReceived() - o.getGoalScored() < goalsReceived- goalScored){
                return -1;
            }else {
                return 0;
            }
        }
    }



}
