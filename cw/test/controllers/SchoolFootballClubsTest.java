package controllers;

import org.junit.Test;

import static org.junit.Assert.*;

public class SchoolFootballClubsTest {

    @Test
    public void getSchoolName() {
        String tstSclName = ("Sujatha");
        SchoolFootballClubs SclName = new SchoolFootballClubs("Chathu","Matara","Chathu","Thushamini","Sri Lanka","thushamini","Chathushika","15","Sujatha","2000");
        String ActualOutputSclName = SclName.getSchoolName();
        assertEquals("get School Name",tstSclName,ActualOutputSclName);
    }

    @Test
    public void setSchoolName() {
        String tstsclName="Rahula";
        SchoolFootballClubs footballClub_sclName = new SchoolFootballClubs("thusha","Colombo","thusha","Thusha","India","Tharushi","Nishara","17","Rahula","2001");
        footballClub_sclName.setSchoolName(tstsclName);
        assertEquals("Set SchoolName",footballClub_sclName.getSchoolName(),tstsclName);
    }

    @Test
    public void getSchoolId() {
        String tstSclId = ("2000");
        SchoolFootballClubs SclId = new SchoolFootballClubs("Chathu","Matara","Chathu","Thushamini","Sri Lanka","thushamini","Chathushika","15","Sujatha","2000");
        String ActualOutputSclId = SclId.getSchoolId();
        assertEquals("get School Id",tstSclId,ActualOutputSclId);
    }

    @Test
    public void setSchoolId() {
        String tstsclId="2001";
        SchoolFootballClubs footballClub_sclId = new SchoolFootballClubs("thusha","Colombo","thusha","Thusha","India","Tharushi","Nishara","17","Rahula","2001");
        footballClub_sclId.setSchoolId(tstsclId);
        assertEquals("Set SchoolId",footballClub_sclId.getSchoolId(),tstsclId);
    }
}