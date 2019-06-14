/*
  * File: Lab2c.java
  * Author: Caleb Howard
  * Date: 9/22/2017
  * The following program takes the user's pay per hour and hours worked in
4 weeks then prints what they made before/after taxes, what they spent on
clothes and school supplies, then what they spent on savings bonds
and what their parents spent on savings bonds.
*/
package lab2;
import java.util.Scanner;
import java.text.NumberFormat;

public class Lab2c {
     
  public static void main(String[] arg){
    
    // Formatter Declaration    
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
      
    // Scanner Declaration 
    Scanner input = new Scanner(System.in);
        
    // Promts user for pay rate
    System.out.println("Please enter your pay rate per hour:\n");
    double payRate = input.nextDouble();
        
    //Promts user for hours worked in 4 weeks
    System.out.println("\nThank you. Please enter the number of hours\n"+
                "you have worked over the past 4 weeks:\n");
    int hoursWorked = input.nextInt();
        
    // Checks if the hours worked in 4 weeks is over the amount of hours in
    // 4 weeks
    if (hoursWorked > 672){
      System.out.println(hoursWorked + " hours? " + "There are only " + 
                    "672 hours in 4 weeks.");
    }
    
    else {
    
      // Amount made    
      double totalPay = payRate * hoursWorked; 
      // prints money earned before taxes 
      System.out.println("\nYou earned " + fmt.format(totalPay) + 
              " before taxes.");
    
      // Constant tax percentage    
      final double TOTAL_TAX = totalPay * .14; 
    
      // Net Income variable declartion
      double netIncome = totalPay - TOTAL_TAX;
      // prints money earned after taxes  
      System.out.println("You earned " + fmt.format(netIncome) + 
              " after taxes."); 
    
      // Constant money spent on clothes and accesssories    
      final double CLOTHES = netIncome * .10;
      // prints money spent on clothes       
      System.out.println("You spent " + fmt.format(CLOTHES) + 
              " on clothes."); 
    
      // Contsant money spent on School Supplies
      final double SCHOOL_SUPPLIES = netIncome * .01;
      // prints money spent on school supplies
      System.out.println("You spent " + fmt.format(SCHOOL_SUPPLIES) + 
              " on school supplies.");
    
      // netIncome after Clothes and School supplies
      netIncome = netIncome - (CLOTHES + SCHOOL_SUPPLIES);
    
      // Constant for Saving Bonds
      final double SAVINGS_BONDS = netIncome * .25;
      // prints money spent on savings bonds
      System.out.println("You spent " + fmt.format(SAVINGS_BONDS) + 
              " on savings bonds"); 
    
      // Contsant for Parent saving bonds
      final double PARENT_SAVINGS_BONDS = SAVINGS_BONDS * .50;
      // prints money perents spent on savings bonds
      System.out.println("And your parents bought you " +
              fmt.format(PARENT_SAVINGS_BONDS) + " worth in savings bonds.");
 
    }
  }
}
