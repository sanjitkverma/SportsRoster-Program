/*
*Comp 167 MajorProject 1 Spring 2020
* This program creates a new roster for Jersey and Player rankings and can hold 5 players, it also uses a menu system
* to update player stats, look up people above a player's rank, replace a player and output the roster
* Author @Sanjit Verma
* @Since 2/25/2020
*
 */
import java.util.Scanner;
/**
 * The RosterGenerator class is where the main code for my program is held. Using one array to hold jersey numbers and
 * the other to hold the rank, the program edits the array and adds the elements according to user input.The program is able to
 * add players/ranks to the arrays, update player ranings, output players above a ranking, replace player, output the roster
 * and quit the program depending on the users prefrence.
 * @param numbers hold the maximum size of the array for the program
 * @param jerseys is the array variable for the jersey array
 * @param rankings is the array variable for the ranking array
 * @param jersey is a temporary variable to compare the array size/ values
 * @param ranking is the temporary variable to hold the array inputs/outputs
 * @param numb is the variable to hold the users new jersey number when they want to add a new one
 * @param rank is the variable to hold the users new rank when they want to add one
 * @return updated player ranking
 * @return output players above a ranking
 * @return replaced player roster
 * @return output final roster
 * @return Invalid Parameter try again if user doesn't input required information
 * @return Error Jersey#[] same number as Jersey#[] if two jersey numbers match
 * @return Error enter jersey number 0-99... try again if number exceeds 0-99
 * @return Error enter rank 1-9... try again if rank exceeds 1-9
 */
