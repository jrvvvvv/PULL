/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JRV
 */
public class Payment {
   // public String transDate="Transaction Date Required";
    public String modeofPayment="Mode of Payment Required";
   // public int customerID=0;
   // public String name="Name Required";
    public String cExDate="Depends on Mode of Payment";
    public String cardNo="Depends on Mode of Payment";
   // public int totalPrice=0;
    
    
    public void displayPaymentInfo(){
    //  System.out.println("Transaction Date: "+ transDate);
      System.out.println("Mode of Payment: "+ modeofPayment);
    //  System.out.println("Customer ID: "+ customerID);
      //System.out.println("Name: " + name);
      System.out.println("Card No.: "+ cardNo);
      System.out.println("CExDate: "+ cExDate);
      //System.out.println("Total Price: P"+ totalPrice);
    }
}
