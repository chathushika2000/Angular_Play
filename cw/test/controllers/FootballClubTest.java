package controllers;

import org.junit.Test;

import static org.junit.Assert.*;

public class FootballClubTest {


    @Test
    public void getCountry() {
        String tstCountry = ("Sri Lanka");
        FootballClub country = new FootballClub("Chathu","Matara","Chathu","Thushamini","Sri Lanka","thushamini","Chathushika","15");
        String ActualOutputCountry = country.getCountry();
        assertEquals("get Country",tstCountry,ActualOutputCountry);
    }

    @Test
    public void setCountry() {
        String tstCountry="India";
        FootballClub footballClub_country = new FootballClub("thusha","Colombo","thusha","Thusha","India","Tharushi","Nishara","17");
        footballClub_country.setCountry(tstCountry);
        assertEquals("Set Country",footballClub_country.getCountry(),tstCountry);
    }

    @Test
    public void getCaptainName() {
        String tstCaptainName = ("thushamini");
        FootballClub CaptainName = new FootballClub("Chathu","Matara","Chathu","Thushamini","Sri Lanka","thushamini","Chathushika","15");
        String ActualOutputCaptainName = CaptainName.getCaptainName();
        assertEquals("get CaptainName",tstCaptainName,ActualOutputCaptainName);
    }

    @Test
    public void setCaptainName() {
        String tstCaptainName="Tharushi";
        FootballClub footballClub_captainName = new FootballClub("thusha","Colombo","thusha","Thusha","India","Tharushi","Nishara","17");
        footballClub_captainName.setCaptainName(tstCaptainName);
        assertEquals("Set CaptainName",footballClub_captainName.getCaptainName(),tstCaptainName);
    }

    @Test
    public void getViceCaptainName() {
        String tstViceCaptainName = ("Chathushika");
        FootballClub ViceCaptainName = new FootballClub("Chathu","Matara","Chathu","Thushamini","Sri Lanka","thushamini","Chathushika","15");
        String ActualOutputViceCaptainName = ViceCaptainName.getViceCaptainName();
        assertEquals("get ViceCaptainName",tstViceCaptainName,ActualOutputViceCaptainName);
    }

    @Test
    public void setViceCaptainName() {
        String tstViceCaptainName="Nishara";
        FootballClub footballClub_VicecaptainName = new FootballClub("thusha","Colombo","thusha","Thusha","India","Tharushi","Nishara","17");
        footballClub_VicecaptainName.setViceCaptainName(tstViceCaptainName);
        assertEquals("Set ViceCaptainName",footballClub_VicecaptainName.getViceCaptainName(),tstViceCaptainName);
    }

    @Test
    public void getNoOfPremierLeaguesWon() {
        String tstNoOfPremierLeaguesWon = ("15");
        FootballClub NoOfPremierLeaguesWon = new FootballClub("Chathu","Matara","Chathu","Thushamini","Sri Lanka","thushamini","Chathushika","15");
        String ActualOutputNoOfPremierLeaguesWon = NoOfPremierLeaguesWon.getNoOfPremierLeaguesWon();
        assertEquals("get NoOfPremierLeaguesWon",tstNoOfPremierLeaguesWon,ActualOutputNoOfPremierLeaguesWon);
    }

    @Test
    public void setNoOfPremierLeaguesWon() {
        String tstNoOfPremierLeaguesWon="17";
        FootballClub footballClub_NoOfPremierLeaguesWon = new FootballClub("thusha","Colombo","thusha","Thusha","India","Tharushi","Nishara","17");
        footballClub_NoOfPremierLeaguesWon.setNoOfPremierLeaguesWon(tstNoOfPremierLeaguesWon);
        assertEquals("Set NoOfPremierLeaguesWon",footballClub_NoOfPremierLeaguesWon.getNoOfPremierLeaguesWon(),tstNoOfPremierLeaguesWon);
    }
}