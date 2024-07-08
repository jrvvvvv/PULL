/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator;

/**
 *
 * @author JRV
 */
import java.util.*;
public class PassengerElevator {
    public Scanner passenger=new Scanner(System.in);
    public int desiredFloor;
      public boolean doorOpen=false;
     public int currentFloor=1;
     public final int TOP_FLOOR=10;
     public final int MIN_FLOORS=1;
     
     
     
     public void openDoor(){
         System.out.println("Press any key to open the door.");
         passenger.nextLine();
         System.out.println("Opening door.");
         doorOpen=true;
         System.out.println("Door is open.");
     }
     
     public void closeDoor(){
         System.out.println("Press any key to close the door.");
         passenger.nextLine();
         System.out.println("Closing door.");
         doorOpen=false;
         System.out.println("Door is closed."); 
     }
     
     public void goUp(){
         
         if(currentFloor == TOP_FLOOR){
             System.out.println("Cannot go up anymore");
         }
         
         else{
         System.out.println("Going up one floor.");
         currentFloor++;
         System.out.println("Floor: "+ currentFloor);
         }
         
     }
     
     public void goDown(){
         
         if(currentFloor == MIN_FLOORS){
             System.out.println("Cannot go down. NO BASEMENT");
         }
         
             
          else{
          System.out.println("Going down one floor.");
         currentFloor--;
         System.out.println("Floor: "+ currentFloor);
                 }
     }
     
     public void desiredFloor(){
         System.out.println("Which Floor do you want?: ");
        desiredFloor= passenger.nextInt();
        
        if(desiredFloor >= currentFloor){
        do{
            
            System.out.println("Going up");
            currentFloor++;
            System.out.println("Floor: " + currentFloor );
            
            if(currentFloor == TOP_FLOOR){
                System.out.println("Cannot go up anymore");
                break;
                
            }
            
        }
        
        while(desiredFloor > currentFloor);
        
        }
        
        else{
            do{
                
            System.out.println("Going down");
            currentFloor--;
            System.out.println("Floor: " + currentFloor );
            
             if(currentFloor == MIN_FLOORS){
                System.out.println("Cannot go down anymore");
                break;
             }
             
            }
            
            while(desiredFloor < currentFloor );
        }
        
     }
}
