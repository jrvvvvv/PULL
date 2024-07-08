/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package season;

/**
 *
 * @author JRV
 */
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
public class Season {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        
        Date date=new Date();
        LocalDate today=date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        String nickname,month,fav_movie,fav_foods,hobbies;
        int day,year,age,today_year=today.getYear();
                
                
         try{       
        System.out.println("Nickname: ");
        nickname=input.nextLine();
        
        System.out.println("Birthdate: ");
        System.out.println("month: ");
        month=input.nextLine();
        System.out.println("day: ");
        day=input.nextInt();
        input.nextLine();
        System.out.println("year ");
        year=input.nextInt();
        input.nextLine();
        
        System.out.println("Favorite Movies: ");
        fav_movie=input.nextLine();
        
        System.out.println("Favorite Foods: ");
        fav_foods=input.nextLine();
        
        System.out.println("Hobbies/Interest: ");
        hobbies=input.nextLine();
        
        
        
        age=today_year-year;
        
        System.out.println("");
        System.out.println("Hi! "+nickname+", I hope we could celebrate this coming "+month+" as you turn "+age+" years old.");
        System.out.println("Let's watch that "+fav_movie+" movie that you used to watch. While having "+fav_foods);
        System.out.println("Perhaps you could also teach me how to "+hobbies);
         }
         
         
         catch(Exception e){
          System.out.println("Error on inputting variables, Please try again. ");  
         }
        
        
        
    }
    
}
