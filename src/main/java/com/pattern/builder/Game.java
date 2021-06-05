package com.pattern.builder;

import lombok.Getter;

@Getter
public class Game {

        private String awayTeam;
        private String homeTeam;
        private int currentYardLine;
        private String stadium;
        private String weather;

    public Game(GameBuilder builder){
        this.awayTeam = builder.awayTeam;
        this.homeTeam = builder.homeTeam;
        this.currentYardLine = builder.currentYardLine;
        this.stadium = builder.stadium;
        this.weather = builder.weather;
    }
}
