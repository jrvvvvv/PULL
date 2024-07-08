/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package months;

/**
 *
 * @author JRV
 */

import java.util.*;
public class Months {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        String month;
        
        System.out.print("Input any month of the year: ");
        month=input.next();
        
        if(month.equalsIgnoreCase("January")){
           System.out.println("The cold never bothered me anyway!");
           
        }
        
        else if(month.equalsIgnoreCase("February")){
            System.out.println("Enjoy the last month of Winter!");
        }
        
        else if(month.equalsIgnoreCase("March")){
            System.out.println("Enjoy the beginning of SPRING SEASON!");
        }
        
        else if(month.equalsIgnoreCase("April")){
            System.out.println("Look at that beautiful flowers!");
            
        }
        
        else if(month.equalsIgnoreCase("May")){
            System.out.println("Oh no! It's starts getting hotter");
        }
        
        else if(month.equalsIgnoreCase("June")){
            System.out.println("Enjoy the beginning of HOT SUMMER!");
        }
        
        else if(month.equalsIgnoreCase("July")){
            System.out.println("My body sweating!");
        }
        
        else if(month.equalsIgnoreCase("August")){
            System.out.println("Thank god! The heat is becoming less hotter");
        }
        
        else if(month.equalsIgnoreCase("September")){
            System.out.println("Enjoy the FALL SEASON!");
        }
        
        else if(month.equalsIgnoreCase("October")){
            System.out.println("Look at that leaves falling!");
        }
        
        else if(month.equalsIgnoreCase("November")){
            System.out.println("It's getting cold right now");
        }
        
        else if(month.equalsIgnoreCase("December")){
            System.out.println("ENjoy the COLD WINTER!");
        }
        
        else{
            System.out.println("Sorry, you have inputted an invalid or misspelled value of month of the year!");
        }
        
    }
    
}
