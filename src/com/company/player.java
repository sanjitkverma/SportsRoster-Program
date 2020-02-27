package com.company;
/*
 *Comp 167 MajorProject 1 Spring 2020
 * The player class creates get and set methods to retrieve values from the rostergenerator class
 * Author @Sanjit Verma
 * @Since 2/25/2020
 */
public class player {
    public int playerJerseyNumber;
    public int playerRanking;

public player(int playerJerseyNumber, int playerRanking) {
    this.playerJerseyNumber = playerJerseyNumber;
    this.playerRanking = playerRanking;
}
        public int getplayerJerseyNumber() {
            return playerJerseyNumber;
        }
        public void setplayerJerseyNumber (int playerJerseyNumber){
            this.playerJerseyNumber = playerJerseyNumber;
        }
        public int playerRanking () {
            return playerRanking;
        }
        public void setplayerRanking (int playerRanking) {
                this.playerRanking = playerRanking;
        }
        public String toString () {
            return "Jersey Number"+ playerJerseyNumber + "Player Ranking" + playerRanking;
        }
    }

