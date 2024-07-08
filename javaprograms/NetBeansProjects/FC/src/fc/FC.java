/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fc;

/**
 *
 * @author JRV
 */
public class FC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FC fc=new FC();
        
        int factresult=fc.Fact(4);
        System.out.println("Factorial: "+ " "+ factresult);
    }
    
    public int Fact(int n){
        if (n==1){
            return 1;        
        }
        else{
             System.out.println(n);
            return n*Fact(n-1);  
        }
    }
    
}
