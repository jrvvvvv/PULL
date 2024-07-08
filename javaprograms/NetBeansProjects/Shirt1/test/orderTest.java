/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JRV
 */
public class orderTest {
    public static void main(String[]args){
        order customer1=new order();
        order customer2=new order();
        order customer3=new order();
        order customer4=new order();
        order customer5=new order();
        
        
        /*
       ("Name: "+ name + " Date: "+transDate);
       ("Address: "+ address);
        ("     Shirt ID     "+"Size     "+"Shirt Description     "+"Color Code     "+"Qty.     "+"Unit Price     ");
      ("                                                                                      Total Price: "+totalPrice);
       ("");
       ("Mode of Payment: "+ modeofPayment);
        ("Credit Card No.: "+cardNo);
      ("Check Expiry Date: "+ cExDate);
        */
       
        customer1.customerInfo("3/19/2021", "Berto Batumbakal", "Bakal St., Lot 4, Iron City");
        customer1.shirtOrder(69420,"M", "Soft and Heaven-like cloth", 'R', 3, 690);
        customer1.shirtOrder2(66666, "L", "Reggae", 'W' , 5, 420);
        customer1.shirtOrder3( 55555, "P", "Pink Swear", 'P', 3, 555);
        customer1.paymentOption("4/20/2021" ,"", "Check");    
        
        customer2.customerInfo("2/24/2021", "Pedro Penduko", "Rizal St.,Nonoy Ave.,Iloilo City");
        customer2.shirtOrder(69420,"M", "Soft and Heaven-like cloth", 'R', 2, 690);
        customer2.shirtOrder2(66666, "L", "Reggae", 'W' , 2, 420);
        customer2.shirtOrder3(69696, "S", "Bright as the silver skyline", 'S', 4, 300);
        customer2.paymentOption("" ,"3156 4565 4648 6485", "Card");    
        
        customer3.customerInfo("1/1/2021", "Warren Bertugo", "Brgy. Sta Ana, Taytay Rizal");
        customer3.shirtOrder(69420,"M", "Soft and Heaven-like cloth", 'R', 3, 690);
        customer3.shirtOrder2(69966, "S", "Black Beauty", 'B', 3, 360);
        customer3.shirtOrder3(69696, "S", "Bright as the silver skyline", 'S', 3, 300);
        customer3.paymentOption("" ,"5555 6666 8888 4444", "Card");    
        
        customer4.customerInfo("12/25/2020", "LLKD Clothing Inc", "Brgy. Tagpos, Binangonan Rizal");
        customer4.shirtOrder(69696, "S", "Bright as the silver skyline", 'S', 2, 300);
        customer4.shirtOrder2(66666, "L", "Reggae", 'W' , 3, 420);
        customer4.shirtOrder3(55555, "S", "Pink Swear", 'P', 2, 555);
        customer4.paymentOption("1/15/2021" ,"", "Check");    
        
        customer5.customerInfo("2/14/2021", "Pepe Makalubot", "Pasig City");
        customer5.shirtOrder(69420,"M", "Soft and Heaven-like cloth", 'R', 2, 690);
        customer5.shirtOrder2(69966, "S", "Black Beauty", 'B', 2, 360);
        customer5.shirtOrder3(55555, "S", "Pink Swear", 'P', 2, 555);
        customer5.paymentOption("" ,"0648 7777 9954 1245", "Card");    
        
        
        
        customer1.displayorderInfo();
        System.out.println("");
        customer2.displayorderInfo();
        System.out.println("");
        customer3.displayorderInfo();
        System.out.println("");
        customer4.displayorderInfo();
        System.out.println("");
        customer5.displayorderInfo();
        
    }
}
