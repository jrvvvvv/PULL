/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JRV
 */
public class order {
    
    public String transDate="Date Required";
     public String customerName="Name Required";
     public String customerAddress="Address Required";
     
    
    
     public int shirtID=0;
     public String shirtSize="Size Required";
     public char colorCode = 'U';
     public String shirtDescription="description required";
     public int qty=0;
     public double unitPrice = 0.0;
     public double amount=qty*unitPrice;
     public double totalPrice=amount;
     
     
     
     public String cExDate="Depends on Mode of Payment";
     public String cardNo="Depends on Mode of Payment";
     public String modeofPayment="Mode of Payment Required";
     
     
      public void displayorderInfo(){
     System.out.println("Name: "+customerName+" Date:"+transDate);
     System.out.println("Address: "+customerAddress);
     System.out.println("Mode of Payment: "+ modeofPayment);
     System.out.println("Card No.: "+ cardNo);
     System.out.println("CExDate: "+ cExDate);
  }
}
