package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     **/

//FootballClub Method
    public Result FootballClub() throws IOException {
        File file  = new File("obj.dat");
        file.createNewFile();

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            PremierLeagueManager.club = (ArrayList<FootballClub>) objectInputStream.readObject();

        } catch (EOFException | ClassNotFoundException e) {
            System.out.println("");
        }

        JsonNode jNode = Json.toJson(PremierLeagueManager.club);
        return ok(jNode).as("application/json");
    }
    //Match History Method
    public Result FootballHistory() throws IOException {
        File fileHistory = new File("MatchHistory.dat");
        fileHistory.createNewFile();
        try {
            ObjectInputStream objectInputStreamHistory = new ObjectInputStream(new FileInputStream(fileHistory));
            PremierLeagueManager.matchSchedules = (ArrayList<MatchSchedule>) objectInputStreamHistory.readObject();

        } catch (EOFException | ClassNotFoundException e) {
            System.out.println("");
        }
        Collections.sort(PremierLeagueManager.matchSchedules,new SortByDate());
        JsonNode jNode = Json.toJson(PremierLeagueManager.matchSchedules);
        return ok(jNode).as("application/json");
    }
    //WinSort Method
    public Result WinSort() throws IOException {
        File file  = new File("obj.dat");
        file.createNewFile();

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            PremierLeagueManager.club = (ArrayList<FootballClub>) objectInputStream.readObject();

        } catch (EOFException | ClassNotFoundException e) {
            System.out.println("");
        }
        Collections.sort(PremierLeagueManager.club,new SortByWin());
        JsonNode jNode = Json.toJson(PremierLeagueManager.club);
        return ok(jNode).as("application/json");
    }
    //GoalSort Method
    public Result GoalSort() throws IOException {
        File file  = new File("obj.dat");
        file.createNewFile();

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            PremierLeagueManager.club = (ArrayList<FootballClub>) objectInputStream.readObject();

        } catch (EOFException | ClassNotFoundException e) {
            System.out.println("");
        }
        Collections.sort(PremierLeagueManager.club,new SortByGoals());
        JsonNode jNode = Json.toJson(PremierLeagueManager.club);
        return ok(jNode).as("application/json");
    }

    //Generate Method
    public Result Generate() throws IOException {
        File file  = new File("obj.dat");//Save the FootballClub data
        file.createNewFile();

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            PremierLeagueManager.club = (ArrayList<FootballClub>) objectInputStream.readObject();

        } catch (EOFException | ClassNotFoundException e) {
            System.out.println("");
        }
        File fileHistory = new File("MatchHistory.dat");// Save the MatchHistory data
        fileHistory.createNewFile();
        try {
            ObjectInputStream objectInputStreamHistory = new ObjectInputStream(new FileInputStream(fileHistory));
            PremierLeagueManager.matchSchedules = (ArrayList<MatchSchedule>) objectInputStreamHistory.readObject();

        } catch (EOFException | ClassNotFoundException e) {
            System.out.println("");
        }

        if (!(PremierLeagueManager.club.size() == 0)) {
            Random randomMatchGen = new Random();//Create the random match

            int team1 = randomMatchGen.nextInt(PremierLeagueManager.club.size());
            int team2 = randomMatchGen.nextInt(PremierLeagueManager.club.size());

            FootballClub teamOne = PremierLeagueManager.club.get(team1);
            FootballClub teamTwo = PremierLeagueManager.club.get(team2);

            while (true) {
                if (teamOne.getClass() == teamTwo.getClass()) {
                    break;
                } else {
                    team1 = randomMatchGen.nextInt(PremierLeagueManager.club.size());
                    team2 = randomMatchGen.nextInt(PremierLeagueManager.club.size());

                    teamOne = PremierLeagueManager.club.get(team1);
                    teamTwo = PremierLeagueManager.club.get(team2);
                }
            }

            System.out.println((team1));
            System.out.println((team2));

            MatchSchedule matchSchedule1 = new MatchSchedule();//Create MatchSchedule objective
            if (teamOne.equals(teamTwo)) {
                System.out.println("Can't make match with same team");
            } else {
                int teamScore1 = randomMatchGen.nextInt(10);
                int teamScore2 = randomMatchGen.nextInt(10);

                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");// date validation
                matchSchedule1.setDate(df.format(new Date()));

                for (int i = 0; i < PremierLeagueManager.club.size(); i++) {
                    if (teamScore1 == teamScore2) {
                        if (PremierLeagueManager.club.get(i).getClubName().equals(teamOne.getClubName())) {
                            PremierLeagueManager.club.get(i).setFootballDefeats(0);
                            PremierLeagueManager.club.get(i).setFootballWin(0);
                            PremierLeagueManager.club.get(i).setFootballDraws(1);
                            PremierLeagueManager.club.get(i).setGoalScored(teamScore1);
                            PremierLeagueManager.club.get(i).setGoalsReceived(teamScore2);
                            PremierLeagueManager.club.get(i).setFootballPoints(1);
                            PremierLeagueManager.club.get(i).setMatchesPlayed(1);
                            matchSchedule1.setTeamOne(PremierLeagueManager.club.get(i).getClubName());
                            matchSchedule1.setTeamOneScore(String.valueOf(teamScore1));
                        } else if (PremierLeagueManager.club.get(i).getClubName().equals(teamTwo.getClubName())) {
                            PremierLeagueManager.club.get(i).setFootballDefeats(0);
                            PremierLeagueManager.club.get(i).setFootballWin(0);
                            PremierLeagueManager.club.get(i).setFootballDraws(1);
                            PremierLeagueManager.club.get(i).setGoalScored(teamScore1);
                            PremierLeagueManager.club.get(i).setGoalsReceived(teamScore2);
                            PremierLeagueManager.club.get(i).setFootballPoints(1);
                            PremierLeagueManager.club.get(i).setMatchesPlayed(1);
                            matchSchedule1.setTeamTwo(PremierLeagueManager.club.get(i).getClubName());
                            matchSchedule1.setTeamTwoScore(String.valueOf(teamScore2));
                        }
                    } else if (teamScore1 > teamScore2) {
                        if (PremierLeagueManager.club.get(i).getClubName().equals(teamOne.getClubName())) {
                            PremierLeagueManager.club.get(i).setFootballDefeats(0);
                            PremierLeagueManager.club.get(i).setFootballWin(1);
                            PremierLeagueManager.club.get(i).setFootballDraws(0);
                            PremierLeagueManager.club.get(i).setGoalScored(teamScore1);
                            PremierLeagueManager.club.get(i).setGoalsReceived(teamScore2);
                            PremierLeagueManager.club.get(i).setFootballPoints(3);
                            PremierLeagueManager.club.get(i).setMatchesPlayed(1);
                            matchSchedule1.setTeamOne(PremierLeagueManager.club.get(i).getClubName());
                            matchSchedule1.setTeamOneScore(String.valueOf(teamScore1));
                        } else if (PremierLeagueManager.club.get(i).getClubName().equals(teamTwo.getClubName())) {
                            PremierLeagueManager.club.get(i).setFootballDefeats(1);
                            PremierLeagueManager.club.get(i).setFootballWin(0);
                            PremierLeagueManager.club.get(i).setFootballDraws(0);
                            PremierLeagueManager.club.get(i).setGoalScored(teamScore2);
                            PremierLeagueManager.club.get(i).setGoalsReceived(teamScore1);
                            PremierLeagueManager.club.get(i).setFootballPoints(0);
                            PremierLeagueManager.club.get(i).setMatchesPlayed(1);
                            matchSchedule1.setTeamTwo(PremierLeagueManager.club.get(i).getClubName());
                            matchSchedule1.setTeamTwoScore(String.valueOf(teamScore2));
                        }
                    } else if (teamScore1 < teamScore2) {
                        if (PremierLeagueManager.club.get(i).getClubName().equals(teamOne.getClubName())) {
                            PremierLeagueManager.club.get(i).setFootballDefeats(1);
                            PremierLeagueManager.club.get(i).setFootballWin(0);
                            PremierLeagueManager.club.get(i).setFootballDraws(0);
                            PremierLeagueManager.club.get(i).setGoalScored(teamScore2);
                            PremierLeagueManager.club.get(i).setGoalsReceived(teamScore1);
                            PremierLeagueManager.club.get(i).setFootballPoints(0);
                            PremierLeagueManager.club.get(i).setMatchesPlayed(1);
                            matchSchedule1.setTeamOne(PremierLeagueManager.club.get(i).getClubName());
                            matchSchedule1.setTeamOneScore(String.valueOf(teamScore1));
                        } else if (PremierLeagueManager.club.get(i).getClubName().equals(teamTwo.getClubName())) {
                            PremierLeagueManager.club.get(i).setFootballDefeats(0);
                            PremierLeagueManager.club.get(i).setFootballWin(1);
                            PremierLeagueManager.club.get(i).setFootballDraws(0);
                            PremierLeagueManager.club.get(i).setGoalScored(teamScore1);
                            PremierLeagueManager.club.get(i).setGoalsReceived(teamScore2);
                            PremierLeagueManager.club.get(i).setFootballPoints(3);
                            PremierLeagueManager.club.get(i).setMatchesPlayed(1);
                            matchSchedule1.setTeamTwo(PremierLeagueManager.club.get(i).getClubName());
                            matchSchedule1.setTeamTwoScore(String.valueOf(teamScore2));
                        }
                    }

                }
                PremierLeagueManager.matchSchedules.add(matchSchedule1);
            }

            Collections.sort(PremierLeagueManager.club);//Sort By Date

        }else {
            System.out.println("no teams");
        }

        PremierLeagueManager premierLeagueManager = new PremierLeagueManager();//Create PremierLeagueManager Object
        premierLeagueManager.Save();
        JsonNode jNode = Json.toJson(PremierLeagueManager.club);
        return ok(jNode).as("application/json");
    }
}
