package com.company;
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

