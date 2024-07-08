/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forsquare;

/**
 *
 * @author JRV
 */
import java.util.*;
public class ForSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        int width,height,colcount,rowcount;
        colcount=0;
        rowcount=0;
        
        
         System.out.print("Enter your designated height: ");
        height=input.nextInt();
        
        System.out.print("Enter your designated width: ");
        width=input.nextInt();
        
        
        System.out.println("\n"+"Your @ Squared:");
        System.out.println("");
        
        for(rowcount=0;rowcount<height;rowcount++){
            for(colcount=0;colcount<width;colcount++){
                System.out.print("@");
            }
                System.out.println();
        }
        
    }
    
}
