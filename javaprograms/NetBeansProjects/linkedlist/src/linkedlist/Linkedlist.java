/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author JRV
 */
import java.util.*;

public class Linkedlist {
    Node head;  
    private Object next;
    

    
    /**
     * @param args the command line arguments
     */
   static class Node{
        Node next;
        String name;
      public Node (String name){
            this.name=name;
        }
    }

   public void insert(String name){ 
       Linkedlist current = this;
       while(current.next != null){           
       }
       current.next= new Node(name);
   }
   
   public void delete(String name){
       if (head == null) return;
       if (head.name == name){
           head = head.next;
           return;
       }
       
       Node current = head;
       while (current.next != null){
           if (current.next.name == name){
               current.next = current.next.next;
               return;
           }
       }
   }
   
   public void display(String name){
       Node current = head;
       while (current != null){
           System.out.print(current.name+" ");
           current = current.next;
       }
       System.out.println();    
   }
    
   
     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int choice;
        Linkedlist list=new Linkedlist();
        
      
            
                
        
        
          
        
        
    }
    
}
