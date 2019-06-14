/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author Cjhoward1
 */
public class Lab3a {
    
  public static void main(String[] args){
    // Constants  
    final double SAVING_INTEREST = .04;
    final double CHECKING_INTEREST_ONE = .03;
    final double CHECKING_INTEREST_TWO = .05;
    final int SAVING_SERVICE_CHARGE = 10;
    final int CHECKING_SERVICE_CHARGE = 25;
    
    // Formatter
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    // Scanner
    Scanner input = new Scanner(System.in);
    
    String s1 = "Your account number is ";
    String s2 = "Your account type is ";
    String s3 = "Your current balance is ";
    String s4 = "Your new balance is ";
    
    // Promts user for account number then receives it
    System.out.println("Please enter your 5 digit account number.\n" + 
            "Example: 47283");
    int accountNumber = input.nextInt();
    
    // checks if account number is 5 digits long
    if (accountNumber <= 99999 && accountNumber >= 10000){
      
      // Promts user account type then receives it
      System.out.println("Thank you.\n" + "Please enter your account type " +
              "Savings or Checking");
      System.out.println("You can type S or C for short");
      String accountTypeInput = input.next();
      
      // obtains first character in string
      char accountType = accountTypeInput.charAt(0);
      
      // checks if it's savings 
      if (accountType == 'S' || accountType == 's'){
        System.out.println("Please enter your minimum balance");
        int minimum = input.nextInt();
        
        System.out.println("Thank you. Please enter your current balance.");
        int current = input.nextInt();
        
        // checks if current balance is over minimum
        if (current >= minimum){
         double newBalance = (current * SAVING_INTEREST) + current;
         
         System.out.println(s1 + accountNumber);
         System.out.println(s2 + "Saving");
         System.out.println(s3 + fmt.format(current));
         System.out.println(s4 + fmt.format(newBalance));
        
        } else {
            double newBalance = current - SAVING_SERVICE_CHARGE;
            
            System.out.println("Your account number is " + accountNumber);
            System.out.println("Your account type is saving");
            
            System.out.print("\nIt seems that your current balance " + 
                    fmt.format(current)); 
            System.out.println(" is below your minimum balance " + 
                    fmt.format(minimum));
            System.out.println("That will be a " + 
                    fmt.format(SAVING_SERVICE_CHARGE) + " service charge");
            
            
            System.out.println("Your new balance is" + fmt.format(newBalance));
            
          
        } 
            
      } else if (accountType == 'C' || accountType == 'c'){
        
          System.out.println("Please enter your minimum balance");
          int minimum = input.nextInt();
        
          System.out.println("Thank you. Please enter your current balance.");
          int current = input.nextInt();    
          
          int tempBalance = current - minimum;
          
          if (tempBalance > 5000){
           double newBalance = (current * CHECKING_INTEREST_ONE) + current;
           
           System.out.println("Your Account nummber is " + 
                   accountNumber);
           System.out.println("Your Account type is checking");
           
           System.out.println("Your current balance was " + 
                   fmt.format(current));
           System.out.println("Your new balane is" + 
                   fmt.format(newBalance));
           
          } else if (tempBalance < 5000 && current >= minimum) {
              double newBalance = (current * CHECKING_INTEREST_TWO) + current;
              
              System.out.println("Your Account number is " +
                      accountNumber);
              System.out.println("Your Acount type is checking");
              
              System.out.println("Your current balance was " + 
                      fmt.format(current));
              System.out.println("Your new balance is" +
                      fmt.format(newBalance));
          } else {
              double newBalance = current - CHECKING_SERVICE_CHARGE;
              
              System.out.println("Your account number is " + accountNumber);
              System.out.println("Your account type is checking");
            
              System.out.print("\nIt seems that your current balance " + 
                    fmt.format(current)); 
              System.out.println(" is below your minimum balance " + 
                    fmt.format(minimum));
              System.out.println("That will be a " + 
                      fmt.format(CHECKING_SERVICE_CHARGE + "service charge"));
              
              System.out.println("Your new balance is " + 
                      fmt.format(newBalance));
              
          
          }
      
      } else {
        System.out.println("Invalid account type");
      }
      
    } else {
      System.out.println("Account number must be 5 digits.\n" + 
              "Example: 25843");
    }     
  }
}
