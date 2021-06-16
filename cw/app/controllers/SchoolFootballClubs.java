package controllers;
import java.io.Serializable;

public class SchoolFootballClubs extends FootballClub implements Serializable {
    //Attributes
    private String schoolName;
    private String schoolId;

    public SchoolFootballClubs() { //no argument constructor
    }

    public SchoolFootballClubs(String clubName, String clubLocation, String clubStatistics, String bestPlayer, String country, String captainName, String viceCaptainName, String noOfPremierLeaguesWon, String schoolName, String schoolId) {// Argument Constructor
        super(clubName, clubLocation, clubStatistics, bestPlayer, country, captainName, viceCaptainName, noOfPremierLeaguesWon);
        this.schoolName = schoolName;
        this.schoolId = schoolId;
    }
//getters and setters
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    //toString method
    @Override
    public String toString() {
        return "FootballClub " + " football club Name " + getClubName() +
                " \n football location " + getClubLocation() +
                " \n football statistics " + getClubStatistics() +
                " \n best players " + getBestPlayer() +
                " \n country " + getCountry() +
                " \n captain name " + getCaptainName() +
                " \n vice captain name " + getViceCaptainName() +
                " \n No of victory  " + getNoOfPremierLeaguesWon() +
                " \n country " + getCountry() +
                " \n captain name " + getCaptainName()+
                " \n School Id " + schoolId +
                " \n School name " + schoolName;


    }


}

