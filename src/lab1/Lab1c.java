/*
  * File: Lab1c.java
  * Auther: Caleb Howard
  * Date: 9/6/2017
  * This program prints a table that displays Bob's, Steve's, and Kim's
grade/points earned.
*/
package lab1;


public class Lab1c {
    
    public static void main(String[] args){
        // Bob's Points variable names
        int bobsLabPoints;
        int bobsBonusPoints;
        int bobsTotalPoints;
        // Steve's Points variable names
        int stevesLabPoints;
        int stevesBonusPoints;
        int stevesTotalPoints;
        // Kim's Points variable names
        int kimsLabPoints;
        int kimsBonusPoints;
        int kimsTotalPoints;
        
        // Bob's Points
        bobsLabPoints = 43;
        bobsBonusPoints = 7;
        bobsTotalPoints = bobsLabPoints + bobsBonusPoints;
        // Steve's Points
        stevesLabPoints = 39;
        stevesBonusPoints = 5;
        stevesTotalPoints = stevesLabPoints + stevesBonusPoints;
        // Kim's Points
        kimsLabPoints = 47;
        kimsBonusPoints = 14;
        kimsTotalPoints = kimsLabPoints + kimsBonusPoints;
        
        // Prints Border
        System.out.println("//////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n"+
                           "==Student Scores==\n"+
                           "//////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");
        // Prints top of table
        System.out.println("Name\t" + "Lab\t" + "Bonus\t" + "Total\n" +
                          "\n----\t" + "---\t" + "-----\t" + "-----\n");
       
        // Prints Bob's points
        System.out.println("Bob\t" + bobsLabPoints + "\t" + bobsBonusPoints +
                "\t" + bobsTotalPoints + "\n");
        // Prints Steve's points
        System.out.println("Steve\t" + stevesLabPoints + "\t" + 
                stevesBonusPoints + "\t" + stevesTotalPoints + "\n");
        // Prints Kims's points
        System.out.println("Kim\t" + kimsLabPoints + "\t" + kimsBonusPoints +
                "\t" + kimsTotalPoints);
    
    }
}
