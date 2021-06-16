package controllers;

import org.junit.Test;

import static org.junit.Assert.*;

public class SportClubTest {

    @Test
    public void getClubName() {
        String tstClubName = ("Chathu");
        SportClub ClubName = new FootballClub("Chathu","Matara","Chathu","Thushamini","Sri Lanka","thushamini","Chathushika","15");
        String ActualOutputClubName = ClubName.getClubName();
        assertEquals("get ClubName",tstClubName,ActualOutputClubName);
    }

    @Test
    public void setClubName() {
        String tstClubName="thusha";
        SportClub footballClub_ClubName = new FootballClub("thusha","Colombo","thusha","Thusha","India","Tharushi","Nishara","17");
        footballClub_ClubName.setClubName(tstClubName);
        assertEquals("Set ClubName",footballClub_ClubName.getClubName(),tstClubName);
    }

    @Test
    public void getClubLocation() {
        String tstClubLocation = ("Matara");
        SportClub ClubLocation = new FootballClub("Chathu","Matara","Chathu","Thushamini","Sri Lanka","thushamini","Chathushika","15");
        String ActualOutputClubLocation = ClubLocation.getClubLocation();
        assertEquals("get ClubLocation",tstClubLocation,ActualOutputClubLocation);
    }

    @Test
    public void setClubLocation() {
        String tstClubLocation="Colombo";
        SportClub footballClub_ClubLocation = new FootballClub("thusha","Colombo","thusha","Thusha","India","Tharushi","Nishara","17");
        footballClub_ClubLocation.setClubLocation(tstClubLocation);
        assertEquals("Set ClubLocation",footballClub_ClubLocation.getClubLocation(),tstClubLocation);
    }

    @Test
    public void getClubStatistics() {
        String tstClubStatistics = ("Chathu");
        SportClub ClubStatistics = new FootballClub("Chathu","Matara","Chathu","Thushamini","Sri Lanka","thushamini","Chathushika","15");
        String ActualOutputClubStatistics = ClubStatistics.getClubStatistics();
        assertEquals("get ClubStatistics",tstClubStatistics,ActualOutputClubStatistics);
    }

    @Test
    public void setClubStatistics() {
        String tstClubStatistics="thusha";
        SportClub footballClub_ClubStatistics = new FootballClub("thusha","Colombo","thusha","Thusha","India","Tharushi","Nishara","17");
        footballClub_ClubStatistics.setClubStatistics(tstClubStatistics);
        assertEquals("Set ClubStatistics",footballClub_ClubStatistics.getClubStatistics(),tstClubStatistics);
    }

    @Test
    public void getBestPlayer() {
        String tstBestPlayer = ("Thushamini");
        SportClub BestPlayer = new FootballClub("Chathu","Matara","Chathu","Thushamini","Sri Lanka","thushamini","Chathushika","15");
        String ActualOutputBestPlayer = BestPlayer.getBestPlayer();
        assertEquals("get BestPlayer",tstBestPlayer,ActualOutputBestPlayer);
    }

    @Test
    public void setBestPlayer() {
        String tstBestPlayer="Thusha";
        SportClub footballClub_BestPlayer = new FootballClub("thusha","Colombo","thusha","Thusha","India","Tharushi","Nishara","17");
        footballClub_BestPlayer.setBestPlayer(tstBestPlayer);
        assertEquals("Set BestPlayer",footballClub_BestPlayer.getBestPlayer(),tstBestPlayer);
    }
}