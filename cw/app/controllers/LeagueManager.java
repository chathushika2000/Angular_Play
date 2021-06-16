package controllers;
import javafx.stage.Stage;

import java.text.ParseException;
import java.util.List;

public interface LeagueManager {
    public List<FootballClub> Add(FootballClub footballClub);
    public List<FootballClub> Add(SchoolFootballClubs schoolFootballClubs);
    public List<FootballClub> Add(UniversityFootballClub universityFootballClub);

    public void Delete();
    public void Display();
    void PrintStatistic();
    void PointsTable();
    void Save();
    void AddMatch() throws ParseException;
    void userInterfaceLoad(Stage displayUiStage);
}
