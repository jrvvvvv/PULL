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
public class Elevator {

    /**
     * @param args the command line arguments
     */
    
     public boolean doorOpen=false;
     public int currentFloor=1;
     public final int TOP_FLOOR=10;
     public final int MIN_FLOORS=1;
     
     public void openDoor(){
         System.out.println("Opening door.");
         doorOpen=true;
         System.out.println("Door is open.");
     }
     
     public void closeDoor(){
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
   
    
}
