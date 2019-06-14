/*
  * File: Lab4.java
  * Auther: Caleb Howard
  * Date: 11/14/2017
  * The following program teaches and plays Rock, Paper, Scissors with the
user. After the user chooses to quit playing, the program prints the user's
wins/losses/ties
*/
package lab4;

import javax.swing.JOptionPane;

public class Lab4 {
     
    public static void main(String[] args){
         
        int wins = 0, losses = 0, ties = 0; // wins/losses/ties declarations
        int introAgain, gameAgain; // variables used for do while loops
        
        // Intro Loop
        do {
            Lab4Methods.intro(); // calls introduction method
            
            // Promts user if they want to see the intro again
            introAgain = JOptionPane.showOptionDialog(null,
            "Are you ready to play?",
            Lab4Methods.TITLE,
            JOptionPane.YES_NO_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            new String[]{"Yes Let's Play!", "No, Show introduction again"},
            "");
            
        } while (introAgain == JOptionPane.NO_OPTION);
        
        // Game Loop
        do {
            // Computer's Choice
            int computerChoice = Lab4Methods.computerChoice(); 
            // Player's Choice 
            int playerChoice = Lab4Methods.playerChoice(); 
             
            // If player chose Rock and computer chose Scissors
            if (playerChoice == 2 && computerChoice == 0){ // R beats S
                Lab4Methods.victoryMessage(playerChoice, computerChoice);
                wins++;
            
            // if player chose Paper and computer chose Rock
            } else if (playerChoice == 1 && computerChoice == 2){ // P beats R
                Lab4Methods.victoryMessage(playerChoice, computerChoice);
                wins++;
            
            // if player chose Scissors and computer chose Paper
            } else if (playerChoice == 0 && computerChoice == 1){ // S beats P
                Lab4Methods.victoryMessage(playerChoice, computerChoice);
                wins++;
            
            // if player and computer chose the same thing
            } else if (playerChoice == computerChoice){ // tie
                JOptionPane.showMessageDialog(null, 
                       "You both chose " + 
                               Lab4Methods.choiceString(playerChoice) +
                               "\n\n \t It's a tie.",
                       Lab4Methods.TITLE,
                       JOptionPane.PLAIN_MESSAGE);
                ties++;
                
            // if computer wins
            } else { 
                JOptionPane.showMessageDialog(null,
                        "The Computers " + 
                                Lab4Methods.choiceString(computerChoice) + 
                                " beats your " + 
                                Lab4Methods.choiceString(playerChoice) +
                                "\n\n \tSorry, you lost...",
                        Lab4Methods.TITLE,
                        JOptionPane.PLAIN_MESSAGE);
            losses++;
            }
            
            // promts user if they want to play again.
            gameAgain = JOptionPane.showOptionDialog(null,
                    "Would you like to play again?",
                    Lab4Methods.TITLE,
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    new String[]{"Play again", "Quit"},
                    "");
            
        } while (gameAgain == JOptionPane.YES_OPTION);
       
        // prints wins losses and ties
        JOptionPane.showMessageDialog(null,
               "Your Wins, Losses, and Ties " + "\n\nWins: " + wins + 
                       "\nLosses: " + losses + "\nTies: " + ties,
                Lab4Methods.TITLE,
                JOptionPane.PLAIN_MESSAGE);
      
    }
    
}
