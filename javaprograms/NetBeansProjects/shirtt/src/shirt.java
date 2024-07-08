/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JRV
 */
public class shirt {
    
      public int shirtID=0;
     public String shirtSize="Size Required";
     public char colorCode = 'U';
     public String shirtDescription="description required";
     public int qty=0;
     public double unitPrice = 0.0;
     public double amount=qty*unitPrice;
     public double totalPrice=amount;
     shirt(){
        this.shirtID=shirtID;
        this.shirtSize=shirtSize;
        this.colorCode=colorCode;
        this.qty=qty;
        this.shirtDescription=shirtDescription;
        this.unitPrice=unitPrice;
        this.amount=amount;
        this.totalPrice=totalPrice;
     }
     
     public void shirtOrder(int shirtid,String shirtsize,char cc,String desc,int qqty,double up){
         
         shirtID=shirtid;
         shirtSize=shirtsize;
         colorCode=cc;
         shirtDescription=desc;
         qty=qqty;
         unitPrice=up;
         
     }
     
     public void displayshirtInfo(){
         
     System.out.println("Shirt ID: "+ shirtID);
     System.out.println("Shirt Size: "+ shirtSize);
     System.out.println("Shirt Description: "+ shirtDescription);
     System.out.println("Color Code: "+ colorCode);
     System.out.println("Qty.: "+ qty);
     System.out.println("Unit Price: P" + unitPrice);
     System.out.println("Amount: P"+ amount);
   
     
     }
}
