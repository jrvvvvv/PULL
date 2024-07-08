public class customer{
        public int customerID=0;
        public String name="Name required";
        public String address="Address required";
        public String phoneNumber="Phone Number required";
        public String emailAddress="Email required";
        public String customerStatus = "Status";
        
        /* 
        customerID;
        name;
        address;
        phoneNumber;
        emailAddress;
        customerStatus;
        */
       
           
            
        public void displayCustomerInfo(){   
        System.out.println("Customer ID         :"+ customerID);
        System.out.println("Name                :"+ name);
        System.out.println("Adress              :"+ address);
        System.out.println("Phone Number        :"+ phoneNumber);
        System.out.println("Email Address       :"+ emailAddress);
        System.out.println("Status              :"+ customerStatus);
    }
}