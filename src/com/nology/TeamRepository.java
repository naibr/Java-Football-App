package com.nology;

import java.util.ArrayList;
import java.util.List;

public class TeamRepository {

    private List<Team> teamList = new ArrayList<>();

    public TeamRepository(List<Team> teamList) {
        this.teamList.addAll(teamList);
    }

    public TeamRepository() {
    }

    public void addTeam(Team team) {
        teamList.add(team);
    }

    public void printTeamsList() {
        for (Team team:teamList
        ) {
            System.out.println(team.toStringFull());
        }
    }

    public List<Team> getTeamList() {
        return teamList;
    }


}
