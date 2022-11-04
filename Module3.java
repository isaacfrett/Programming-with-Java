// Isaac Frett 11/02/2022 Module 3 Programming Assignment
// The purpose of this code is to write a program similar to Rock, Paper, Scissors that deals in 1, 2, 3
// It will ask the user for input and display the computers choice randomly as well


import java.util.Scanner;

// This class will take user input as a selection for Rock, Paper or Scissors, then run the computers choice, and score the game.
public class Module3 {
    public static void main(String[] args) { 
        try (Scanner inputs = new Scanner(System.in)) {

            // Take input from the user
            System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors");
            int user_choice = inputs.nextInt();
            
            // Match the user selection to the appropriate choice and output the user's choice
            String selection = ("");
            switch(user_choice) {
            case 1:
                selection = "Rock";
                break;
            case 2:
                selection = "Paper";
                break;
            case 3:
                selection = "Scissors";
                break;
            }
            System.out.println("You played " + selection);

            // This will generate the random computers choice and take that and the users choice and score the game and output it
            Scoring.main(user_choice, Switch1.main(args));
        }

        // In case the user plays a number outside of context
        catch (Exception e) {
            System.out.println("Something went wrong. Please try again");
        }
    }
}

// This class is for generating the computer's choice
class Switch1 {
    public static int main(String[] args) {
        int computer_choice = (int)Math.floor(Math.random()*4);
        switch(computer_choice) {
            case 1:
                System.out.println("Computer played Rock");
                break;
            case 2:
                System.out.println("Computer played Paper");
                break;
            case 3:
                System.out.println("Computer played Scissors");
                break;
            default:
                Switch1.main(args);
                break;                    
        }
        return computer_choice;
    }
}

// This class is used to score the game and output the results of both choices given to it
class Scoring {
    public static void main(int user_choice, int computer_choice) {
        if (user_choice == computer_choice){
            System.out.println("The game is a tie");
        }
        else if ((user_choice == 1) && (computer_choice == 2)){
            System.out.println("Paper beats Rock, you lose.");
        }
        else if ((user_choice == 2) && (computer_choice == 3)){
            System.out.println("Scissors beats Paper, you lose.");
        }
        else if ((user_choice == 3) && (computer_choice == 1)){
            System.out.println("Rock beat Scissors, you lose.");
        }
        else if ((user_choice == 3) && (computer_choice == 2)){
            System.out.println("Scissors beats Paper, you win!");
        }
        else if ((user_choice == 2) && (computer_choice == 1)){
            System.out.println("Paper beats Rock, you win!");
        }
        else if ((user_choice == 1) && (computer_choice == 3)){
            System.out.println("Rock beats Scissors, you win!");
        }
        else {
            System.out.println("Something went wrong.");
        }
    }
}
