/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labrec_villanueva;

/**
 *
 * @author JRV
 */

import java.util.*;

public class LabRec_Villanueva {

    /**
     * @param args the command line arguments
     */
    
    Node head;
    Scanner input= new Scanner(System.in);
    int j;
    String newnode,srch;
    
    
     public static class Node{
         String data;
         Node next;
         
         Node(String d){
             data=d;
             next=null;
         }
     }
     
     public void display(){
         Node n = head;
         System.out.println("Employees List: ");
         while (n != null){       
             System.out.println(n.data+" ");
             n = n.next;
         }
         System.out.println();
     }
     
     public void insert(){
         Node n = head;
         while(n.next != null){
             n = n.next;
         }
         System.out.println("Please input a new Employee");
         newnode=input.nextLine();
         System.out.println(newnode +" has been added to the list");
         n.next = new Node(newnode);
         
     }
     
     public void delete(){
         Node n = head;
         if (n == null)
             return;    
           
            Node sec = head;
            head = head.next;
            
         System.out.println( n. data + " has been deleted" );
             }
         
     
     int countnodes(){
         Node n=head;
         int i=0;
         while (n != null){
             i++;
             n=n.next;
         }
         return i;
     }
     
   public void search(){
         Node n = head;
         int i=1;
         System.out.println("Please input the data what you are searching for?");
         srch=input.nextLine();
         boolean flag=false;       
         while( n != null){
             if(n.data == n.data){
                 flag = true;
                 break;
             }
             i++;
             n=n.next;
         }
         if (flag){
             System.out.println("Found "+ srch);}
         else{
             System.out.println("Cannot be found "+ srch);}
         
   }
         
     
      
    public static void main(String[] args) {
        // TODO code application logic here
        LabRec_Villanueva list = new LabRec_Villanueva();
        int choice;
        Scanner in=new Scanner(System.in);
        
        list.head= new Node ("Berto Batumbakal");
        Node A002 = new Node ("Perdo Penduko");
        Node A003 = new Node ("Arturo Bhorkwat");
        Node A004 = new Node ("Jake Cuenca");
        Node A005 = new Node ("Rodrigo Rod");
        Node A006 = new Node ("Jake Cyrus");
        Node A007 = new Node ("Lebron Jordan");
        Node A008 = new Node ("Henry Foo");
        Node A009 = new Node ("Lily Pikachu");
        Node A010 = new Node ("John Jhon");
        
        
        list.head.next=A002;
        A002.next=A003;
        A003.next=A004;
        A004.next=A005;
        A005.next=A006;
        A006.next=A007;
        A007.next=A008;
        A008.next=A009;
        A009.next=A010;
        
        do{
        System.out.println("Menu");
        System.out.println("(1)Insert");
        System.out.println("(2)Delete");
        System.out.println("(3)Display");
        System.out.println("(4)Search");
        System.out.println("(c)cancel");
        
        choice=in.nextInt();

         
        switch(choice){
            case 1:
               list.insert();
               break;
            case 2:
               list.delete();
               break;
            case 3:
               list.display();
               break;
            case 4:
               list.search();   
        }
        }
        while(true);
    }
    
}
