/*
  * File: Rectangle.java
  * Author: Caleb Howard
  * Date: 9/19/2017
  * The following program asks for the length and width of a rectangle
then prints the area and perimeter of the rectangle.
*/
package lab2;
import java.util.Scanner;

public class Rectangle{
    
  public static void main(String [] args){
    
    // Scanner declaration
    Scanner input = new Scanner(System.in);
    
    // Declares variable names used for rectangle calculation
    int length, width, area, perimeter;
    
    // Asks user for rectangle length and receives it
    System.out.print("Enter the length: ");
    length = input.nextInt();
    
    // Asks user for rectangle width and receives it
    System.out.print("Enter the width: ");
    width = input.nextInt();
      
    // Calculates the area of the rectangle then prints it
    area = length * width;
    System.out.println("Area = " + area);
    
    // Calculates the perimeter of the rectangle then prints it    
    perimeter = 2 * (length + width); 
    System.out.println("Perimeter = " + perimeter);

  }   
} 


    
    

