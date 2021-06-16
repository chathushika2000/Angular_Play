package controllers;
import java.io.Serializable;

public abstract class  SportClub implements Serializable {
    private String clubName;
    private String clubLocation;
    private String clubStatistics;
    private String bestPlayer;


    public SportClub() { //no argument constructor
    }

    public SportClub(String clubName,String clubLocation,String clubStatistics,String bestPlayer){//argument constructor
        this.clubName=clubName;
        this.clubLocation=clubLocation;
        this.clubStatistics=clubStatistics;
        this.bestPlayer = bestPlayer;
    }

    //getters and setters
    public String getClubName(){
        return this.clubName;
    }
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
    public String getClubLocation(){
        return this.clubLocation;
    }
    public void setClubLocation(String clubLocation) {
        this.clubLocation = clubLocation;
    }
    public String getClubStatistics(){
        return this.clubStatistics;
    }
    public void setClubStatistics(String clubStatistics) {
        this.clubStatistics = clubStatistics;
    }

    public String getBestPlayer() {
        return bestPlayer;
    }

    public void setBestPlayer(String bestPlayer) {
        this.bestPlayer = bestPlayer;
    }



}

