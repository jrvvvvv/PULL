/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unary1;

/**
 *
 * @author JRV
 */
public class Unary1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int count = 15;
        int a,b,c,d;
        a = count++;
        b = count;
        c = ++count;
        d = count;
        System.out.println(a + "," + b + "," + c + "," + d);
        
    }
    
}
