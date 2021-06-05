package com.pattern.builder;

public class Main {
    public static void main(String[] args) {
        Game newGame = new GameBuilder()
                        .homeTeam("Denver")
                        .awayTeam("Arizona")
                        .currentYardLine(35)
                        .stadium("I don't know about Stadiums")
                        .weather("Snow")
                        .build();
        System.out.println("Without problems: " + newGame.getStadium());
    }
}