public class RosterGenerator {
    public static void main(String[] args) {
        //declare variables and arrays
        int numbers=5;
        int[] jerseys = new int[numbers];
        int[] rankings = new int[numbers];
        Scanner input = new Scanner(System.in);
        boolean close = false;

        //get user input for roster and tests for errors
        try {
            //get jersey number
            for (int i = 0; i < numbers; i++) {
                System.out.print("Enter player " + (i + 1) + "'s jersey number (0-99): ");
                int jersey = input.nextInt();
                jerseys[i] = jersey;
                if (jersey >= 100){
                   System.out.println("Error enter jersey number 0-99... try again");//exit if variable greater than 99
                   System.exit(1);

                }
                // get rank
                System.out.print("Enter player " + (i + 1) + "'s ranking(1[Low]- 9[high]): ");
                int ranking = input.nextInt();
                rankings[i] = ranking;
                System.out.println(" ");
                if (ranking >= 10){
                    System.out.println("Error enter rank 1-9... try again");
                    System.exit(1);
                }
            }

            //Test for similar jersey numbers
            if (jerseys[0] == jerseys[1]) {
                System.out.println("Error Jersey#1 same number as Jersey#2 ");
                System.exit(1);
            }
            if (jerseys[0] == jerseys[2]) {
                System.out.println("Error Jersey#1 same number as Jersey#3");
                System.exit(1);
            }
            if (jerseys[0] == jerseys[3]) {
                System.out.println("Error Jersey#1 same number as Jersey#4");
                System.exit(1);
            }
            if (jerseys[0] == jerseys[4]) {
                System.out.println("Error Jersey#1 same number as Jersey#5");
                System.exit(1);
            }

            if (jerseys[1] == jerseys[0]) {
                System.out.println("Error Jersey#2 same number as Jersey#1 ");
                System.exit(1);
            }
            if (jerseys[1] == jerseys[2]) {
                System.out.println("Error Jersey#2 same number as Jersey#3");
                System.exit(1);
            }
            if (jerseys[1] == jerseys[3]) {
                System.out.println("Error Jersey#2 same number as Jersey#4");
                System.exit(1);
            }
            if (jerseys[1] == jerseys[4]) {
                System.out.println("Error Jersey#2 same number as Jersey#5");
                System.exit(1);
            }

            if (jerseys[2] == jerseys[0]) {
                System.out.println("Error Jersey#3 same number as Jersey#1 ");
                System.exit(1);
            }
            if (jerseys[2] == jerseys[1]) {
                System.out.println("Error Jersey#3 same number as Jersey#2");
                System.exit(1);
            }
            if (jerseys[2] == jerseys[3]) {
                System.out.println("Error Jersey#3 same number as Jersey#4");
                System.exit(1);
            }
            if (jerseys[2] == jerseys[4]) {
                System.out.println("Error Jersey#3 same number as Jersey#5");
                System.exit(1);
            }

            if (jerseys[3] == jerseys[0]) {
                System.out.println("Error Jersey#4 same number as Jersey#1 ");
                System.exit(1);
            }
            if (jerseys[3] == jerseys[1]) {
                System.out.println("Error Jersey#4 same number as Jersey#2");
                System.exit(1);
            }
            if (jerseys[3] == jerseys[2]) {
                System.out.println("Error Jersey#4 same number as Jersey#3");
                System.exit(1);
            }
            if (jerseys[3] == jerseys[4]) {
                System.out.println("Error Jersey#4 same number as Jersey#5");
                System.exit(1);
            }

            if (jerseys[4] == jerseys[0]) {
                System.out.println("Error Jersey#5 same number as Jersey#1 ");
                System.exit(1);
            }
            if (jerseys[4] == jerseys[1]) {
                System.out.println("Error Jersey#5 same number as Jersey#2");
                System.exit(1);
            }
            if (jerseys[4] == jerseys[2]) {
                System.out.println("Error Jersey#5 same number as Jersey#3");
            }
            if (jerseys[4] == jerseys[3]) {
                System.out.println("Error Jersey#5 same number as Jersey#4");
            }

            String menu = input.nextLine();
                //Create menu and items
                while (!close) {

                    System.out.println(" ");
                    System.out.println("MENU");
                    System.out.println("u - Update player ranking");
                    System.out.println("a - Output players above a ranking");
                    System.out.println("r - Replace Player");
                    System.out.println("o - Output roster");
                    System.out.println("q - Quit");
                    System.out.println("");
                    System.out.print("Choose an option: ");
                    menu = input.nextLine();
                        if (menu.contains("q")) {//close if user types q
                            close = true;
                        } else if (menu.contains("o")) {//Output the arrays if user types o
                            System.out.println("CURRENT ROSTER");
                            int i = 0;

                            while (i < numbers) {
                                System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseys[i] + ", Ranking: " + rankings[i]);
                                System.out.println("...");
                                i++;
                            }
                        } else if (menu.contains("u")) {//update player ranking if user types u
                            System.out.print("Enter a jersey number: ");
                            int jersey = input.nextInt();
                            int i;
                            for (i = 0; i < numbers; i++) {
                                if (jerseys[i] == jersey) {
                                    break;
                                }
                            }
                            System.out.print("Enter new ranking: ");
                            int rank = input.nextInt();
                            rankings[i] = rank;
                            menu = input.nextLine();
                            if (rank >= 10) {
                                System.out.println("Error enter rank 1-9... try again");
                                System.exit(1);
                            }

                        } else if (menu.contains("a")) {//Display the ranks/players above if user types a
                            System.out.print("Enter Ranking: ");
                            int rank = input.nextInt();
                            System.out.println("ABOVE " + rank);
                            for (int i = 0; i < numbers; i++) {
                                if (rankings[i] > rank) {
                                    System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseys[i] + ", Ranking: " + rankings[i]);
                                }
                            }
                            System.out.println();
                            menu = input.nextLine();
                        } else if (menu.contains("r")) {//If user types r replace the jersey and rank with new user input
                            System.out.print("Enter a Jersey Number: ");
                            Scanner scan = new Scanner(System.in);
                            int jerseyNumber = scan.nextInt();

                            for (int i = 0; i < 5; i++) {
                                if (jerseys[i] == jerseyNumber) {
                                    System.out.print("Enter Player new jersey Number: ");
                                    int numb = scan.nextInt();
                                    if (numb >= 100) {
                                        System.out.println("Error enter jersey number 0-99... try again");
                                        System.exit(1);
                                    }
                                    System.out.print("Enter Player new ranking Number: ");
                                    int rank = scan.nextInt();
                                    jerseys[i] = numb;
                                    rankings[i] = rank;
                                    if (rank >= 10) {
                                        System.out.println("Error enter rank 1-9... try again");
                                        System.exit(1);
                                    }
                                }
                            }
                        }
                    }
        }
        catch (Exception e) { //If error occurs in user input types:
            System.out.println("Invalid Parameter try again");
        }
    }
}



