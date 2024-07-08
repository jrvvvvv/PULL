/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequence1;

/**
 *
 * @author JRV
 */
public class Sequence1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //sequence = 1, 3, 6, 10, 15, 21, 28, 36, 45, 55
        int a,b;
        a=1;
        b=1;
        
        do{
           
            System.out.print(" "+a);
            b++;
            a=a+b;
           
        }
        while(b<=10);
    }
    
}
