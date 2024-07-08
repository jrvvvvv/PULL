/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequence3;

/**
 *
 * @author JRV
 */
public class Sequence3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //sequence = 1, 10, 2, 9, 3, 8, 4, 7, 5, 6, 6 
        
        int a,b,c;
        a=1;
        b=10;
        
        
         
        do{
           
           System.out.print(a+",");
           a++;
           System.out.print(b+",");
           b--;
           
        }
        while (a<=6 || b>=6);
        
    }
    
}
