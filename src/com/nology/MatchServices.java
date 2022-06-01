package com.nology;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class MatchServices {

    private MatchRepository matchRepository;
    private Match match;

    public MatchServices(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public void printAllMatches() {
        matchRepository.printMatches();
    }

    public void printRound() {
        matchRepository.printMatches();
        for(Match match: matchRepository.getMatchList()) {
            System.out.println(match.getRound());
            }
    }

    public void printScore() {
        for(Match match: matchRepository.getMatchList()) {
            System.out.println(match.getScore());
        }
    }

    public void printMatchTeams() {
        for(Match match: matchRepository.getMatchList()) {
            System.out.println(match.getTeams());
        }
    }

    public void showFixtures() throws ParseException {
//        method to acquire date and format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String currentDate = dtf.format(now);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(currentDate);
        long millis = date.getTime();
        for(Match match: matchRepository.getMatchList()) {
            Date matchDate = sdf.parse(match.getDate());
            long matchDateMillis = matchDate.getTime();
            if (matchDateMillis > millis) {
                System.out.println(match);
            }
        }

    }


}
