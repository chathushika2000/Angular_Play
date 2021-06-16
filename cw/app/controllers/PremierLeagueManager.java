package controllers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.io.*;
import java.net.URI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.*;


public class PremierLeagueManager extends Application implements LeagueManager {
    public static List<FootballClub> club = new ArrayList<FootballClub>();//create the footballclub arraylist
    final static Scanner clubScanner = new Scanner(System.in);//create the input scanner
    public static List<MatchSchedule> matchSchedules = new ArrayList<>();//create the matchSchedule arraylist

    static LeagueManager footballTeams = new PremierLeagueManager();

    //Add method

    @Override
    public List<FootballClub> Add(FootballClub footballClub1) {
        System.out.println("------------------------------------------------");
        System.out.print("Enter club Name  : ");
        String clubName = clubScanner.nextLine();
        while (true){//club name validation part
            if (!(clubName.isEmpty() && clubName.equals(""))){
                if (!(clubName.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter club Name  : ");
                    clubName = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please enter the club name !");
                System.out.print("Enter club Name  : ");
                clubName = clubScanner.nextLine();
            }
        }
        footballClub1.setClubName(clubName);//set the club name

        System.out.print("Enter club Location  : ");//Enter the club location
        String location = clubScanner.nextLine();
        footballClub1.setClubLocation(location);//set the club location

        System.out.print("Enter club Statistic  : ");//Enter the Statistic
        String statistic = clubScanner.nextLine();
        while (true){//validation part
            if (!(statistic.isEmpty() && statistic.equals(""))){
                if (!(statistic.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter club Statistic  : ");
                    statistic = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter club Statistic !");
                System.out.print("Enter club Statistic  : ");
                statistic = clubScanner.nextLine();
            }
        }
        footballClub1.setClubStatistics(statistic);//set the club Statistics

        System.out.print("Enter Best Player Name  : ");//Enter the best player name
        String bestPlayer = clubScanner.nextLine();
        while (true){//validation part
            if (!(bestPlayer.isEmpty() && bestPlayer.equals(""))){
                if (!(bestPlayer.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter Best Player Name  : ");
                    bestPlayer = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter Best Player Name !");
                System.out.print("Enter Best Player Name : ");
                bestPlayer = clubScanner.nextLine();
            }
        }
        footballClub1.setBestPlayer(bestPlayer);//Set the best player

        System.out.print("Enter the country  : ");//enter the country name
        String country = clubScanner.nextLine();
        while (true){                               //validation part
            if (!(country.isEmpty() && country.equals(""))){
                if (!(country.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter the country : ");
                    country = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter the country !");
                System.out.print("Enter the country : ");
                country = clubScanner.nextLine();
            }
        }
        footballClub1.setCountry(country);// set the country

        System.out.print("Enter the captain name  : ");// enter the captain name
        String captainName = clubScanner.nextLine();
        while (true){                                   //validation part
            if (!(captainName.isEmpty() && captainName.equals(""))){
                if (!(captainName.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter the captain name : ");
                    captainName = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter the captain name !");
                System.out.print("Enter the captain name : ");
                captainName = clubScanner.nextLine();
            }
        }
        footballClub1.setCaptainName(captainName);//set Captain Name

        System.out.print("Enter the vice captain name : ");// enter the vice captain name
        String viceCaptainName = clubScanner.nextLine();
        while (true){                                      //validation part
            if (!(viceCaptainName.isEmpty() && viceCaptainName.equals(""))){
                if (!(viceCaptainName.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter the vice captain name : ");
                    viceCaptainName = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter the vice captain name !");
                System.out.print("Enter the vice captain name : ");
                viceCaptainName = clubScanner.nextLine();
            }
        }
        footballClub1.setViceCaptainName(viceCaptainName);//set vice captain name

        System.out.print("Enter the no of premier leagues won : ");//Enter the no of premier leagues won
        String leaguesWon = clubScanner.nextLine();
        while (true){                                           //validation part
            if (!(leaguesWon.isEmpty() && leaguesWon.equals(""))){
                if ((leaguesWon.matches("[0-9]*"))){
                    break;
                }else {
                    System.out.println("Invalid input !");
                    System.out.print("Enter the no of premier leagues won : ");
                    leaguesWon = clubScanner.nextLine();
                }
            }else {
                System.out.println("Please Enter the no of premier leagues won !");
                System.out.print("Enter the no of premier leagues won : ");
                leaguesWon = clubScanner.nextLine();
            }
        }
        footballClub1.setNoOfPremierLeaguesWon(leaguesWon);//set the NoOfPremierLeaguesWon

        club.add(footballClub1);//Add the ArrayList
        return club;
    }

    @Override
    public List<FootballClub> Add(SchoolFootballClubs schoolFootballClubs) {
        System.out.println("------------------------------------------------");
        System.out.print("Enter club Name  : ");
        String clubName = clubScanner.nextLine();
        while (true){       //validation part
            if (!(clubName.isEmpty() && clubName.equals(""))){
                if (!(clubName.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter club Name  : ");
                    clubName = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please enter the club name !");
                System.out.print("Enter club Name  : ");
                clubName = clubScanner.nextLine();
            }
        }
        schoolFootballClubs.setClubName(clubName);

        System.out.print("Enter club Location : ");
        String location = clubScanner.nextLine();
        schoolFootballClubs.setClubLocation(location);

        System.out.print("Enter club Statistic : ");
        String statistic = clubScanner.nextLine();
        while (true){       //validation part
            if (!(statistic.isEmpty() && statistic.equals(""))){
                if (!(statistic.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter club Statistic  : ");
                    statistic = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter club Statistic !");
                System.out.print("Enter club Statistic  : ");
                statistic = clubScanner.nextLine();
            }
        }
        schoolFootballClubs.setClubStatistics(statistic);

        System.out.print("Enter Best Player Name : ");
        String bestPlayer = clubScanner.nextLine();
        while (true){       //validation part
            if (!(bestPlayer.isEmpty() && bestPlayer.equals(""))){
                if (!(bestPlayer.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter Best Player Name  : ");
                    bestPlayer = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter Best Player Name !");
                System.out.print("Enter Best Player Name : ");
                bestPlayer = clubScanner.nextLine();
            }
        }
        schoolFootballClubs.setBestPlayer(bestPlayer);

        System.out.print("Enter the country : ");
        String country = clubScanner.nextLine();
        while (true){       //validation part
            if (!(country.isEmpty() && country.equals(""))){
                if (!(country.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter the country : ");
                    country = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter the country !");
                System.out.print("Enter the country : ");
                country = clubScanner.nextLine();
            }
        }
        schoolFootballClubs.setCountry(country);

        System.out.print("Enter the captain name : ");
        String captainName = clubScanner.nextLine();
        while (true){       //validation part
            if (!(captainName.isEmpty() && captainName.equals(""))){
                if (!(captainName.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter the captain name : ");
                    captainName = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter the captain name !");
                System.out.print("Enter the captain name : ");
                captainName = clubScanner.nextLine();
            }
        }

        schoolFootballClubs.setCaptainName(captainName);

        System.out.print("Enter the vice captain name : ");
        String viceCaptainName = clubScanner.nextLine();
        while (true){       //validation part
            if (!(viceCaptainName.isEmpty() && viceCaptainName.equals(""))){
                if (!(viceCaptainName.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter the vice captain name : ");
                    viceCaptainName = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter the vice captain name !");
                System.out.print("Enter the vice captain name : ");
                viceCaptainName = clubScanner.nextLine();
            }
        }
        schoolFootballClubs.setViceCaptainName(viceCaptainName);

        System.out.print("Enter the no of premier leagues won : ");
        String leaguesWon = clubScanner.nextLine();
        while (true){       //validation part
            if (!(leaguesWon.isEmpty() && leaguesWon.equals(""))){
                if ((leaguesWon.matches("[0-9]*"))){
                    break;
                }else {
                    System.out.println("Invalid input !");
                    System.out.print("Enter the no of premier leagues won : ");
                    leaguesWon = clubScanner.nextLine();
                }
            }else {
                System.out.println("Please Enter the no of premier leagues won !");
                System.out.print("Enter the no of premier leagues won : ");
                leaguesWon = clubScanner.nextLine();
            }
        }
        schoolFootballClubs.setNoOfPremierLeaguesWon(leaguesWon);


        System.out.print("Enter the School Id : ");
        String schoolId = clubScanner.nextLine();
        while (true){       //validation part
            if (!(schoolId.isEmpty() && schoolId.equals(""))){
                if ((schoolId.matches("[0-9]*"))){
                    break;
                }else {
                    System.out.println("Invalid input !");
                    System.out.print("Enter the School Id  : ");
                    schoolId = clubScanner.nextLine();
                }
            }else {
                System.out.println("Please Enter the School Id   !");
                System.out.print("Enter the School Id   : ");
                schoolId = clubScanner.nextLine();
            }
        }
        schoolFootballClubs.setSchoolId(schoolId);

        System.out.print("Enter the School Name   : ");
        String schoolName = clubScanner.nextLine();
        while (true){       //validation part
            if (!(schoolName.isEmpty() && schoolName.equals(""))){
                if (!(schoolName.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter the School Name   : ");
                    schoolName = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter the School Name  !");
                System.out.print("Enter the School Name  : ");
                schoolName = clubScanner.nextLine();
            }
        }
        schoolFootballClubs.setSchoolName(schoolName);

        club.add(schoolFootballClubs);
        return club;
    }

    @Override
    public List<FootballClub> Add(UniversityFootballClub universityFootballClub) {
        System.out.println("------------------------------------------------");
        System.out.print("Enter club Name  : ");
        String clubName = clubScanner.nextLine();
        while (true){       //validation part
            if (!(clubName.isEmpty() && clubName.equals(""))){
                if (!(clubName.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter club Name  : ");
                    clubName = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please enter the club name !");
                System.out.print("Enter club Name  : ");
                clubName = clubScanner.nextLine();
            }
        }
        universityFootballClub.setClubName(clubName);

        System.out.print("Enter club Location  :");
        String location = clubScanner.nextLine();
        universityFootballClub.setClubLocation(location);

        System.out.print("Enter club Statistic  :");
        String statistic = clubScanner.nextLine();
        while (true){       //validation part
            if (!(statistic.isEmpty() && statistic.equals(""))){
                if (!(statistic.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter club Statistic  : ");
                    statistic = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter club Statistic !");
                System.out.print("Enter club Statistic  : ");
                statistic = clubScanner.nextLine();
            }
        }
        universityFootballClub.setClubStatistics(statistic);

        System.out.print("Enter Best Player Name   :");
        String bestPlayer = clubScanner.nextLine();
        while (true){       //validation part
            if (!(bestPlayer.isEmpty() && bestPlayer.equals(""))){
                if (!(bestPlayer.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter Best Player Name  : ");
                    bestPlayer = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter Best Player Name !");
                System.out.print("Enter Best Player Name : ");
                bestPlayer = clubScanner.nextLine();
            }
        }
        universityFootballClub.setBestPlayer(bestPlayer);

        System.out.print("Enter the country   :");
        String country = clubScanner.nextLine();
        while (true){       //validation part
            if (!(country.isEmpty() && country.equals(""))){
                if (!(country.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter the country : ");
                    country = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter the country !");
                System.out.print("Enter the country : ");
                country = clubScanner.nextLine();
            }
        }
        universityFootballClub.setCountry(country);

        System.out.print("Enter the captain name   :");
        String captainName = clubScanner.nextLine();
        while (true){       //validation part
            if (!(captainName.isEmpty() && captainName.equals(""))){
                if (!(captainName.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter the captain name : ");
                    captainName = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter the captain name !");
                System.out.print("Enter the captain name : ");
                captainName = clubScanner.nextLine();
            }
        }
        universityFootballClub.setCaptainName(captainName);

        System.out.print("Enter the vice captain name   :");
        String viceCaptainName = clubScanner.nextLine();
        while (true){       //validation part
            if (!(viceCaptainName.isEmpty() && viceCaptainName.equals(""))){
                if (!(viceCaptainName.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter the vice captain name : ");
                    viceCaptainName = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter the vice captain name !");
                System.out.print("Enter the vice captain name : ");
                viceCaptainName = clubScanner.nextLine();
            }
        }
        universityFootballClub.setViceCaptainName(viceCaptainName);

        System.out.print("Enter the no of premier leagues won   :");
        String leaguesWon = clubScanner.nextLine();
        while (true){       //validation part
            if (!(leaguesWon.isEmpty() && leaguesWon.equals(""))){
                if ((leaguesWon.matches("[0-9]*"))){
                    break;
                }else {
                    System.out.println("Invalid input !");
                    System.out.print("Enter the no of premier leagues won : ");
                    leaguesWon = clubScanner.nextLine();
                }
            }else {
                System.out.println("Please Enter the no of premier leagues won !");
                System.out.print("Enter the no of premier leagues won : ");
                leaguesWon = clubScanner.nextLine();
            }
        }
        universityFootballClub.setNoOfPremierLeaguesWon(leaguesWon);

        System.out.print("Enter the university Id   :");
        String uniId = clubScanner.nextLine();
        while (true){       //validation part
            if (!(uniId.isEmpty() && uniId.equals(""))){
                if ((uniId.matches("[0-9]*"))){
                    break;
                }else {
                    System.out.println("Invalid input !");
                    System.out.print("Enter the university Id   : ");
                    uniId = clubScanner.nextLine();
                }
            }else {
                System.out.println("Please Enter the university Id    ! ");
                System.out.print("Enter the university Id   : ");
                uniId = clubScanner.nextLine();
            }
        }
        universityFootballClub.setUniId(uniId);

        System.out.print("Enter the university Name   : ");
        String UniName = clubScanner.nextLine();
        while (true){           //validation part
            if (!(UniName.isEmpty() && UniName.equals(""))){
                if (!(UniName.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter the university Name   : ");
                    UniName = clubScanner.nextLine();
                }else {
                    break;
                }
            }else {
                System.out.println("Please Enter the university Name  !");
                System.out.print("Enter the university Name  : ");
                UniName = clubScanner.nextLine();
            }
        }
        universityFootballClub.setUniName(UniName);

        club.add(universityFootballClub);//add the arraylist
        return club;
    }
    //Delete method
    @Override
    public void Delete() {
        System.out.println("-------------------------");
        System.out.println("Enter Club Name");
        String name=clubScanner.nextLine();
        String found="";//validation part
        for (int i=0;i<club.size();i++){
            SportClub sportClub=club.get(i);
            if (sportClub.getClubName().equals(name)) {
                club.remove(i);
                System.out.println(name + " Removed.......");
                found="";
                break;
            }else{
                found = "notFound";
            }
        }
        if (found.equals("notFound")){
            System.out.println("\n*******    No clubs found     *******\n");
            }
        }

    //Print method
    @Override
    public void Display() {
        for (int i=0;i<club.size();i++){
            System.out.println(club.get(i));;
        }
    }
    //printStatistic
    @Override
    public void PrintStatistic() {
        System.out.println("-------------------------");
        System.out.println("Enter Club Name");
        String  name = clubScanner.nextLine();
        String found= "";
        for (int i=0;i<club.size();i++){
            if (club.get(i).getClubName().equals(name)){
                System.out.println(club.get(i));
                break;
            }else {     //validation part
                found = "notFound";
            }
        }
        if (found.equals("notFound")){
            System.out.println("\n*******    No clubs found     *******\n");
        }
    }

        //PointsTable
    @Override
    public void PointsTable() {
        Collections.sort(club);
        System.out.println(" +-------------------------------            TABLE           --------------------------+");
        System.out.println(" +-------------------------------------------------------------------------------------+");
        System.out.println(" |   name           Win     Draw    Losses    Received    Scored     Points    Played  |");
        System.out.println(" +-------------------------------------------------------------------------------------+");
        for (int i=0;i<club.size();i++){

            System.out.printf(" | %-15s %-8s %-8s %-8s %-10s %-10s %-10s  %-6s |%n" ,club.get(i).getClubName(),club.get(i).getFootballWin()
                    ,club.get(i).getFootballDraws(),club.get(i).getFootballDefeats(),club.get(i).getGoalsReceived()
                    ,club.get(i).getGoalScored(),club.get(i).getFootballPoints(),club.get(i).getMatchesPlayed());
        }
        System.out.print(" +-------------------------------------------------------------------------------------+");
    }

    //Write
    @Override
    public void Save() {
        try {
            File file =  new File("obj.dat");//Create file
            file.createNewFile();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(club);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File file =  new File("MatchHistory.dat");//create the matchHistory File
            file.createNewFile();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(matchSchedules);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //AddMatch
    @Override
    public void AddMatch() throws ParseException {
        MatchSchedule matchSchedule = new MatchSchedule();
        System.out.print("Enter the date  : ");
        String date = clubScanner.nextLine();
        while (true){
            boolean value = true;
            try {
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");//date Validation
                df.setLenient(false);
                df.parse(date);
                System.out.println("valid Date");
                value = false;
            }catch (Exception e){
                System.out.println("Invalid Date");
                System.out.print("Enter the Date   :");
                date = clubScanner.nextLine();
            }
            if (value == false){
                break;
            }

        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        matchSchedule.setDate(date);
        System.out.print("Enter Club one Name  : ");
        String club1 = clubScanner.nextLine();
        while (true){
            if (!(club1.isEmpty() && club1.equals(""))){
                if (!(club1.matches("[A-Za-z]*"))){
                    System.out.println("Invalid input !");
                    System.out.print("Enter Club one Name  : ");
                    club1 = clubScanner.nextLine();

                }else {
                    String found= "";
                    for (int i = 0; i < club.size(); i++) {
                        if (club.get(i).getClubName().equals(club1)){
                            found = "true";
                        }
                    }
                    if (found.equals("")){
                        System.out.println("Please Enter Club one Name!");
                        System.out.print("Enter Club one Name  : ");
                        club1 = clubScanner.nextLine();
                    }else {
                        break;
                    }
                }
            }else {
                System.out.println("Please Enter Club one Name!");
                System.out.print("Enter Club one Name  : ");
                club1 = clubScanner.nextLine();
            }
        }
        matchSchedule.setTeamOne(club1);
        System.out.print("Enter Club two Name  : ");
        String club2 = clubScanner.nextLine();
        while (true){
            if (!(club2.isEmpty() && club2.equals(""))){
                if (club1.equals(club2)) {
                    System.out.println("Please Enter Club two Name it cannot be same!");
                    System.out.print("Enter Club two Name : ");
                    club2 = clubScanner.nextLine();

                }else {
                    if (!(club2.matches("[A-Za-z]*"))) {
                        System.out.println("Invalid input !");
                        System.out.print("Enter Club two Name  : ");
                        club2 = clubScanner.nextLine();
                    } else {
                        String found= "";
                        for (int i = 0; i < club.size(); i++) {
                            if (club.get(i).getClubName().equals(club1)){
                                found = "true";
                            }
                        }
                        if (found.equals("")){
                            System.out.println("Please Enter Club one Name!");
                            System.out.print("Enter Club one Name  : ");
                            club1 = clubScanner.nextLine();
                        }else {
                            break;
                        }
                    }
                }
            }else {
                System.out.println("Please Enter Club one Name!");
                System.out.print("Enter Club two Name  : ");
                club2 = clubScanner.nextLine();
            }
        }
        matchSchedule.setTeamTwo(club2);
        System.out.print("Enter Club one Name GOAL : ");
        String club1Goal = clubScanner.nextLine();
        while (true){
            if (!(club1Goal.isEmpty() && club1Goal.equals(""))){
                if ((club1Goal.matches("[0-9]*"))){
                    break;
                }else {
                    System.out.println("Invalid input !");
                    System.out.print("Enter Club one Name GOAL : ");
                    club1Goal = clubScanner.nextLine();
                }
            }else {
                System.out.println("Please Enter Club one Name GOAL !");
                System.out.print("Enter Club one Name GOAL : ");
                club1Goal = clubScanner.nextLine();
            }
        }

        System.out.print("Enter Club two Name GOAL : ");
        String club2Goal = clubScanner.nextLine();

        while (true){
            if (!(club2Goal.isEmpty() && club2Goal.equals(""))){

                if ((club2Goal.matches("[0-9]*"))) {
                    break;
                } else {
                    System.out.println("Invalid input !");
                    System.out.print("Enter Club two Name GOAL : ");
                    club2Goal = clubScanner.nextLine();
                }

            }else {
                System.out.println("Please Enter Club two Name GOAL !");
                System.out.print("Enter Club two Name GOAL : ");
                club2Goal = clubScanner.nextLine();
            }
        }


        MatchSchedule matchSchedule1 =  new MatchSchedule();//Create Object
        matchSchedule1.setDate(date);

        for (int i = 0; i < club.size(); i++) {
            if (club1Goal.equals(club2Goal)){
                if (club.get(i).getClubName().equals(club1)){
                    club.get(i).setFootballDefeats(0);
                    club.get(i).setFootballWin(0);
                    club.get(i).setFootballDraws(1);
                    club.get(i).setGoalScored(Integer.parseInt(club1Goal));
                    club.get(i).setGoalsReceived(Integer.parseInt(club2Goal));
                    club.get(i).setFootballPoints(1);
                    club.get(i).setMatchesPlayed(1);
                    matchSchedule1.setTeamOne(club1);
                    matchSchedule1.setTeamOneScore(club1Goal);
                }else  if (club.get(i).getClubName().equals(club2)){
                    club.get(i).setFootballDefeats(0);
                    club.get(i).setFootballWin(0);
                    club.get(i).setFootballDraws(1);
                    club.get(i).setGoalScored(Integer.parseInt(club2Goal));
                    club.get(i).setGoalsReceived(Integer.parseInt(club1Goal));
                    club.get(i).setFootballPoints(1);
                    club.get(i).setMatchesPlayed(1);
                    matchSchedule1.setTeamTwo(club2);
                    matchSchedule1.setTeamTwoScore(club2Goal);
                }
            }else if (Integer.parseInt(club1Goal) > Integer.parseInt(club2Goal)) {
                if (club.get(i).getClubName().equals(club1)) {
                    club.get(i).setFootballDefeats(0);
                    club.get(i).setFootballWin(1);
                    club.get(i).setFootballDraws(0);
                    club.get(i).setGoalScored(Integer.parseInt(club1Goal));
                    club.get(i).setGoalsReceived(Integer.parseInt(club2Goal));
                    club.get(i).setFootballPoints(3);
                    club.get(i).setMatchesPlayed(1);
                    matchSchedule1.setTeamOne(club1);
                    matchSchedule1.setTeamOneScore(club1Goal);
                } else if (club.get(i).getClubName().equals(club2)) {
                    club.get(i).setFootballDefeats(1);
                    club.get(i).setFootballWin(0);
                    club.get(i).setFootballDraws(0);
                    club.get(i).setGoalScored(Integer.parseInt(club2Goal));
                    club.get(i).setGoalsReceived(Integer.parseInt(club1Goal));
                    club.get(i).setFootballPoints(0);
                    club.get(i).setMatchesPlayed(1);
                    matchSchedule1.setTeamTwo(club2);
                    matchSchedule1.setTeamTwoScore(club2Goal);
                }
            }else if (Integer.parseInt(club1Goal) < Integer.parseInt(club2Goal)){
                if (club.get(i).getClubName().equals(club1)) {
                    club.get(i).setFootballDefeats(1);
                    club.get(i).setFootballWin(0);
                    club.get(i).setFootballDraws(0);
                    club.get(i).setGoalScored(Integer.parseInt(club2Goal));
                    club.get(i).setGoalsReceived(Integer.parseInt(club1Goal));
                    club.get(i).setFootballPoints(0);
                    club.get(i).setMatchesPlayed(1);
                    matchSchedule1.setTeamOne(club1);
                    matchSchedule1.setTeamOneScore(club1Goal);
                } else if (club.get(i).getClubName().equals(club2)) {
                    club.get(i).setFootballDefeats(0);
                    club.get(i).setFootballWin(1);
                    club.get(i).setFootballDraws(0);
                    club.get(i).setGoalScored(Integer.parseInt(club1Goal));
                    club.get(i).setGoalsReceived(Integer.parseInt(club2Goal));
                    club.get(i).setFootballPoints(3);
                    club.get(i).setMatchesPlayed(1);
                    matchSchedule1.setTeamTwo(club2);
                    matchSchedule1.setTeamTwoScore(club2Goal);
                }
            }
        }

        matchSchedules.add(matchSchedule1);
    }
    //GUI
    @Override
    public void userInterfaceLoad(Stage displayUiStage) {

        VBox myVbox =  new VBox();

        //create new pane
        Pane buttonPane = new Pane();
        buttonPane.setMinHeight(200);
        buttonPane.setStyle("-fx-background-color: #C4ADD6");

        //create Sort Goal button
        Button btnSortGoal =  new Button("Sort Goal");
        btnSortGoal.setLayoutX(100);
        btnSortGoal.setLayoutY(80);
        btnSortGoal.setMinSize(150,30);
        btnSortGoal.setStyle("-fx-background-color:blue; -fx-text-fill:white");

        //create goalwin button
        Button btnSortWin =  new Button("Goal Win");
        btnSortWin.setLayoutX(300);
        btnSortWin.setLayoutY(80);
        btnSortWin.setMinSize(150,30);
        btnSortWin.setStyle("-fx-background-color:blue; -fx-text-fill:white");

        //create match history button
        Button btnHistory =  new Button("Match History");
        btnHistory.setLayoutX(500);
        btnHistory.setLayoutY(80);
        btnHistory.setMinSize(150,30);
        btnHistory.setStyle("-fx-background-color:blue; -fx-text-fill:white");

        btnHistory.setOnAction(new EventHandler<ActionEvent>() {//Match History
            @Override
            public void handle(ActionEvent event) {
                Stage stage =  new Stage();//create new stage
                ScrollPane pane =  new ScrollPane();
                pane.setMinWidth(800);

                pane.hbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.NEVER);
                Pane mainPane =  new Pane();
                Label label =  new Label();//create the label
                label.setLayoutY(100);//set allignments
                label.setMinWidth(400);
                for (int i = 0; i < matchSchedules.size(); i++) {
                    label.setText(label.getText()+matchSchedules.get(i)+"\n");
                }
                label.setLayoutY(50);
                TextField searchTxt = new TextField();//create the textfield
                searchTxt.setLayoutX(20);

                Button searchBtn = new Button("Search");//Search button
                searchBtn.setLayoutX(220);//Set Alignments
                searchBtn.setOnAction(new EventHandler<ActionEvent>() {
                    @Override// Sort by date
                    public void handle(ActionEvent event) {
                        label.setText("");
                        matchSchedules.sort(new SortByDate());//Sort
                        for (int i = 0; i < matchSchedules.size() ; i++) {
                            if (matchSchedules.get(i).getDate().equals(searchTxt.getText())){
                                label.setText(label.getText()+matchSchedules.get(i)+"\n");
                            }
                        }

                        if (searchTxt.getText().equals("")) {
                            for (int i = 0; i < matchSchedules.size(); i++) {
                                label.setText(label.getText() + matchSchedules.get(i) + "\n");
                            }
                        }
                    }
                });

                pane.setContent(mainPane);
                mainPane.getChildren().addAll(label,searchTxt,searchBtn);
                Scene scene =  new Scene(pane,800,600);
                stage.setScene(scene);
                stage.showAndWait();
            }
        });

        Button btnRandom =  new Button("Random Match");//Create new Button
        btnRandom.setLayoutX(700);//Set Alignments
        btnRandom.setLayoutY(80);//Set Alignments
        btnRandom.setMinSize(150,30);
        btnRandom.setStyle("-fx-background-color:blue; -fx-text-fill:white");//Set Style


        buttonPane.getChildren().addAll(btnSortGoal,btnSortWin,btnHistory,btnRandom);


        TableView table = new TableView();//Create tableView
        displayUiStage = new Stage();

        displayUiStage.setTitle("Football club");
        Collections.sort(club);//sort
        TableColumn clubName = new TableColumn("clubName");//Create TableColumn
        clubName.setMaxWidth(200);//Set Alignment
        clubName.setCellValueFactory(new PropertyValueFactory<FootballClub, String>("clubName"));

        TableColumn footballWin = new TableColumn("footballWin");//Create TableColumn
        footballWin.setMaxWidth(150);//Set Alignment
        footballWin.setCellValueFactory(new PropertyValueFactory<FootballClub, String>("footballWin"));

        TableColumn footballDraws = new TableColumn("footballDraws");//Create TableColumn
        footballDraws.setMaxWidth(150);//Set Alignment
        footballDraws.setCellValueFactory(new PropertyValueFactory<FootballClub, String>("footballDraws"));

        TableColumn footballDefeats = new TableColumn("footballDefeats");//Create TableColumn
        footballDefeats.setMaxWidth(150);//Set Alignment
        footballDefeats.setCellValueFactory(new PropertyValueFactory<FootballClub, String>("footballDefeats"));

        TableColumn goalsReceived = new TableColumn("goalsReceived");//Create TableColumn
        goalsReceived.setMaxWidth(150);//Set Alignment
        goalsReceived.setCellValueFactory(new PropertyValueFactory<FootballClub, String>("goalsReceived"));

        TableColumn goalScored = new TableColumn("goalScored");//Create TableColumn
        goalScored.setMaxWidth(150);//Set Alignment
        goalScored.setCellValueFactory(new PropertyValueFactory<FootballClub, String>("goalScored"));

        TableColumn footballPoints = new TableColumn("footballPoints");//Create TableColumn
        footballPoints.setMaxWidth(150);//Set Alignment
        footballPoints.setCellValueFactory(new PropertyValueFactory<FootballClub, String>("footballPoints"));

        TableColumn matchesPlayed = new TableColumn("matchesPlayed");//Create TableColumn
        matchesPlayed.setMaxWidth(150);//Set Alignment
        matchesPlayed.setCellValueFactory(new PropertyValueFactory<FootballClub, String>("matchesPlayed"));
        Collections.sort(club);//sort
        for (FootballClub footballClub:club) {
            if (!(footballClub instanceof SchoolFootballClubs || footballClub instanceof UniversityFootballClub)) {//only football club data
                table.getItems().addAll(footballClub);
            }
        }

        btnSortWin.setOnAction(new EventHandler<ActionEvent>() {//Sort By Win
            @Override
            public void handle(ActionEvent event) {
                Collections.sort(club,new SortByWin());//sort by win
                table.getItems().clear();
                for (FootballClub footballClub:club) {
                    if (!(footballClub instanceof SchoolFootballClubs || footballClub instanceof UniversityFootballClub)) {//only football club sort by win
                        table.getItems().addAll(footballClub);
                    }
                }
            }
        });

        btnSortGoal.setOnAction(new EventHandler<ActionEvent>() {//Sort By goals
            @Override
            public void handle(ActionEvent event) {
                Collections.sort(club,new SortByGoals());
                table.getItems().clear();
                for (FootballClub footballClub:club) {
                    if (!(footballClub instanceof SchoolFootballClubs || footballClub instanceof UniversityFootballClub)) {//only football club sort by goals
                        table.getItems().addAll(footballClub);
                    }
                }
            }
        });


        btnRandom.setOnAction(new EventHandler<ActionEvent>() {//Random Match
            @Override
            public void handle(ActionEvent event) {
                if (!(club.size() == 0)) {
                    Random randomMatchGen = new Random();

                    int team1 = randomMatchGen.nextInt(club.size());
                    int team2 = randomMatchGen.nextInt(club.size());

                    FootballClub teamOne = club.get(team1);
                    FootballClub teamTwo = club.get(team2);

                    while (true) {
                        if (teamOne.getClass() == teamTwo.getClass()) {
                            break;
                        } else {
                            team1 = randomMatchGen.nextInt(club.size());
                            team2 = randomMatchGen.nextInt(club.size());

                            teamOne = club.get(team1);
                            teamTwo = club.get(team2);
                        }
                    }

                    System.out.println((team1));
                    System.out.println((team2));

                    MatchSchedule matchSchedule1 = new MatchSchedule();//Create objective
                    if (teamOne.equals(teamTwo)) {
                        System.out.println("Can't make match with same team");
                    } else {
                        int teamScore1 = randomMatchGen.nextInt(10);
                        int teamScore2 = randomMatchGen.nextInt(10);

                        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");// date validation
                        matchSchedule1.setDate(df.format(new Date()));

                        for (int i = 0; i < club.size(); i++) {
                            if (teamScore1 == teamScore2) {
                                if (club.get(i).getClubName().equals(teamOne.getClubName())) {
                                    club.get(i).setFootballDefeats(0);
                                    club.get(i).setFootballWin(0);
                                    club.get(i).setFootballDraws(1);
                                    club.get(i).setGoalScored(teamScore1);
                                    club.get(i).setGoalsReceived(teamScore2);
                                    club.get(i).setFootballPoints(1);
                                    club.get(i).setMatchesPlayed(1);
                                    matchSchedule1.setTeamOne(club.get(i).getClubName());
                                    matchSchedule1.setTeamOneScore(String.valueOf(teamScore1));
                                } else if (club.get(i).getClubName().equals(teamTwo.getClubName())) {
                                    club.get(i).setFootballDefeats(0);
                                    club.get(i).setFootballWin(0);
                                    club.get(i).setFootballDraws(1);
                                    club.get(i).setGoalScored(teamScore1);
                                    club.get(i).setGoalsReceived(teamScore2);
                                    club.get(i).setFootballPoints(1);
                                    club.get(i).setMatchesPlayed(1);
                                    matchSchedule1.setTeamTwo(club.get(i).getClubName());
                                    matchSchedule1.setTeamTwoScore(String.valueOf(teamScore2));
                                }
                            } else if (teamScore1 > teamScore2) {
                                if (club.get(i).getClubName().equals(teamOne.getClubName())) {
                                    club.get(i).setFootballDefeats(0);
                                    club.get(i).setFootballWin(1);
                                    club.get(i).setFootballDraws(0);
                                    club.get(i).setGoalScored(teamScore1);
                                    club.get(i).setGoalsReceived(teamScore2);
                                    club.get(i).setFootballPoints(3);
                                    club.get(i).setMatchesPlayed(1);
                                    matchSchedule1.setTeamOne(club.get(i).getClubName());
                                    matchSchedule1.setTeamOneScore(String.valueOf(teamScore1));
                                } else if (club.get(i).getClubName().equals(teamTwo.getClubName())) {
                                    club.get(i).setFootballDefeats(1);
                                    club.get(i).setFootballWin(0);
                                    club.get(i).setFootballDraws(0);
                                    club.get(i).setGoalScored(teamScore2);
                                    club.get(i).setGoalsReceived(teamScore1);
                                    club.get(i).setFootballPoints(0);
                                    club.get(i).setMatchesPlayed(1);
                                    matchSchedule1.setTeamTwo(club.get(i).getClubName());
                                    matchSchedule1.setTeamTwoScore(String.valueOf(teamScore2));
                                }
                            } else if (teamScore1 < teamScore2) {
                                if (club.get(i).getClubName().equals(teamOne.getClubName())) {
                                    club.get(i).setFootballDefeats(1);
                                    club.get(i).setFootballWin(0);
                                    club.get(i).setFootballDraws(0);
                                    club.get(i).setGoalScored(teamScore2);
                                    club.get(i).setGoalsReceived(teamScore1);
                                    club.get(i).setFootballPoints(0);
                                    club.get(i).setMatchesPlayed(1);
                                    matchSchedule1.setTeamOne(club.get(i).getClubName());
                                    matchSchedule1.setTeamOneScore(String.valueOf(teamScore1));
                                } else if (club.get(i).getClubName().equals(teamTwo.getClubName())) {
                                    club.get(i).setFootballDefeats(0);
                                    club.get(i).setFootballWin(1);
                                    club.get(i).setFootballDraws(0);
                                    club.get(i).setGoalScored(teamScore1);
                                    club.get(i).setGoalsReceived(teamScore2);
                                    club.get(i).setFootballPoints(3);
                                    club.get(i).setMatchesPlayed(1);
                                    matchSchedule1.setTeamTwo(club.get(i).getClubName());
                                    matchSchedule1.setTeamTwoScore(String.valueOf(teamScore2));
                                }
                            }

                        }
                        matchSchedules.add(matchSchedule1);
                    }
                    Collections.sort(club);
                    table.refresh();
                }else {
                    System.out.println("no teams");
                }
            }
        });

        table.getColumns().addAll(clubName,footballWin, footballDraws, footballDefeats,goalsReceived,goalScored,footballPoints, matchesPlayed);


        myVbox.getChildren().addAll(buttonPane,table);

        Scene scene = new Scene(myVbox,1000,400);
        displayUiStage.setScene(scene);
        displayUiStage.showAndWait();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {//main method
        launch();
    }

    @Override
    public void start(Stage UserInterfacePrimaryStage) throws Exception {
        // read to the arraylist
        File file  = new File("obj.dat");
        file.createNewFile();

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            club = (ArrayList<FootballClub>) objectInputStream.readObject();

        } catch (EOFException e) {
            System.out.println("");
        }


        File fileHistory  = new File("MatchHistory.dat");
        fileHistory.createNewFile();
        try {
            ObjectInputStream objectInputStreamHistory = new ObjectInputStream(new FileInputStream(fileHistory));
            matchSchedules = (ArrayList<MatchSchedule>) objectInputStreamHistory.readObject();

        } catch (EOFException e) {
            System.out.println("");
        }

//Switch Case
        while (true){
            System.out.print("\n\nPlease select one for progress Further \n" +
                    "\t\t\t1  :  To Add Football Clubs \n" +
                    "\t\t\t2  :  To Delete the football club \n" +
                    "\t\t\t3  :  To print the statistic of football club \n" +
                    "\t\t\t4  :  To display PrintStatistic\n" +
                    "\t\t\t5  :  To display points table\n" +
                    "\t\t\t6  :  To Add a Match \n" +
                    "\t\t\t7  :  Save\n" +
                    "\t\t\t8  :  User Interface\n" +
                    "\t\t\t9  :  User Interface Angular\n" +
                    "\t\t\t0  :  Exit\n"+
                    "\tPlease input the selected option :");
            String optionSelection = clubScanner.nextLine();

            switch (optionSelection){
                case "1":
                    System.out.print("Please select one for progress Further \n" +
                            "\t\t\tA  :  To Add Football Clubs  \n" +
                            "\t\t\tB  :  To Add School Football Clubs  \n" +
                            "\t\t\tC  :  To Add University Football Clubs  \n"+
                            "Select one Option  : ");
                    String clubSelection = clubScanner.nextLine().toUpperCase();
                    switch (clubSelection){
                        case "A":
                            FootballClub footballClub = new FootballClub();
                            footballTeams.Add(footballClub);
                            break;

                        case "B":
                            SchoolFootballClubs schoolFootballClubs =  new SchoolFootballClubs();
                            footballTeams.Add(schoolFootballClubs);
                            break;

                        case "C":
                            UniversityFootballClub universityFootballClub = new UniversityFootballClub();
                            footballTeams.Add(universityFootballClub);
                            break;

                        default:
                            System.out.println("\n\n*****  Invalid Input  ******\n\n");
                            break;
                    }
                    break;
                case"2":
                    footballTeams.Delete();
                    break;
                case "3":
                    footballTeams.Display();
                    break;
                case "4":
                    footballTeams.PrintStatistic();
                    break;
                case "5":
                    footballTeams.PointsTable();
                    break;
                case "6":
                    footballTeams.AddMatch();
                    break;
                case "7":
                    footballTeams.Save();
                    break;
                case "8":
                    footballTeams.userInterfaceLoad(UserInterfacePrimaryStage);
                    break;
                case "9":
                    String s = "http://localhost:4200/";
                    Desktop desktop = Desktop.getDesktop();
                    desktop.browse(URI.create(s));
                    break;
                case "0":
                    System.exit(1);
                    break;
                default:
                    System.out.println("\n\n*****  Invalid Input  ******\n\n");
                    break;
            }
        }
    }
}


