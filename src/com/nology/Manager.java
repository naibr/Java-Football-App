package com.nology;

public class Manager extends Person {

    private Team team;
    private int contractLength;
    private int wage;

    public Manager(String firstName, String lastName, int age, String nationality, Team team,
                   int contractLength, int wage) {
        super(firstName, lastName, age, nationality);
        this.team = team;
        this.contractLength = contractLength;
        this.wage = wage;
    }

    public Manager() {
    };

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
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
}
