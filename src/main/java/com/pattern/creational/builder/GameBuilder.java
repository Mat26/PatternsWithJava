package com.pattern.creational.builder;

public class GameBuilder {

    public String awayTeam;
    public String homeTeam;
    public int currentYardLine;
    public String stadium;
    public String weather;

    public GameBuilder awayTeam(String awayTeam){
        this.awayTeam = awayTeam;
        return this;
    }

    public GameBuilder homeTeam(String homeTeam){
        this.homeTeam = homeTeam;
        return this;
    }

    public GameBuilder currentYardLine(int currentYardLine){
        this.currentYardLine = currentYardLine;
        return this;
    }

    public GameBuilder stadium(String stadium){
        this.stadium = stadium;
        return this;
    }

    public GameBuilder weather(String weather){
        this.weather = weather;
        return this;
    }

    public Game build(){
        if(awayTeam == null){
            throw new IllegalStateException("Missing away Team");
        }
        if(homeTeam == null){
            throw new IllegalStateException("Missing home team");
        }
        if(currentYardLine == 0){
            throw new IllegalStateException("Current Yard Line can't be 0");
        }
        if(stadium == null){
            throw new IllegalStateException("No stadium");
        }
        if(weather == null){
            throw new IllegalStateException("No weather");
        }
        return new Game(this);
    }

}
