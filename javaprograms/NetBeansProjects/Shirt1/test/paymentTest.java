/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JRV
 */
public class paymentTest {
    public static void main (String[]args){
    Payment payment1=new Payment();
    Payment payment2=new Payment();
    Payment payment3=new Payment();
    Payment payment4=new Payment();
    Payment payment5=new Payment();
    
    /*  public String transDate="";
    public String modeofPayment="";
    public int customerID=0;
    public String name="";
    public String cExDate="";
    public int cardNo=0;
    public int totalPrice=0;
   */ 
    
    //payment1.transDate="3/19/2021";
    payment1.modeofPayment="Check";
   // payment1.customerID=66666;
   // payment1.name="Berto Batumbakal";
    payment1.cExDate=""; //di ko po to alam na term kaya blank po muna
    payment1.cardNo="Check";
    //payment1.totalPrice=12466; //sample
    
  //  payment2.transDate="2/24/2021";
    payment2.modeofPayment="Card";
  //  payment2.customerID=69696;
  //  payment2.name="Pedro Penduko";
    payment2.cExDate=""; //di ko po to alam na term kaya blank po muna
    payment2.cardNo="3156 4565 4648 6485";
   // payment2.totalPrice=15000; //sample 
    
   // payment3.transDate="1/1/2021";
    payment3.modeofPayment="Card";
    //payment3.customerID=65482;
    //name="Warren Bertugo";
    payment3.cExDate=""; //di ko po to alam na term kaya blank po muna
    payment3.cardNo="5555 6666 8888 4444";
   // payment3.totalPrice=8000; //sample
    
 //   payment4.transDate="12/25/2020";
    payment4.modeofPayment="Check";
  //  payment4.customerID=06154;
   // payment4.name="LLKD Clothing Inc";
    payment4.cExDate=""; //di ko po to alam na term kaya blank po muna 
    payment4.cardNo="Check";
    //payment4.totalPrice=20000; //sample
    
   // payment5.transDate="2/14/2021";
    payment5.modeofPayment="Card";
  //  payment5.customerID=98475;
   // payment5.name="Pepe Makalubot";
    payment5.cExDate=""; //di ko po to alam na term kaya blank po muna
    payment5.cardNo="0648 7777 9954 1245";
    //payment5.totalPrice=5645; //sample
    
    payment1.displayPaymentInfo();
    System.out.println("");
     payment2.displayPaymentInfo();
    System.out.println("");
     payment3.displayPaymentInfo();
    System.out.println("");
     payment4.displayPaymentInfo();
    System.out.println("");
     payment5.displayPaymentInfo();
    
    
    
            }
}
