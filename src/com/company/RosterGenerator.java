/*
*Comp 167 MajorProject 1 Spring 2020
* This program creates a new roster for Jersey and Player rankings and can hold 5 players, it also uses a menu system
* to update player stats, look up people above a player's rank, replace a player and output the roster
* Author @Sanjit Verma
 * @Since 2/25/2020
*
*/
package com.company;
import java.util.*;
/*
 * The RosterGenerator class is where the main code and methods for my program is held. Using one array to hold jersey numbers and
 * hold the rank, the program edits the array and adds the elements according to user input.The program is able to
 * add players/ranks to the arrays, update player ranings, output players above a ranking, replace player, output the roster
 * and quit the program depending on the users prefrence.
 */


public class RosterGenerator { //generateTeam(); method
/*The main class generates the player roster and the team. It also checks for duplicate jersey numbers. Additionally, it creates the
menu for the next methods and redirects the other methods to do something if intiallized
*@param int max to indicate max amount of players
*@param int count to indicate the maximum amount of players able to be added
*@param jerseyNumber to create a new array
*@param input to create new scanner to get input
*@param jerseynumber to hold and test jersey numbers
*@param rankings to hold and test jersey numbers
*@return Player input and store it in the array
 */


    public static void main(String[] args) {
        int count = 5;
        int i=1;
        int jerseyNumber[] = new int[100];
        for(int j =0 ; j < jerseyNumber.length;j++) {
            jerseyNumber[j]=0;
        }
        int max=5;
        Player[] mainarr= new Player[max];
        Scanner input = new Scanner(System.in);

            while (count > 0) {
                System.out.print("Enter Player " + i + " jersey number (0-99): ");
                int jerseynumber = input.nextInt();
                if (jerseynumber >= 100) {
                    System.out.println("Error enter jersey number 0-99... try again");//exit if variable greater than 99
                    System.exit(1);
                }

                System.out.print("Enter Player " + i + " ranking (1[Low]- 9[high]): ");
                int rankings = input.nextInt();
                if (rankings >= 10) {
                    System.out.println(" ");
                    System.out.println("Error enter rank 1-9... try again");
                    System.exit(1);
                }
                System.out.println(" ");

                if (jerseyNumber[jerseynumber] == 0) {
                    Player p1 = new Player(jerseynumber, rankings);
                    mainarr[i - 1] = p1;
                    jerseyNumber[jerseynumber] = jerseyNumber[jerseynumber] + 1;
                    i++;
                    count--;
                } else {
                    if (jerseyNumber[0] == jerseyNumber[1]) {
                        System.out.println("Error Jersey#1 same number as Jersey#2 ");
                        System.exit(1);
                    }
                    if (jerseyNumber[0] == jerseyNumber[2]) {
                        System.out.println("Error Jersey#1 same number as Jersey#3");
                        System.exit(1);
                    }
                    if (jerseyNumber[0] == jerseyNumber[3]) {
                        System.out.println("Error Jersey#1 same number as Jersey#4");
                        System.exit(1);
                    }
                    if (jerseyNumber[0] == jerseyNumber[4]) {
                        System.out.println("Error Jersey#1 same number as Jersey#5");
                        System.exit(1);
                    }

                    if (jerseyNumber[1] == jerseyNumber[0]) {
                        System.out.println("Error Jersey#2 same number as Jersey#1 ");
                        System.exit(1);
                    }
                    if (jerseyNumber[1] == jerseyNumber[2]) {
                        System.out.println("Error Jersey#2 same number as Jersey#3");
                        System.exit(1);
                    }
                    if (jerseyNumber[1] == jerseyNumber[3]) {
                        System.out.println("Error Jersey#2 same number as Jersey#4");
                        System.exit(1);
                    }
                    if (jerseyNumber[1] == jerseyNumber[4]) {
                        System.out.println("Error Jersey#2 same number as Jersey#5");
                        System.exit(1);
                    }

                    if (jerseyNumber[2] == jerseyNumber[0]) {
                        System.out.println("Error Jersey#3 same number as Jersey#1 ");
                        System.exit(1);
                    }
                    if (jerseyNumber[2] == jerseyNumber[1]) {
                        System.out.println("Error Jersey#3 same number as Jersey#2");
                        System.exit(1);
                    }
                    if (jerseyNumber[2] == jerseyNumber[3]) {
                        System.out.println("Error Jersey#3 same number as Jersey#4");
                        System.exit(1);
                    }
                    if (jerseyNumber[2] == jerseyNumber[4]) {
                        System.out.println("Error Jersey#3 same number as Jersey#5");
                        System.exit(1);
                    }

                    if (jerseyNumber[3] == jerseyNumber[0]) {
                        System.out.println("Error Jersey#4 same number as Jersey#1 ");
                        System.exit(1);
                    }
                    if (jerseyNumber[3] == jerseyNumber[1]) {
                        System.out.println("Error Jersey#4 same number as Jersey#2");
                        System.exit(1);
                    }
                    if (jerseyNumber[3] == jerseyNumber[2]) {
                        System.out.println("Error Jersey#4 same number as Jersey#3");
                        System.exit(1);
                    }
                    if (jerseyNumber[3] == jerseyNumber[4]) {
                        System.out.println("Error Jersey#4 same number as Jersey#5");
                        System.exit(1);
                    }

                    if (jerseyNumber[4] == jerseyNumber[0]) {
                        System.out.println("Error Jersey#5 same number as Jersey#1 ");
                        System.exit(1);
                    }
                    if (jerseyNumber[4] == jerseyNumber[1]) {
                        System.out.println("Error Jersey#5 same number as Jersey#2");
                        System.exit(1);
                    }
                    if (jerseyNumber[4] == jerseyNumber[2]) {
                        System.out.println("Error Jersey#5 same number as Jersey#3");
                    }
                    if (jerseyNumber[4] == jerseyNumber[3]) {
                        System.out.println("Error Jersey#5 same number as Jersey#4");
                    }
                }
            }
        while(true) {
            System.out.println(" ");
            System.out.println("MENU");
            System.out.println("u - Update player ranking");
            System.out.println("a - Output players above a ranking");
            System.out.println("r - Replace Player");
            System.out.println("o - Output roster");
            System.out.println("q - Quit");
            System.out.println("");
            System.out.print("Choose an option: ");
            input.hasNextLine();
            String response = input.nextLine();

            if(response.equals("q")) {
                break;
            }else if(response.equals("u")) {
                updatePlayer(mainarr);
            }else if(response.equals("a")) {
                outputPlayerAboveRanking(mainarr);
            }else if(response.equals("r")) {
                replacePlayer(mainarr);
            }else if(response.equals("o")) {
                outputRoster(mainarr);
            }
        }
    }


/*
The outputPlayerAboveRanking prompts users to enter a ranking and outputs the people that are above that rank
@param input to create new scanner to read player input
@param mainarr to revert back and store values into the array
@return the players above the inputed ranking
 */
    private static void outputPlayerAboveRanking(Player[] mainarr) {
        System.out.print("Enter a ranking: ");
        Scanner input = new Scanner(System.in);
        int ranking =input.nextInt();
        System.out.println("ABOVE "+ranking);
        for(int i=0;i<5;i++) {
            if(mainarr[i].getRanking()>ranking) {
                System.out.println(mainarr[i]);
            }
        }
    }


/*
The updatePlayer method prompts user to enter which jersey number they want to change and then prompts the user to enter a new
rank and then stores it in the same spot as the old player's data
@param input to create a new scanner to read the jersey number
@param int ranking to hold the new ranking number into the array
@param int jerseyNumber to hold the jersey number for the old player
@param mainarr to test the values and modify the array
@return the updated player information stored in the array
 */
    private static void updatePlayer(Player[] mainarr) {
        System.out.print("Enter a Jersey Number: ");
        Scanner input = new Scanner(System.in);
        int jerseyNumber = input.nextInt();
        for (int i = 0; i < 5; i++) {
            if (mainarr[i].getJerseyNumber() == jerseyNumber) {
                System.out.print("Enter Player new ranking Number: ");
                int ranking = input.nextInt();
                mainarr[i].setRanking(ranking);
                if (ranking >= 10) {
                    System.out.println("Error Out of parameter");
                    System.exit(1);
                }
            }
        }
    }


/*
The replacePlayer class replaces the old player's data with the new input that the user has provided from the data
@param input to hold the scanner information from the user
@param jerseyNumber to call the jersey number from the old output
@param newjersey to add the new jersey number
@param ranking to add the new ranking number to the array
@param mainarr to add the new jersey and rank to the array
@param ranking to test the rank number
@return the new jersey number and rank number into the array
*/
    private static void replacePlayer(Player[] mainarr) {
        System.out.print("Enter a Jersey Number: ");
        Scanner input = new Scanner(System.in);
        int jerseyNumber =input.nextInt();
        for(int i=0;i<5;i++) {
            if(mainarr[i].getJerseyNumber()==jerseyNumber) {
                System.out.print("Enter Player new jersey Number: ");
                int newjersey= input.nextInt();
                if(newjersey>=100 ){
                    System.out.println("Error Out of parameter");
                    System.exit(1);
                }
                System.out.print("Enter Player new ranking Number: ");
                int ranking= input.nextInt();
                mainarr[i].setRanking(ranking);
                mainarr[i].setJerseyNumber(newjersey);
                if(ranking>=10){
                    System.out.println("Error Out of parameter");
                    System.exit(1);
                }
            }
        }
    }


/*
The outputRoster method outputs the roster
@param mainarr to add the output to the array and print it
@return the outputed roster that was created based on previous methods.
 */
    private static void outputRoster(Player[] mainarr) {
        for(int i=0;i<5;i++) {
            System.out.println("Player " + (i+1) + " -- " + mainarr[i]);

        }
    }
}