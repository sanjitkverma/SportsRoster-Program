package com.company;
/*
 *Comp 167 MajorProject 1 Spring 2020
 * The player class creates get and set methods to retrieve values from the rostergenerator class
 * Author @Sanjit Verma
 * @Since 2/25/2020
 */
import java.util.*;
class Player{
    private int jerseyNumber;
    private int ranking;
    public Player(int n, int rn) {
        this.jerseyNumber=n;
        this.ranking=rn;
    }
    public int getJerseyNumber() {
        return jerseyNumber;
    }
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
    public int getRanking() {
        return ranking;
    }
    public void setRanking(int Ranking) {
        this.ranking = Ranking;
    }
    public String toString() {
        return "Jersey number: "+this.jerseyNumber+ "," + " Ranking: " + this.ranking;
    }
}



