/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhilesquare;

/**
 *
 * @author JRV
 */
import java.util.*;
public class DoWhileSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int height,width,colCount,rowCount;
        colCount=0; //to width
        rowCount=0; //to height
        
        System.out.print("Enter your designated height: ");
        height=input.nextInt();
        
        System.out.print("Enter your designated width: ");
        width=input.nextInt();
        
        
        System.out.println("\n"+"Your @ Squared:");
        System.out.println("");
        
       do{
           colCount=0;
         do{
             
             System.out.print("@");
             colCount++;    
     
         }
         while(colCount<width);
         
         System.out.println();
         rowCount++;
       }
        while(rowCount<height);
    }
    
}
