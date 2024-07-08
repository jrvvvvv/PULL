/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author JRV
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
   
    static int triangle(int n){
        
        if (n<1)
            return 1;
        else{
            
            System.out.println(n);
            return n+triangle(n-1);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner triER= new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n= triER.nextInt();
        
        triangle(n);
        int nn=n ;
        int totaln=nn+nn;
        System.out.println("Triangular Total: "+ totaln);
      
    }
    
}
