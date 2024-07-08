/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age;

/**
 * John Reynan Villanueva CEIT-03-202A
 * @author JRV
 */ 
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.*;
public class Age {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args){
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        Date date= new Date();
        LocalDate today=date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/mmmm/dd");
        Calendar cal = Calendar.getInstance();
        //current date
        int datemonth=today.getMonthValue();
        int dateday=today.getDayOfYear();
        int dateyear=today.getYear();
        int datetoday=today.getDayOfMonth();
         
       
       
        
        
        //birthday and age variables
        int age,day,year;
        int convertseconds,converthours;
        double convertday;
        
         String month;
        
        System.out.println("How old you are right now?");
        
        age=input.nextInt();
        System.out.println(age +" years old");
        
        System.out.println("What is your birthday?");
        System.out.print("Month: ");
        month=input.next();
        System.out.print("Day: ");
        day=input.nextInt();
        System.out.print("Year: ");
        year=input.nextInt();
        System.out.println(month+" "+day+" "+year);
        
        System.out.println(" ");
            
       
         System.out.println("Input: "+ age + " years old" );
         System.out.println("Birthday: "+ month+" "+day+" "+year );
         
          System.out.println("Current Date: " );
          System.out.println(datemonth+"-"+ datetoday+"-"+dateyear);
         System.out.println(" ");
         
        //variables output
    int monthh,monthleft,convertmonth,calculatedmonth,calculatedcurrentdate,calculatedbirthdate,calculatedyear,finalmonth,finaldate,finalday,
            finalhours,finalseconds;
    
     
    
