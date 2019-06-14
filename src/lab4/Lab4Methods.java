/*
  * File: Lab4Methods.java
  * Auther: Caleb Howard
  * Date: 11/14/2017
  * The following are methods used in Rock, Paper, Scissors game.
*/
package lab4;
import javax.swing.JOptionPane;
import java.util.Random;

public class Lab4Methods {
  public static String TITLE = "Rock, Paper, Scissors"; // Title declaration
  
  // Introduction Method  
  public static void intro(){
      
      JOptionPane.showMessageDialog(null, 
              "Welcome let's play Rock, Paper, Scissors",
              TITLE,
              JOptionPane.PLAIN_MESSAGE);
      JOptionPane.showMessageDialog(null,
              "The way you play Rock, Paper, Scissors is\n" +
                      "we each pick either Rock, Paper or Scissors\n" +
                      "and we see after who won.",
              TITLE,
              JOptionPane.PLAIN_MESSAGE);
      JOptionPane.showMessageDialog(null,
              "Paper beats Rock \nRock beats Scissors \nScissors beats Paper" +
                      "\n\nIf we both pick the same thing it's a tie",
              TITLE,
              JOptionPane.PLAIN_MESSAGE);
  }
  // The follow Method creats a random number then returns it.
  public static int computerChoice(){
    
      Random randomNumber = new Random();
      int results = randomNumber.nextInt(3);
    
      return results;
  }
  // This method promts user for choice then returns it
  public static int playerChoice(){
      
      int choice;
      choice = JOptionPane.showOptionDialog(null, 
      "Please choose below", 
      TITLE,
      JOptionPane.DEFAULT_OPTION,
      JOptionPane.PLAIN_MESSAGE,  
      null, 
      new String[]{"Scissors", "Paper", "Rock"},
      "");
    
      return choice;    
  } 
  /* This Method takes the player's/computer's choice (int) and finds the 
  correct string
  */
  public static String choiceString(int x){
      
      String results = "";
      switch (x){
          case(0): results = "Scissors"; break;
          case(1): results = "Paper"; break;
          case(2): results = "Rock";
      }
      return results;
  }
  /* This Method the player's and the computer's choice then puts them in a
 victory message*/
  public static void victoryMessage(int x, int y){
      
      JOptionPane.showMessageDialog(null,
              "Your " + Lab4Methods.choiceString(x) + " beats " +
                      "the Computer's " + Lab4Methods.choiceString(y) +
                      "\n\n \tCongratulations, You Won!",
              TITLE,
              JOptionPane.PLAIN_MESSAGE);
  }
       
}
