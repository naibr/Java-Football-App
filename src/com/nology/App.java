package com.nology;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private final Scanner scanner = new Scanner(System.in);
    private MatchRepository matchRepository;
    private TeamRepository teamRepository;
    private MatchServices matchServices;
    private TeamServices teamServices;
    private Match match;
    private Team team;

    public App(MatchRepository matchRepository, TeamRepository teamRepository, MatchServices matchServices, TeamServices teamServices) {
        this.matchRepository = matchRepository;
        this.teamRepository = teamRepository;
        this.matchServices = matchServices;
        this.teamServices = teamServices;
    }

    public void runApp() throws ParseException {
        System.out.println("Welcome to the champions league app \n" +
                "What service would you like to view? \n" +
                "1. View Results \n" +
                "2. View upcoming fixtures \n" +
                "3. View your team info");
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            results();
            System.out.println("Press 1 to return to previous menu");
            userInput = scanner.nextInt();
            if (userInput == 1) {
                runApp();
            }
        } else if (userInput == 2) {
            fixtures();
            System.out.println("Press 1 to return to previous menu");
            userInput = scanner.nextInt();
            if (userInput == 1) {
                runApp();
            }
        } else if (userInput == 3) {
            System.out.println("To view more info on a team, please select a number");
            teamInfo();
            chooseTeam();
            System.out.println("Press 1 to return to previous menu");
            userInput = scanner.nextInt();
            if (userInput == 1) {
                runApp();
            }
        } else {
            System.out.println("Invalid input");
            runApp();
            System.out.println("Press 1 to return to previous menu");
            userInput = scanner.nextInt();
            if (userInput == 1) {
                runApp();
            }
        }
    }

    public void results() {
        matchServices.printAllMatches();
    }

    public void fixtures() throws ParseException {
        matchServices.showFixtures();
    }

    public void teamInfo() {
        teamServices.showTeams();
    }

    public void chooseTeam() {
        int userInput = scanner.nextInt();
        for (int i = 0; i < teamRepository.getTeamList().size(); i++) {
            if (i == (userInput-1)) {
                Team userOutput = teamRepository.getTeamList().get(i);
                System.out.println(userOutput.toStringFull());
            }
        }
    }

}




