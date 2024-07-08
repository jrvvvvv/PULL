/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstatement;

/**
 *
 * @author JRV
 */
import java.util.*;
public class ControlStatement {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
                
        int number1,number2,number3,number4,number5,sum=0;
        int indicator=0;
        
        System.out.println("Type any 5 numbers you want to add: ");
       
       do{
           indicator++;
            System.out.print("Number "+ indicator + ":" );
            number1=input.nextInt();
             if(number1<=0){
                 continue;
             }
             sum+=number1;
            
       }
       while (indicator != 5);
       System.out.println("The sum is: "+ sum);
        
         
        
        
       
            
        
      
        
        
    }
    
}
