package com.nology;

public class TeamServices {

    private TeamRepository teamRepository;
    private Team team;

    public TeamServices(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public void showTeams() {
        int counter = 0;
        for(Team team: teamRepository.getTeamList()) {
            counter++;

            System.out.println(counter + ". " + team.getName());
        }
    }



}
