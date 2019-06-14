/*
  * File: Lab2a.java
  * Author: Caleb Howard
  * Date: 9/22/2017
  * The following program used to have a lot of errors, but now
takes the users First/Last name and their favorite number then prints
their name then favorite number squared.
*/
package lab2;
import java.util.Scanner; 

public class Lab2a {
    
    
  public static void main (String[] args){ 
     
    // Scanner Declaration  
    Scanner scan = new Scanner(System.in);
    
    // Name of the user 
    String name; 
 
    // Variable names for numbers
    int number, numberSq;
      
    // Promts user for First and Last
    System.out.print("Enter your first/last name, please: "); 
    name = scan.nextLine(); 

    // Promts user for their favorite number
    System.out.print ("What is your favorite number? "); 
    number = scan.nextInt(); 

    // Finds the square of the number.
    numberSq = number * number; 

    // Prints user's name and square of their favorite number.
    System.out.println(name +", the square of your favorite number is " + 
    numberSq); 
        
    }
}
