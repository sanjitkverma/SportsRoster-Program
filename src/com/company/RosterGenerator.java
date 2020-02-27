import java.util.Scanner;

public class RosterGenerator {
    public static void main(String[] args) {
        int numbers=5;
        int[] jerseys = new int[numbers];
        int[] rankings = new int[numbers];
        Scanner input = new Scanner(System.in);
        boolean close = false;

        try {
            for (int i = 0; i < numbers; i++) {
                System.out.print("Enter player " + (i + 1) + "'s jersey number (0-99): ");
                int jersey = input.nextInt();
                jerseys[i] = jersey;

                System.out.print("Enter player " + (i + 1) + "'s ranking(1[Low]- 9[high]): ");
                int ranking = input.nextInt();
                rankings[i] = ranking;
                System.out.println();
            }
            if (jerseys[1] == jerseys[2]) {
                System.out.println("Error Jersey#1 same number as Jersey#2 ");
            }
            if (jerseys[1] == jerseys[3]) {
                System.out.println("Error Jersey#1 same number as Jersey#3");
            }
            if (jerseys[1] == jerseys[4]) {
                System.out.println("Error Jersey#1 same number as Jersey#4");
            }
            if (jerseys[1] == jerseys[0]) {
                System.out.println("Error Jersey#1 same number as Jersey#5");
            }

            if (jerseys[2] == jerseys[1]) {
                System.out.println("Error Jersey#2 same number as Jersey#1 ");
            }
            if (jerseys[2] == jerseys[3]) {
                System.out.println("Error Jersey#2 same number as Jersey#3");
            }
            if (jerseys[2] == jerseys[4]) {
                System.out.println("Error Jersey#2 same number as Jersey#4");
            }
            if (jerseys[2] == jerseys[0]) {
                System.out.println("Error Jersey#2 same number as Jersey#5");
            }

            if (jerseys[3] == jerseys[1]) {
                System.out.println("Error Jersey#3 same number as Jersey#1 ");
            }
            if (jerseys[3] == jerseys[2]) {
                System.out.println("Error Jersey#3 same number as Jersey#2");
            }
            if (jerseys[3] == jerseys[4]) {
                System.out.println("Error Jersey#3 same number as Jersey#4");
            }
            if (jerseys[3] == jerseys[0]) {
                System.out.println("Error Jersey#3 same number as Jersey#5");
            }

            if (jerseys[4] == jerseys[1]) {
                System.out.println("Error Jersey#4 same number as Jersey#1 ");
            }
            if (jerseys[4] == jerseys[2]) {
                System.out.println("Error Jersey#4 same number as Jersey#2");
            }
            if (jerseys[4] == jerseys[3]) {
                System.out.println("Error Jersey#4 same number as Jersey#3");
            }
            if (jerseys[4] == jerseys[0]) {
                System.out.println("Error Jersey#4 same number as Jersey#5");
            }

            if (jerseys[0] == jerseys[1]) {
                System.out.println("Error Jersey#5 same number as Jersey#1 ");
            }
            if (jerseys[0] == jerseys[2]) {
                System.out.println("Error Jersey#5 same number as Jersey#2");
            }
            if (jerseys[0] == jerseys[3]) {
                System.out.println("Error Jersey#5 same number as Jersey#3");
            }
            if (jerseys[0] == jerseys[4]) {
                System.out.println("Error Jersey#5 same number as Jersey#4");
            }

            String menu = input.nextLine();
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

                if (menu.contains("q")) {
                    close = true;
                } else if (menu.contains("o")) {
                    System.out.println("CURRENT ROSTER");
                    int i = 0;

                    while (i < numbers) {
                        System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseys[i] + ", Ranking: " + rankings[i]);
                        System.out.println("...");
                        i++;
                    }
                }
                else if (menu.contains("u")) {
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
                }
                else if (menu.contains("a")) {
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
                }
            }
        }
        catch (Exception e) {
            System.out.println("Invalid Parameter try again");
        }
    }
}



