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
    private int rating;
    public Player(int jerseyNumber, int rating) {
    }
    public int getJerseyNumber() {
        return jerseyNumber;
    }
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String toString() {
        return "Player jersey : "+this.jerseyNumber+"Player rating : "+this.rating;
    }
}

