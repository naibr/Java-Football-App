package com.nology;

public class Player extends Person{

    private String position;
    private Team team;
    private int transferValue;
    private int contractLength;
    private int wage;


    public Player(String firstName, String lastName, int age, String nationality,
                  String position, Team team, int transferValue, int contractLength, int wage) {
        super(firstName, lastName, age, nationality);
        this.position = position;
        this.team = team;
        this.transferValue = transferValue;
        this.contractLength = contractLength;
        this.wage = wage;
    }

    public Player() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getTransferValue() {
        return transferValue;
    }

    public void setTransferValue(int transferValue) {
        this.transferValue = transferValue;
    }

    public int getContractLength() {
        return contractLength;
    }

    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Player{" +
                "position='" + position + '\'' +
                ", team=" + team +
                ", transferValue=" + transferValue +
                ", contractLength=" + contractLength +
                ", wage=" + wage +
                '}';
    }

    public String toStringPlayerNames() {
        return getFirstName() + " " + getLastName() + ", Position: " + position;
    }
}
