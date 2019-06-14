/*
  * File: CarTest.java
  * Auther: Caleb Howard
  * Date: 12/6/2017
  * the following program welcomes the user to a garage where they can drive
the owners car, or  they cane register 3 of their own and drive them.
it also uses contructors to create car objects where the user can assign
a make/year model and drive them by accelerating/braking
*/
package Lab5;

import javax.swing.JOptionPane;

public class CarTest {
  
  public static void main(String[] args){
    
    
    // initializing the user's cars
    Car userCar1 = new Car();
    Car userCar2 = new Car();
    Car userCar3 = new Car();
    
    // creating garage owners car with argument contructor
    Car garageOwnerCar = new Car(1957,"Chevrolet");
    
    
    boolean quitProgram = false; // used if the user wants to quit the program
    int userChoice; // used for user's input
    int userCarNumber = 0;// tracks how many cars the user has made
    
    // arrays for user's cars
    String[] userCarsMake = {"empty","empty","empty"};
    int [] userCarsYearModel = new int[3];
    
    Car.intro();// calls introduction method
    // main loop
    do {
      // promts the user if the want to register/view cars
      userChoice = JOptionPane.showOptionDialog(null,
             "So what do you want to do?",
             "Garage",
             JOptionPane.DEFAULT_OPTION,
             JOptionPane.PLAIN_MESSAGE,
             null,
             new String[]{"Register a new car","Drive my own cars",
               "Try your car","Leave"},
             "");
             
      // if the user registers a car
      if (userChoice == 0 && userCarNumber < 3){
        // calls input/validation methods and the assigns value to user arrays
        userCarsMake[userCarNumber] = Car.userInputMake();
        userCarsYearModel[userCarNumber] = Car.userInputYearModel();
      
        // uses which car the user is on to assigns corresponding data to object
        // using a argument constructor
        switch(userCarNumber){
          // assigns data to car 1
          case(0):userCar1 = new Car(userCarsYearModel[userCarNumber],
          userCarsMake[userCarNumber]);
          // promts user how many more cars they can register
          JOptionPane.showMessageDialog(null, "You can register 2 more cars");
            
          break;// assigns data to car 2
          case(1):userCar2 = new Car(userCarsYearModel[userCarNumber],
          userCarsMake[userCarNumber]);
          // promts user how many more cars they can register
          JOptionPane.showMessageDialog(null, "You can register 1 more car");
            
          break;// assigns data to car 3
          case(2):userCar3 = new Car(userCarsYearModel[userCarNumber],
          userCarsMake[userCarNumber]);
          // promts user how many more cars they can register
          JOptionPane.showMessageDialog(null,
                  "You can't register anymore cars");
        } 
        userCarNumber++; // increments the number of cars the user has registered
      
       // if user wants to drive thier own cars
      } else if (userChoice == 1){
        // if they don't have any cars registered
        if (userCarNumber == 0){
          JOptionPane.showMessageDialog(null,
                  "You don't have any cars registerd\n" +
                        "Register one then come back");
          // if the user has registered a car
        } else {
          // prompts which car they want to drive
            int userChoice2 = JOptionPane.showOptionDialog(null,
                    "Which car do you wants to drive?",
                    "",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    userCarsMake,
                    "");
            // input number corresponds to car number
            switch(userChoice2){
              // user car 1    
              case(0):
                // initializing variable for user input
                int inputCar1 = 0;
                
                // prompts user if they want to drive the car
                int wantToDriveCar1 = Car.carMessage(userCar1.toString());
                
                // if the user drives
                if (wantToDriveCar1 == 0) {
                  
                  while (inputCar1 != 2){
                    // prompts user if they wants to accel/brake/exit
                    // it also prints the user's current speed
                    inputCar1 = Car.drive(userCar1.getSpeed());
                    // if the user wants to accelerate
                    if (inputCar1 == 0){
                      for (int i = 0; i < 3; i++){
                        userCar1.accelerate();// calls accelerate method  
                        JOptionPane.showMessageDialog(null,// prints speed
                                "You accelerated to " + userCar1.getSpeed() +
                                        " mph");
                      
                      }
                      // if the user wants to brake
                    } else if (inputCar1 == 1){
                    
                      for (int i = 0; i < 3; i++){
                      userCar1.brake();// calls brake method
                      JOptionPane.showMessageDialog(null,// prints speed
                              "Your braking slowed you down to " +
                                      userCar1.getSpeed() + " mph");
                      }
                      // if the user wants to exit
                    } else { 
                      inputCar1 = 2;
                    }
                  }
                }  
              break;
              // user car 2  // checks if the user has registered the car
              case(1):  
                if (userCar2.getMake() != null){
                  // initializing variable for user input
                  int inputCar2 = 0;
                  
                  // prompts user if they want to drive the car
                  int wantToDriveCar2 = Car.carMessage(userCar2.toString());
                  
                   // if the user drives
                  if (wantToDriveCar2 == 0) {
                  
                   while (inputCar2 != 2){
                      // prompts user if they wants to accel/brake/exit
                      // it also prints the user's current speed
                      inputCar2 = Car.drive(userCar2.getSpeed());
                      // if the user wants to accelerate
                      if (inputCar2 == 0){
                        for (int i = 0; i < 3; i++){
                          userCar2.accelerate();// calls accelerate method  
                          JOptionPane.showMessageDialog(null,// prints speed
                                  "You accelerated to " + userCar2.getSpeed() + 
                                          " mph");
                      
                        }
                        // if the user wants to brake
                      } else if (inputCar2 == 1){
                    
                        for (int i = 0; i < 3; i++){
                        userCar2.brake();// calls brake method
                       JOptionPane.showMessageDialog(null,// prints speed
                                "Your braking slowed you down to " +
                                        userCar2.getSpeed() + 
                                        " mph");
                      }
                      // if the user wants to exit
                      } else { 
                        inputCar2 = 2;
                      }
                    }
                  }
                }
              break;    // checks if the user has registered the car
              case(2):  
                if (userCar3.getMake() != null){
                  // initializing variable for user input
                  int inputCar3 = 0;
                  
                  // prompts user if they want to drive the car
                  int wantToDriveCar3 = Car.carMessage(userCar3.toString());
                  
                    // if the user drives
                  if (wantToDriveCar3 == 0) {
                  
                    while (inputCar3 != 2){
                      // prompts user if they wants to accel/brake/go back
                      // it also prints the user's current speed
                      inputCar3 = Car.drive(userCar3.getSpeed());
                      // if the user wants to accelerate
                      if (inputCar3 == 0){
                        for (int i = 0; i < 3; i++){
                          userCar3.accelerate();// calls accelerate method  
                          JOptionPane.showMessageDialog(null,// prints speed
                                "You accelerated to " + userCar3.getSpeed() + 
                                        " mph");
                    
                        }
                        // if the user wants to brake
                      } else if (inputCar3 == 1){
                    
                        for (int i = 0; i < 3; i++){
                        userCar3.brake();// calls brake method
                        JOptionPane.showMessageDialog(null,// prints speed
                                "Your braking slowed you down to " +
                                        userCar3.getSpeed() + 
                                        " mph");
                        } 
                        // if the user wants to exit
                      } else { 
                         inputCar3 = 2;
                      }
                    }
                  }
                }
            }
        } 
        // if the user wants to drive garage owners cars
      } else if (userChoice == 2){
        // initializing variable for user input
        int inputGarageCar = 0;
        // prompts user if they want to drive the car
        int wantToDriveCar = Car.carMessage(garageOwnerCar.toString());
        
        if (wantToDriveCar == 0) {
          
          while(inputGarageCar != 2){
            // prompts user if they wants to accel/brake/go back
            // it also prints the user's current speed
            inputGarageCar = Car.drive(garageOwnerCar.getSpeed());
            // if the user wants to accelerate
            if (inputGarageCar == 0){
              
              for (int i = 0; i < 3; i++){
                garageOwnerCar.accelerate();// calls accelerate method  
                JOptionPane.showMessageDialog(null,// prints speed
                      "You accelerated to " +
                       garageOwnerCar.getSpeed() + 
                       " mph");
                    
                        }
            // if the user wants to brake
            } else if (inputGarageCar == 1){
              
              for (int i = 0; i < 3; i++){
              garageOwnerCar.brake();// calls brake method
              JOptionPane.showMessageDialog(null,// prints speed
                      "Your braking slowed you down to " +
                            garageOwnerCar.getSpeed() + 
                            " mph");
                        }
             // if the user wants to exit car
            } else { 
                inputGarageCar = 2;
            }
          }
        }
        // if the user want's to exit the program
      } else if (userChoice == 3){
        
        quitProgram = true;
      }
     
    } while (quitProgram == false); 
  }  
}
