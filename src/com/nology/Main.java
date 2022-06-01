package com.nology;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
	// write your code here

        Team PSG = new Team("PSG", new ArrayList<>(), new Manager(), "Le Parc des Princes", "Ligue 1");
        Team ManCity = new Team("Manchester City", new ArrayList<>(), new Manager(), "Etihad Stadium", "Premier League");
        Team RealMadrid = new Team("Real Madrid", new ArrayList<>(), new Manager(), "Bernabeu", "La Liga");
        Team Liverpool = new Team("Liverpool", new ArrayList<>(), new Manager(), "Anfield", "Premier League");
        Team Villarreal = new Team("Villarreal", new ArrayList<>(), new Manager(), "Estadio de la Cerámica","La Liga");

        TeamRepository teamRepository = new TeamRepository();
        teamRepository.addTeam(PSG);
        teamRepository.addTeam(ManCity);
        teamRepository.addTeam(RealMadrid);
        teamRepository.addTeam(Liverpool);
        teamRepository.addTeam(Villarreal);

        Match semiFinal1Leg1 = new Match("Semi-Final", "26/04/2022", "4-3", "Etihad", new ArrayList<>());
        Match semiFinal1Leg2 = new Match("Semi-Final", "04/05/2022", "3-1", "Bernabeu", new ArrayList<>());

        semiFinal1Leg1.addTeam(ManCity);
        semiFinal1Leg1.addTeam(RealMadrid);
        semiFinal1Leg2.addTeam(RealMadrid);
        semiFinal1Leg2.addTeam(ManCity);

        Match semiFinal2Leg1 = new Match("Semi-Final", "27/04/2022", "2-0", "Anfield", new ArrayList<>());
        Match semiFinal2Leg2 = new Match("Semi-Final", "03/05/2022", "2-3", "Estadio de la Cerámica", new ArrayList<>());

        semiFinal2Leg1.addTeam(Liverpool);
        semiFinal2Leg1.addTeam(Villarreal);
        semiFinal2Leg2.addTeam(Villarreal);
        semiFinal2Leg2.addTeam(Liverpool);

        Match cupFinal = new Match("Final", "10/06/2022", " ", "Stade de France", new ArrayList<>());

        cupFinal.addTeam(Liverpool);
        cupFinal.addTeam(RealMadrid);

        MatchRepository matchRepository = new MatchRepository(new ArrayList<>());
        matchRepository.addMatch(semiFinal1Leg1);
        matchRepository.addMatch(semiFinal1Leg2);
        matchRepository.addMatch(semiFinal2Leg1);
        matchRepository.addMatch(semiFinal2Leg2);
        matchRepository.addMatch(cupFinal);

        MatchServices matchServices = new MatchServices(matchRepository);
        TeamServices teamServices = new TeamServices(teamRepository);

        App app = new App(matchRepository, teamRepository, matchServices, teamServices);

        Player messi = new Player("Lionel", "Messi", 33, "Argentina", "Attack", PSG, 60000000, 1, 500000);
        Manager pochettino = new Manager("Mauricio", "Pochettino", 50, "Argentina", PSG, 1, 5000000);

        PSG.addPlayer(messi);
        PSG.setManager(pochettino);

        app.runApp();

    }
}
