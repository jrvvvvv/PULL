/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labrecactone_villanueva;

/**
 *
 * @author JRV
 */
import java.util.*;
import java.lang.*;
public class LabRecActOne_Villanueva {

    /**
     * @param args the command line arguments
     */
    
     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
       
        
        do{
        System.out.println("Welcome to Tower of Hanoi");
        System.out.println("We have 4 Rods: ");
        System.out.println("J          K           L           M  ");
        System.out.print("Input the number of discs: ");
        System.out.println("Number of Moves: "+ calculatingmoves(input.nextInt()));
        System.out.println("\n");
        }
        
        while(true);
       
        
    }
    
    //recursive procedure
     static int calculatingmoves(int n){  // n is the number for the moves;
         
        if (n==1){
            return 1;
        }
        else
            return (int)(Math.pow(2,n-1));
    }
}
