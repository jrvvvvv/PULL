/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labrecacttwo_villanueva;

/**
 *
 * @author JRV
 */
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class LabRecActTwo_Villanueva {

    /**
     * @param args the command line arguments
     */
    public static String theWord;
    
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input=new Scanner(System.in);
   
        
        
        System.out.print("Input a Four Letters Word: ");
        calcAnagram(theWord=input.nextLine());
       
        
        
    }
    
    public static String calcAnagram(String word){
        Random random = new Random();
        for (int i=0;i<theWord.length();i++){
            int randomCharacterPosition = random.nextInt(theWord.length());
            String start = theWord.substring(0,randomCharacterPosition);
            String end = theWord.substring(randomCharacterPosition);
            theWord = end.concat(start);

        }
        System.out.println("The Anagram: "+ theWord);
        return null;
    
        
     
    }
    
  
    }
    


