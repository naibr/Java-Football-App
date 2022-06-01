package com.nology;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Match {

    private String round;
    private String date;
    private String score;
    private String stadium;
    private List<Team> teams = new ArrayList<>();


    public Match(String round, String date, String score, String stadium, List<Team> teams) {
        this.date = date;
        this.score = score;
        this.stadium = stadium;
        this.round = round;
        this.teams = teams;
    }

    public Match() {
    }

    public List<Team> getTeams() {
        return teams;
    }

    public String getRound() {
        return round;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public String getDate() {
        return date;
    }

    public String getScore() {
        return score;
    }

    public String getStadium() {
        return stadium;
    }

    @Override
    public String toString() {
        return  round +
                "\n " +
                date +
                "\n "+ score + " " + teams;
    }
}
