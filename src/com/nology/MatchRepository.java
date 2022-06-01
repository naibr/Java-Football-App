package com.nology;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MatchRepository {

    private List<Match> matchList = new ArrayList<>();

//    public MatchRepository(List<Match> matchList) {
//        this.matchList.addAll(matchList);
//    }

    public MatchRepository(List<Match> matchList) {
        this.matchList = matchList;
    }

    public MatchRepository() {
    }

    public List<Match> getMatchList() {
        return matchList;
    }

    public void printMatches() {
        for (Match match:matchList
             ) {
            System.out.println(match.toString());
        }
    }

    public void addMatch(Match match) {
        matchList.add(match);
    }

}
