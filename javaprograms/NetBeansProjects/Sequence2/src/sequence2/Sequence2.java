/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequence2;

/**
 *
 * @author JRV
 */
public class Sequence2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //sequence = 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
        int a,b,c;
        a= 1;
        b= 0;
        c=0;
        
        c=a+b;
         do{
             
             
            System.out.print(" "+(c));
            
            a=b;
            b=c;
            c=a+b;
           
           
        }
        while(c<=55);
         
    
           
    }
    
}
