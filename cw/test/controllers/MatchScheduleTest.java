package controllers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatchScheduleTest {

    @Test
    public void getTeamOneScore() {
        String tstTeamOneScore = ("12");
        MatchSchedule TeamOneScore = new MatchSchedule("Chathu","Thusha","02-02-2020","12","13");
        String ActualOutputTeamOneScore = TeamOneScore.getTeamOneScore();
        assertEquals("get TeamOneScore",tstTeamOneScore,ActualOutputTeamOneScore);
    }

    @Test
    public void setTeamOneScore() {
        String tstTeamOneScore="14";
        MatchSchedule Match_TeamOneScore = new MatchSchedule("Thushamini","Chathushika","05-12-2021","14","15");
        Match_TeamOneScore.setTeamOneScore(tstTeamOneScore);
        assertEquals("Set TeamTwoScore",Match_TeamOneScore.getTeamOneScore(),tstTeamOneScore);
    }

    @Test
    public void getTeamTwoScore() {
        String tstTeamTwoScore = ("13");
        MatchSchedule TeamTwoScore = new MatchSchedule("Chathu","Thusha","02-02-2020","12","13");
        String ActualOutputTeamTwoScore = TeamTwoScore.getTeamTwoScore();
        assertEquals("get TeamTwoScore",tstTeamTwoScore,ActualOutputTeamTwoScore);
    }

    @Test
    public void setTeamTwoScore() {
        String tstTeamTwoScore="15";
        MatchSchedule Match_TeamTwoScore = new MatchSchedule("Thushamini","Chathushika","05-12-2021","14","15");
        Match_TeamTwoScore.setTeamTwoScore(tstTeamTwoScore);
        assertEquals("Set TeamTwoScore",Match_TeamTwoScore.getTeamTwoScore(),tstTeamTwoScore);
    }

    @Test
    public void getTeamOne() {
        String tstTeamOne = ("Chathu");
        MatchSchedule TeamOne = new MatchSchedule("Chathu","Thusha","02-02-2020","12","13");
        String ActualOutputTeamOne = TeamOne.getTeamOne();
        assertEquals("get TeamOne",tstTeamOne,ActualOutputTeamOne);
    }

    @Test
    public void setTeamOne() {
        String tstTeamOne="Thushamini";
        MatchSchedule Match_teamOne = new MatchSchedule("Thushamini","Chathushika","05-12-2021","14","15");
        Match_teamOne.setTeamOne(tstTeamOne);
        assertEquals("Set TeamOne",Match_teamOne.getTeamOne(),tstTeamOne);
    }

    @Test
    public void getTeamTwo() {
        String tstTeamTwo = ("Thusha");
        MatchSchedule Teamtwo = new MatchSchedule("Chathu","Thusha","02-02-2020","12","13");
        String ActualOutputTeamTwo = Teamtwo.getTeamTwo();
        assertEquals("get TeamTwo",tstTeamTwo,ActualOutputTeamTwo);
    }

    @Test
    public void setTeamTwo() {
        String tstTeamTwo="Chathushika";
        MatchSchedule Match_teamTwo = new MatchSchedule("Thushamini","Chathushika","05-12-2021","14","15");
        Match_teamTwo.setTeamTwo(tstTeamTwo);
        assertEquals("Set TeamTwo",Match_teamTwo.getTeamTwo(),tstTeamTwo);
    }

    @Test
    public void getDate() {
        String tstDate = "02-02-2020";
        MatchSchedule Date = new MatchSchedule("Chathu","Thusha","02-02-2020","12","13");
        String ActualOutputDate = Date.getDate();
        assertEquals("get Date",tstDate,ActualOutputDate);
    }

    @Test
    public void setDate() {
        String tstDate="05-12-2021";
        MatchSchedule Match_Date = new MatchSchedule("Thushamini","Chathushika","05-12-2021","14","15");
        Match_Date.setDate(tstDate);
        assertEquals("Set Date",Match_Date.getDate(),tstDate);
    }
}