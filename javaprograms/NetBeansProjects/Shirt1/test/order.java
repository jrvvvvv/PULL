


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
        
     /*
        transDate;
        name; address; shirtID; size; colorCode; description;
        qty; unitPrice; cExDate/ cardNo,
        Compute for:
        amount (unitPrice*qty) ;
        totalPrice(Samount);
        *Payment
        */
   
        
     public String transDate="Date Required";
     public String customerName="Name Required";
     public String customerAddress="Address Required";
     
    
    //shirt3
     public int shirtID=0;
     public String shirtSize="Size Required";
     public char colorCode = 'U';
     public String shirtDescription="description required";
     public int qty=0;
     public double unitPrice = 0.0;
     public double amount=qty*unitPrice;
     
     //shirt2
       
     public int shirtID2=0;
     public String shirtSize2="Size Required";
     public char colorCode2 = 'U';
     public String shirtDescription2="description required";
     public int qty2=0;
     public double unitPrice2 = 0.0;
     public double amount2=qty2*unitPrice2;
     
     
       //shirt3
     public int shirtID3=0;
     public String shirtSize3="Size Required";
     public char colorCode3 = 'U';
     public String shirtDescription3="description required";
     public int qty3=0;
     public double unitPrice3 = 0.0;
     public double amount3=qty3*unitPrice3;
     
     public double totalPrice;

     
     public String cExDate="Depends on Mode of Payment";
     public String cardNo="Depends on Mode of Payment";
     public String modeofPayment="Mode of Payment Required";

 
    
    
   void shirtOrder(int id,String size,String desc,char cc ,int qqty,double price){
        
      this.shirtID=id;
        this.shirtSize=size;
       this.colorCode=cc;
       this.shirtDescription=desc;
        this.qty=qqty;  
        this.unitPrice=price;
       this.amount=qty*unitPrice;
       
        //double amo=qty*unitPrice;
      // totalPrice=amo;
       double totalPrice1=totalPrice+amount; 
         
    }
   
    void shirtOrder2(int id,String size,String desc,char cc ,int qqty,double price){
        
      this.shirtID2=id;
        this.shirtSize2=size;
       this.colorCode2=cc;
       this.shirtDescription2=desc;
        this.qty2=qqty;  
        this.unitPrice2=price;
       this.amount2=qty2*unitPrice2;
       
        //double amo=qty*unitPrice;
      // totalPrice=amo;
           
        double totalPrice2=totalPrice+amount; 
              
         
    }
    
     void shirtOrder3(int id,String size,String desc,char cc ,int qqty,double price){
        
      this.shirtID3=id;
        this.shirtSize3=size;
       this.colorCode3=cc;
       this.shirtDescription3=desc;
        this.qty3=qqty;  
        this.unitPrice3=price;
       this.amount3=qty3*unitPrice3;
       
        //double amo=qty*unitPrice;
      // totalPrice=amo;
         
              double totalPrice3=totalPrice+amount; 
    }
   
   
    
   
      
      
     
      public void customerInfo(String date,String name,String cusAdd){
         
         transDate=date;
         customerName=name;
         customerAddress=cusAdd;
         
         
         
     }
      
      
       
       
     
      
     public void paymentOption(String cexDate,String cardn,String modpay){
         cExDate=cexDate;
         cardNo=cardn;
         modeofPayment=modpay;
         
         if(modeofPayment.equalsIgnoreCase("check")){
             cardNo="Depends on Mode of Payment";
         }
         else if (modeofPayment.equalsIgnoreCase("card")){
             cExDate="Depends on Mode of Payment";
         }
         
     }
     
       
  
    
   
       
  
    
  public void displayorderInfo(){
     System.out.println("Name: "+customerName+" Date:"+transDate);
     System.out.println("Address: "+customerAddress);
     System.out.println("");
     System.out.println("");
     
     //shirt1
     System.out.println("Shirt ID: "+ shirtID);
     System.out.println("Shirt Size: "+ shirtSize);
     System.out.println("Shirt Description: "+ shirtDescription);
     System.out.println("Color Code: "+ colorCode);
     System.out.println("Qty.: "+ qty);
     System.out.println("Unit Price: P" + unitPrice);
     System.out.println("Amount: P"+ amount);
     
     //shirt2
      System.out.println("");
      System.out.println("Shirt ID: "+ shirtID2);
     System.out.println("Shirt Size: "+ shirtSize2);
     System.out.println("Shirt Description: "+ shirtDescription2);
     System.out.println("Color Code: "+ colorCode2);
     System.out.println("Qty.: "+ qty2);
     System.out.println("Unit Price: P" + unitPrice2);
     System.out.println("Amount: P"+ amount2);
     
     //shirt3
      System.out.println("");
      System.out.println("Shirt ID: "+ shirtID3);
     System.out.println("Shirt Size: "+ shirtSize3);
     System.out.println("Shirt Description: "+ shirtDescription3);
     System.out.println("Color Code: "+ colorCode3);
     System.out.println("Qty.: "+ qty3);
     System.out.println("Unit Price: P" + unitPrice3);
     System.out.println("Amount: P"+ amount3);
     
      System.out.println("");
     System.out.println("           Total Price: P"+ totalPrice);
     
     System.out.println("");
     System.out.println("");
     
     System.out.println("Mode of Payment: "+ modeofPayment);
     System.out.println("Card No.: "+ cardNo);
     System.out.println("CExDate: "+ cExDate);
  }
     
     
}
     
   

