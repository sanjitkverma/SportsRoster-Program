import java.util.Scanner;

public class RosterGenerator {
    public static void main(String[] args) {
        final int numbers = 5;
        int[] jerseys = new int[numbers];
        int[] ratings = new int[numbers];
        Scanner input = new Scanner(System.in);
        int i = 0;

        try {
            while (i < numbers) {
                System.out.print("Enter player " + (i + 1) + "'s jersey number (0-99): ");
                int jersey = input.nextInt();
                jerseys[i] = jersey;

                System.out.print("Enter player " + (i + 1) + "'s rating(1-9): ");
                int rating = input.nextInt();
                ratings[i] = rating;
                System.out.println();

                i++;
            }
        }
        catch(Exception e){
            System.out.println("Invalid Parameter try again");
        }
        if(jerseys[1]==jerseys[2]){
            System.out.println("Error Jersey#1 same number as Jersey#2 ");}
        if(jerseys[1]==jerseys[3]){
            System.out.println("Error Jersey#1 same number as Jersey#3");}
        if(jerseys[1]==jerseys[4]){
            System.out.println("Error Jersey#1 same number as Jersey#4");}
        if(jerseys[1]==jerseys[0]){
            System.out.println("Error Jersey#1 same number as Jersey#5");}

        if(jerseys[2]==jerseys[1]){
            System.out.println("Error Jersey#2 same number as Jersey#1 ");}
        if(jerseys[2]==jerseys[3]){
            System.out.println("Error Jersey#2 same number as Jersey#3");}
        if(jerseys[2]==jerseys[4]){
            System.out.println("Error Jersey#2 same number as Jersey#4");}
        if(jerseys[2]==jerseys[0]){
            System.out.println("Error Jersey#2 same number as Jersey#5");}

        if(jerseys[3]==jerseys[1]){
            System.out.println("Error Jersey#3 same number as Jersey#1 ");}
        if(jerseys[3]==jerseys[2]){
            System.out.println("Error Jersey#3 same number as Jersey#2");}
        if(jerseys[3]==jerseys[4]){
            System.out.println("Error Jersey#3 same number as Jersey#4"); }
        if(jerseys[3]==jerseys[0]){
            System.out.println("Error Jersey#3 same number as Jersey#5"); }

        if(jerseys[4]==jerseys[1]){
            System.out.println("Error Jersey#4 same number as Jersey#1 ");}
        if(jerseys[4]==jerseys[2]){
            System.out.println("Error Jersey#4 same number as Jersey#2");}
        if(jerseys[4]==jerseys[3]){
            System.out.println("Error Jersey#4 same number as Jersey#3");}
        if(jerseys[4]==jerseys[0]){
            System.out.println("Error Jersey#4 same number as Jersey#5");}

        if(jerseys[0]==jerseys[1]){
            System.out.println("Error Jersey#5 same number as Jersey#1 ");}
        if(jerseys[0]==jerseys[2]){
            System.out.println("Error Jersey#5 same number as Jersey#2");}
        if(jerseys[0]==jerseys[3]){
            System.out.println("Error Jersey#5 same number as Jersey#3");}
        if(jerseys[0]==jerseys[4]){
            System.out.println("Error Jersey#5 same number as Jersey#4");}




    }
}



