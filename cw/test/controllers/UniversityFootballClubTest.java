package controllers;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniversityFootballClubTest {

    @Test
    public void getUniName() {
        String tstUniName = ("IIT");
        UniversityFootballClub UniName = new UniversityFootballClub("Chathu","Matara","Chathu","Thushamini","Sri Lanka","thushamini","Chathushika","15","IIT","2019644");
        String ActualOutputUniName = UniName.getUniName();
        assertEquals("get Uni Name",tstUniName,ActualOutputUniName);
    }

    @Test
    public void setUniName() {
        String tstuniName="SlIIT";
        UniversityFootballClub footballClub_uniName = new UniversityFootballClub("thusha","Colombo","thusha","Thusha","India","Tharushi","Nishara","17","SlIIT","2019566");
        footballClub_uniName.setUniName(tstuniName);
        assertEquals("Set UniName",footballClub_uniName.getUniName(),tstuniName);
    }

    @Test
    public void getUniId() {
        String tstUniId = ("2019644");
        UniversityFootballClub UniId = new UniversityFootballClub("Chathu","Matara","Chathu","Thushamini","Sri Lanka","thushamini","Chathushika","15","IIT","2019644");
        String ActualOutputUniId = UniId.getUniId();
        assertEquals("get UniId",tstUniId,ActualOutputUniId);
    }

    @Test
    public void setUniId() {
        String tstuniId="2019566";
        UniversityFootballClub footballClub_uniId = new UniversityFootballClub("thusha","Colombo","thusha","Thusha","India","Tharushi","Nishara","17","SlIIT","2019566");
        footballClub_uniId.setUniId(tstuniId);
        assertEquals("Set UniId",footballClub_uniId.getUniId(),tstuniId);
    }
}