         //display output
         switch(month){
             
              case "January":
              case "january":
              case "jan": 
                  month="1";
                  monthh=Integer.parseInt(month);
                  //month
                  calculatedyear=dateyear-year;
                  convertmonth=12-datemonth;
                  calculatedmonth=datemonth+convertmonth;
                  finalmonth=calculatedmonth*calculatedyear;
                  //days
                  convertday=(int)(finalmonth*30.417);
                  //hours
                  converthours=(int)(convertday*24);
                  //seconds
                  convertseconds=converthours*3600;
                  System.out.println("Output: ");
                  System.out.println("a. months= "+finalmonth+" months" );
                  System.out.println("b. days= "+convertday+" days" );
                  System.out.println("c. hours= "+converthours+" hours" );
                  System.out.println("d. seconds = "+convertseconds+ " seconds");
                  break;
                  
              case "February":
              case "february":
              case "feb": 
                  month="2";
                  monthh=Integer.parseInt(month);
                  //month
                  calculatedyear=dateyear-year;
                  convertmonth=12-datemonth;
                  calculatedmonth=monthh+convertmonth;
                  finalmonth=calculatedmonth*calculatedyear;
                  //days
                  convertday=(int)(finalmonth*30.417);
                  //hours
                  converthours=(int) (convertday*24);
                   //seconds
                  convertseconds=converthours*3600;
                  System.out.println("Output: ");
                  System.out.println("a. months= "+finalmonth+" months" );
                   System.out.println("b. days= "+convertday+" days" );
                   System.out.println("c. hours= "+converthours+" hours" );
                   System.out.println("d. seconds = "+convertseconds+ " seconds");
                  
                  break;
              
              case "March":
              case "march":
              case "mar": 
                  month="3";
                  monthh=Integer.parseInt(month);
                  //month
                   calculatedyear=dateyear-year;
                  convertmonth=12-datemonth;
                  calculatedmonth=monthh+convertmonth;
                  finalmonth=calculatedmonth*calculatedyear;
                  //days
                  convertday=(int)(finalmonth*30.417);
                  //hours
                  converthours=(int) (convertday*24);
                   //seconds
                  convertseconds=converthours*3600;
                  System.out.println("Output: ");
                  System.out.println("a. months= "+finalmonth+" months" );
                   System.out.println("b. days= "+convertday+" days" );
                   System.out.println("c. hours= "+converthours+" hours" );
                   System.out.println("d. seconds = "+convertseconds+ " seconds");
                  break;
                  
              case "April":
              case "april":
              case "apr": 
                  month="4";
                  monthh=Integer.parseInt(month);
                  //month
                   calculatedyear=dateyear-year;
                  convertmonth=12-datemonth;
                  calculatedmonth=monthh+convertmonth;
                  finalmonth=calculatedmonth*calculatedyear;
                  //days
               convertday=(int)(finalmonth*30.417);
                  //hours
                  converthours=(int) (convertday*24);
                   //seconds
                  convertseconds=converthours*3600;
                  System.out.println("Output: ");
                  System.out.println("a. months= "+finalmonth+" months" );
                   System.out.println("b. days= "+convertday+" days" );
                   System.out.println("c. hours= "+converthours+" hours" );
                   System.out.println("d. seconds = "+convertseconds+ " seconds");
                  break;
              
              case "May":
              case "may":
                  month="5";
                  monthh=Integer.parseInt(month);
                   //month
                calculatedyear=dateyear-year;
                  convertmonth=12-datemonth;
                  calculatedmonth=monthh+convertmonth;
                  finalmonth=calculatedmonth*calculatedyear;
                  //days
                 convertday=(int)(finalmonth*30.417);
                  //hours
                  converthours=(int) (convertday*24);
                   //seconds
                  convertseconds=converthours*3600;
                  System.out.println("Output: ");
                  System.out.println("a. months= "+finalmonth+" months" );
                   System.out.println("b. days= "+convertday+" days" );
                   System.out.println("c. hours= "+converthours+" hours" );
                   System.out.println("d. seconds = "+convertseconds+ " seconds");
                  break;
                  
              case "June":
              case "june":
              case "jun": 
                  month="6";
                  monthh=Integer.parseInt(month);
                 //month
                 calculatedyear=dateyear-year;
                  convertmonth=12-datemonth;
                  calculatedmonth=monthh+convertmonth;
                  finalmonth=calculatedmonth*calculatedyear;
                  //days
             convertday=(int)(finalmonth*30.417);
                  //hours
                  converthours=(int) (convertday*24);
                   //seconds
                  convertseconds=converthours*3600;
                  System.out.println("Output: ");
                  System.out.println("a. months= "+finalmonth +" months");
                   System.out.println("b. days= "+convertday+" days" );
                   System.out.println("c. hours= "+converthours+" hours" );
                   System.out.println("d. seconds = "+convertseconds+ " seconds");
                  break;
                  
              case "July":
              case "july":
              case "jul": 
                  month="7";
                  monthh=Integer.parseInt(month);
                   //month
                  calculatedyear=dateyear-year;
                  convertmonth=12-datemonth;
                  calculatedmonth=monthh+convertmonth;
                  finalmonth=calculatedmonth*calculatedyear;
                  //days
               convertday=(int)(finalmonth*30.417);
                  //hours
                  converthours=(int) (convertday*24);
                   //seconds
                  convertseconds=converthours*3600;
                  System.out.println("Output: ");
                  System.out.println("a. months= "+finalmonth+" months" );
                   System.out.println("b. days= "+convertday+" days" );
                   System.out.println("c. hours= "+converthours+" hours" );
                   System.out.println("d. seconds = "+convertseconds+ " seconds");
                  break;
                  
              case "August":
              case "august":
              case "aug": 
                  month="8";
                  monthh=Integer.parseInt(month);
                  //month
                  calculatedyear=dateyear-year;
                  convertmonth=12-datemonth;
                  calculatedmonth=monthh+convertmonth;
                  finalmonth=calculatedmonth*calculatedyear;
                  //days
              convertday=(int)(finalmonth*30.417);
                  //hours
                  converthours=(int) (convertday*24);
                   //seconds
                  convertseconds=converthours*3600;
                  System.out.println("Output: ");
                  System.out.println("a. months= "+finalmonth+" months" );
                   System.out.println("b. days= "+convertday+" days" );
                   System.out.println("c. hours= "+converthours+" hours" );
                   System.out.println("d. seconds = "+convertseconds+ " seconds");
                  break;
                  
              case "September":
              case "september":
              case "sep": 
                  month="9";
                  monthh=Integer.parseInt(month);
                   //month
                  calculatedyear=dateyear-year;
                  convertmonth=12-datemonth;
                  calculatedmonth=monthh+convertmonth;
                  finalmonth=calculatedmonth*calculatedyear;
                  //days
                convertday=(int)(finalmonth*30.417);
                  //hours
                  converthours=(int) (convertday*24);
                   //seconds
                  convertseconds=converthours*3600;
                  System.out.println("Output: ");
                  System.out.println("a. months= "+finalmonth+" months" );
                   System.out.println("b. days= "+convertday+" days" );
                   System.out.println("c. hours= "+converthours+" hours" );
                   System.out.println("d. seconds = "+convertseconds+ " seconds");
                  break;
                  
              case "October":
              case "october":
              case "oct": 
                  month="10";
                  monthh=Integer.parseInt(month);
                   //month
                calculatedyear=dateyear-year;
                  convertmonth=12-datemonth;
                  calculatedmonth=monthh+convertmonth;
                  finalmonth=calculatedmonth*calculatedyear;
                  //days
                convertday=(int)(finalmonth*30.417);
                  //hours
                  converthours=(int) (convertday*24);
                   //seconds
                  convertseconds=converthours*3600;
                  System.out.println("Output: ");
                  System.out.println("a. months= "+finalmonth+" months" );
                   System.out.println("b. days= "+convertday+" days" );
                   System.out.println("c. hours= "+converthours+" hours" );
                   System.out.println("d. seconds = "+convertseconds+ " seconds");
                  break;
                  
              case "November":
              case "november":
              case "nov": 
                  month="11";
                  monthh=Integer.parseInt(month);
                  //month
                  calculatedyear=dateyear-year;
                  convertmonth=12-datemonth;
                  calculatedmonth=monthh+convertmonth;
                  finalmonth=calculatedmonth*calculatedyear;
                  //days
                convertday=(int)(finalmonth*30.417);
                  //hours
                  converthours=(int) (convertday*24);
                   //seconds
                  convertseconds=converthours*3600;
                  System.out.println("Output: ");
                  System.out.println("a. months= "+finalmonth+" months" );
                   System.out.println("b. days= "+convertday+" days" );
                   System.out.println("c. hours= "+converthours+" hours" );
                   System.out.println("d. seconds = "+convertseconds+ " seconds");
                  break;
                  
              case "December":
              case "december":
              case "dec": 
                  month="12";
                  monthh=Integer.parseInt(month);
                  //month
                  calculatedyear=dateyear-year;
                  convertmonth=12-datemonth;
                  calculatedmonth=monthh+convertmonth;
                  finalmonth=calculatedmonth*calculatedyear;
                  //days
              convertday=(int)(finalmonth*30.417);
                  //hours
                  converthours=(int) (convertday*24);
                   //seconds
                  convertseconds=converthours*3600;
                  System.out.println("Output: ");
                  System.out.println("a. months= "+finalmonth+" months" );
                   System.out.println("b. days= "+convertday+" days" );
                   System.out.println("c. hours= "+converthours+" hours" );
                   System.out.println("d. seconds = "+convertseconds+ " seconds");
                  break;  
                  
          }
       
         
         
         
        
        
        
        
        
        
   
        
        
        
        
        
    }
    
          }
       
 
       
   
         
  
       
         
         
        
        
        
        
        
        
        
        
        
        
        
        
    
    

