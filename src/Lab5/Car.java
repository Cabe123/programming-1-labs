/*
   * File: Car.java
   * Auther: Caleb Howard
   * Date: 12/6/2017
   * the following program contains the necessary methods (constructors setters/
getters and toSting) for a car object. It also contain some message/input 
validation methods
*/
package Lab5;

import javax.swing.JOptionPane;

public class Car{
  // object data field
  private int yearModel;
  private String make;
  private int speed;
  
  static String invalidInput = "Sorry that is an invalid input.";
  // no argument contructor
  public Car(){
    setSpeed(0);

}
  // argument constructor
  public Car(int yearModel, String make){
    
    setModel(yearModel);
    setMake(make);
    setSpeed(0);
    
  }
  // sets model year of the car
  public void setModel(int yearModel){
    this.yearModel = yearModel;
  }
  // gets model year of the car
  public int getModel(){
    return yearModel;
  }
  // sets make of the car
  public void setMake(String make){
    this.make = make;
  }
  // gets make of the car
  public String getMake(){
    return make;
  }
  // sets speed of the car
  public void setSpeed(int speed){
    this.speed = speed;
  }
  // gets the speed of the car
  public int getSpeed(){
    return speed;
  }
  // this method accelerates the car by adding 5 to speed
  public void accelerate(){
    speed += 5;
  }
  // this method hits the brakes on car subtracting 5 from speed
  public void brake(){
    if (speed >= 5)
      speed -= 5;
  }
  // method assigns object data to a string
  public String toString(){
    
    String car = "This car was made by " + getMake() + " in the year " +
            getModel();
    
    return car;
  };
  // this method introduces the user to the program
  public static void intro(){
    JOptionPane.showMessageDialog(null,
            "Hello, and welcome to the garage!\n" + 
                    "You can bring your own cars, or you can take " + 
                    "a spin in my car.\n" +
                    "If you wish to bring your own car you'll have\n" + 
                    "to register it, so I'll need some details for " + 
                    "some paper work.\n" + "Nothing major just the car's " + 
                    "Make and year Model.\n" +
                    "Oh, and we also have a strict policy of 3 cars per " +
                    "person.");
  }
  
  // this method accepts the users input and validates that it's an integer
  public static int userInputYearModel(){
    boolean inputInvalid = false;
        int userInput = 0; 
        while (!inputInvalid){
          try {
            userInput = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Please input your car's year model.\n" +
                            "It must be a four digit number\n" +
                            "Example: 1988"));
            if (userInput < 1000 || userInput > 9999)
                JOptionPane.showMessageDialog(null,
                        invalidInput);
            else {
                inputInvalid = true;
            }
            } catch(NumberFormatException e)  {
                JOptionPane.showMessageDialog(null, 
                        invalidInput);               
            }
        }
        return userInput;
  }
  // this method accepts user input and validates that it contains only
  // letters and spaces
  public static String userInputMake(){
    boolean inputInvalid = false;
        String input = ""; 
        while (!inputInvalid){
          
            input = JOptionPane.showInputDialog(null,
                    "Please input your car's make.\n" + 
                            "Only use the letters in the alphabet\n" +
                            "Capitalization is fine\n" +
                            "Spaces are fine as long as they're not at " +
                            "the beginning\n" +
                            "Example: Honda");
            for (int i = 0; i < input.length(); i++){
              // checks if the input is only letters or spaces
              if ((input.charAt(i) >= 65 && input.charAt(i) <= 90) || // A - Z
                    (input.charAt(i) >= 97 && input.charAt(i) <= 127)||// a - z
                    (input.charAt(i)) == 32){ // space bar
                // checks if the first character is a space
                if (input.charAt(0) == 32){
                  JOptionPane.showMessageDialog(null,
                          invalidInput);
                  break;
                }
                // makes sure the whole input has been checked
                if (i == input.length() - 1)
                inputInvalid = true;
                
                } else {JOptionPane.showMessageDialog(null,
                        invalidInput);
                break;
              } 
          }
      }
        return input;
  }
  // this method prompts the user if they want to drive a car
  public static int carMessage(String car){
    int input = JOptionPane.showOptionDialog(null,
            car,
            "Looking at the car",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            new String[]{"Drive","Cancel"},
            "");
    return input;
  }
  // this method prompts user if they want to accelerate/brake/go back
  public static int drive(int speed){

    int  input = JOptionPane.showOptionDialog(null,
              "Use the pedals to brake/accelerate\n" +
                      "Your current speed is " + speed + " mph",
              "Driving the car",
              JOptionPane.DEFAULT_OPTION,
              JOptionPane.PLAIN_MESSAGE,
              null,
              new String[]{"Accelerate","Brake","Go back to Garage"},
              "");
      return input;
  }
  
  
  
}
  
  
  

