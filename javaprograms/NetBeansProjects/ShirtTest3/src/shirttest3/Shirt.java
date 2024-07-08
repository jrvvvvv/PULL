/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shirttest3;

/**
 *
 * @author JRV
 */
 public class Shirt{
        public int shirtID=0;
        public String description="description required";
        public char colorCode = 'U';
        public double price = 0.0;
        public String status = "Available/Unavailable";
        
       
           
            
        public void displayShirtInformation(){   
        System.out.println("Shirt ID            :"+ shirtID);
        System.out.println("Shirt Description   :"+ description);
        System.out.println("Color Code          :"+ colorCode);
        System.out.println("Shirt Price         :"+ price);
        System.out.println("Status              :"+ status);
        
}
       


public class ShirtTest{
      
    /**
     *
     * @param args
     */
       
    public static void main(String[] args) {
        // TODO code application logic here
        
        Shirt firstShirt=new Shirt();
        
        firstShirt.shirtID= 669420;
        firstShirt.displayShirtInformation();
    }
    
       
}
 }
