import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String Choice;
        String CompChoice;
        int CompScore = 0;
        int PlayerScore = 0;
        int i = 1;
        System.out.println("Enter the number of times You want to Play : ");
        int n = sc.nextInt();
        do {
            int Comp = rand.nextInt(1,4);
            System.out.println();
            System.out.println();
            System.out.println("Enter Your Choice : ");
            System.out.println("  Rock     (1) :");
            System.out.println("  Paper    (2) :");
            System.out.println("  Scissors (3) :");
            int Player = sc.nextInt();
            if (Comp == 1){
                CompChoice ="Rock";
            }
            else if (Comp == 2) {
                CompChoice = "Paper";
            }
            else
                CompChoice = "Scissors";


            if (Player == 1){
                Choice ="Rock";
            }
            else if (Player == 2) {
                Choice = "Paper";
            }
            else
                Choice = "Scissors";
            System.out.println(CompChoice + " - " + Choice);
            if (CompChoice == Choice){
                System.out.println("Tie");
            }
            else if (CompChoice == "Scissors" && Choice == "Rock"){
                System.out.println("Player Wins");
                PlayerScore ++;
            }
            else if (CompChoice == "Scissors" && Choice == "Paper"){
                System.out.println("Computer Wins");
                CompScore ++;
            }
            else if (CompChoice == "Rock" && Choice == "Paper"){
                System.out.println("Player  Wins");
                PlayerScore ++;
            }
            else if (CompChoice == "Rock" && Choice == "Scissors"){
                System.out.println("Computer  Wins");
                CompScore ++;
            }

            else if (CompChoice == "Paper" && Choice == "Rock"){
                System.out.println("Computer  Wins");
                CompScore ++;
            }
            else if (CompChoice == "Paper" && Choice == "Scissors"){
                System.out.println("Player  Wins");
                PlayerScore ++;
            }
            i++;
        } while (i<=n);
        System.out.println("Game Over ");
        System.out.println("Score is As of Below ");
        System.out.println("        Computer        |       Player ");
        System.out.printf("            %d           |          %d  ",CompScore,PlayerScore);
    }
}
