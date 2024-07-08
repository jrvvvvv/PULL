/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meitemfour;

/**
 *
 * @author JRV
 */
import java.util.*;
public class MEItemFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        String ints;
        int intss,prod;
                
        String[] arrveg={
            "Sitaw ", "Kalabasa ", "Repolyo ", "Kang-kong ", "Kalabasa "
        };
        
         int[] arrints=new int [5];
        
        //display all arrveg
        System.out.println("Displaying arrveg[]...");
        System.out.println(arrveg[0] + arrveg[1] + arrveg[2] + arrveg[3] + arrveg[4] + "\n");
        
        //displaying index [2] and index [3] of the arrveg
        
        System.out.println("displaying index [2] and index [3] of the arrveg[]...");
        System.out.println(arrveg[2]); 
        System.out.println(arrveg[3]); 
        
        System.out.println("");
        
        System.out.println("Please input 5 integers...");
          for(int i=0;i<5;i++)
            arrints[i]=input.nextInt();
        
          
          System.out.println("\n"+ "Your inputted 5 integers: ");
          for(int i=0;i<5;i++)
        System.out.print(" " +arrints[i] );
          
        prod=arrints[4] * arrints[0];
        System.out.println("\n" + "The product of Index[4] and index[0]: "+ prod);
        
        
         System.out.println("Deleting both indexes 1 on both arrays...."+" \n");
         //di ko madelete maam
         System.out.println("Can't delete programmer overheated..."+"\n");
         
         System.out.println("Displaying both arrays"+"\n");
         System.out.print("Displaying arrveg[]= {");
            for(int i=0;i<5;i++)
               System.out.print("," +arrveg[i] );
            
            System.out.print("}");
            System.out.println("");
            System.out.print("Displaying arrints[]= {");
            
            for(int j=0;j<5;j++)
                System.out.print("," +arrints[j] );
            
            System.out.print("}");
                 
             
         
        
                 
         
      
         
         
      
         
       
        
        
        
       
    
    }
    
}
