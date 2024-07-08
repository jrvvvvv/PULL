


public class ShirtTest{
    
     public static void main(String[]args){
        Shirt firstShirt=new Shirt();
        Shirt secondShirt=new Shirt();
        Shirt thirdShirt=new Shirt();
        Shirt fourthShirt=new Shirt();
        Shirt fifthShirt=new Shirt();
        
        //first shirt
        firstShirt.shirtID=69420;
        firstShirt.description="Soft and Heaven-like cloth";
        firstShirt.colorCode='R';
        firstShirt.price=690;
        firstShirt.status="Available";
     
        //second shirt
        secondShirt.shirtID=69966;
        secondShirt.description="Black Beauty";
        secondShirt.colorCode='B';
        secondShirt.price=360;
        secondShirt.status="Unavailable";
        
        //third shirt
        thirdShirt.shirtID=66666;
        thirdShirt.description="Reggae";
        thirdShirt.colorCode='W';
        thirdShirt.price=420;
        thirdShirt.status="Available";
        
        //fourth shirt
         fourthShirt.shirtID=69696;
        fourthShirt.description="Bright as the silver skyline";
        fourthShirt.colorCode='S';
        fourthShirt.price=300;
        fourthShirt.status="Available";
        
        //fifth shirt
        fifthShirt.shirtID=55555;
        fifthShirt.description="Pink Swear";
        fifthShirt.colorCode='P';
        fifthShirt.price=555;
        fifthShirt.status="Unavailable";
        
        
        
        
        firstShirt.displayShirtInformation();
        System.out.println();
        secondShirt.displayShirtInformation();
        System.out.println();
        thirdShirt.displayShirtInformation();
        System.out.println();
        fourthShirt.displayShirtInformation();
        System.out.println();
        fifthShirt.displayShirtInformation();
     }
}