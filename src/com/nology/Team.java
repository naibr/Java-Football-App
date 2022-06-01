package com.nology;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> playerList = new ArrayList<>();
    private Manager manager;
    private String stadium;
    private String league;
    private Player player;


    public Team(String name, List<Player> playerList, Manager manager, String stadium, String league) {
        this.name = name;
        this.playerList = playerList;
        this.manager = manager;
        this.stadium = stadium;
        this.league = league;
    }

    public Team() {
    }

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void printPlayers() {
        for(Player player:playerList) {
            System.out.println(player.getFirstName() + " " + player.getLastName());
        }
    }

    public String printPlayersAsStrings() {
        List<String> playerNames = new ArrayList<>();
        for(Player player:playerList) {
            playerNames.add(player.toStringPlayerNames());
        }
        return playerNames.toString();
    }



    public String getName() {
        return name;
    }

    public String getStadium() {
        return stadium;
    }

    public String getLeague() {
        return league;
    }

    @Override
    public String toString() {
        return name;
    }

    public String toStringFull() {
        return name + "\n" +
               "Manager: " + manager.getFirstName() + " " + manager.getLastName() + "\n" +
                "Stadium: " + stadium + "\n" +
                "League: " + league + "\n" +
                "Players: " + printPlayersAsStrings();
        //                ", playerList= " + playerList

    }
}
