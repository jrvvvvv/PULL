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
public class IfElevatorTest {
    public static void main(String[]args){
        Elevator myElevator=new Elevator();
        
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.openDoor();
        myElevator.goDown();
        myElevator.openDoor();
    }
}
