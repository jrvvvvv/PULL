import java.util.*;


public class customerTest{
    public static void main(String[]args){
        customer customer1=new customer();
        customer customer2=new customer();
        customer customer3=new customer();
        customer customer4=new customer();
        customer customer5=new customer();
        
       customer1.customerID=66666;
       customer1.name="Berto Batumbakal";
       customer1.address="Bakal St., Lot 4, Iron City";
       customer1.phoneNumber="09959598899";
       customer1.emailAddress="batumbakalberto@gmail.com";
       customer1.customerStatus="Married";
       
       customer2.customerID=69696;
       customer2.name="Pedro Penduko";
       customer2.address="Rizal St.,Nonoy Ave.,Iloilo City";
       customer2.phoneNumber="09457836009";
       customer2.emailAddress="angtagapagligtas@yahoo.com";
       customer2.customerStatus="Single";
       
       customer3.customerID=65482;
       customer3.name="Warren Bertugo";
       customer3.address="Brgy. Sta Ana, Taytay Rizal";
       customer3.phoneNumber="09456781358";
       customer3.emailAddress="warrenBERT@ymail.com.ph";
       customer3.customerStatus="Single";
       
       customer4.customerID=06154;
       customer4.name="LLKD Clothing Inc";
       customer4.address="Brgy. Tagpos, Binangonan Rizal";
       customer4.phoneNumber="0688-455-455";
       customer4.emailAddress="LLKDClothing@gmail.ph";
       customer4.customerStatus="Single";
       
       customer5.customerID=98475;
       customer5.name="Pepe Makalubot";
       customer5.address="Pasig City";
       customer5.phoneNumber="09125487689";
       customer5.emailAddress="makalubotepep@yahoo.com";
       customer5.customerStatus="Married";
       
        
       customer1.displayCustomerInfo();
       System.out.println("");
       customer2.displayCustomerInfo();
       System.out.println("");
       customer3.displayCustomerInfo();
       System.out.println("");
       customer4.displayCustomerInfo();
       System.out.println("");
       customer5.displayCustomerInfo();
     
       
        
    }
}