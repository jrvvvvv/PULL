/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackact2;

/**
 *
 * @author JRV
 */
import java.util.*;
public class StackAct2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        String reverseword,originalString,reversedString;
        reversedString="";
        
        System.out.println("Input a word: ");
        originalString=input.nextLine();
        
        String words[]=originalString.split("\\s");
            
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        
        System.out.println("Word: "+ originalString);
        System.out.println("Reversed Word: "+reversedString);
    
}
}