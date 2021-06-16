package controllers;
import java.io.Serializable;

public class UniversityFootballClub extends FootballClub implements Serializable {
    //attributes
    private String uniName;
    private String uniId;

    public UniversityFootballClub() { //no argument constructor
    }

    public UniversityFootballClub(String clubName, String clubLocation, String clubStatistics, String bestPlayer, String country, String captainName, String viceCaptainName, String noOfPremierLeaguesWon, String uniName, String uniId) {//argument constructor
        super(clubName, clubLocation, clubStatistics, bestPlayer, country, captainName, viceCaptainName, noOfPremierLeaguesWon);
        this.uniName = uniName;
        this.uniId = uniId;
    }
    //getters and setters
    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getUniId() {
        return uniId;
    }

    public void setUniId(String uniId) {
        this.uniId = uniId;
    }
    //to string method
    @Override
    public String toString() {
        return "University FootballClub " + " football club Name " + getClubName() +
                " \n football location " + getClubLocation() +
                " \n football statistics " + getClubStatistics() +
                " \n best players " + getBestPlayer() +
                " \n country " + getCountry() +
                " \n captain name " + getCaptainName() +
                " \n vice captain name " + getViceCaptainName() +
                " \n No of victory  " + getNoOfPremierLeaguesWon() +
                " \n country " + getCountry() +
                " \n captain name " + getCaptainName() +
                " \n university Id " + uniId +
                " \n university name " + uniName;

    }
}
