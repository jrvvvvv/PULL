/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructresorting;

/**
 *
 * @author JRV
 */
public class DataStructreSorting {

    /**
     * @param args the command line arguments
     */
    static void bubbleAct2(String arr[]){
     int n= arr.length;
     
     for(int i=0; i < n-1; i++){
         for(int j=0; j < n-i-1; j++){
             if (arr[j] > arr[j+1])
             {
                 String temp = arr[j];
                 arr[j]= arr[j+1];
                 arr[j+1]= temp;
                 
                 printArray(arr);
                 System.out.println();
             }
         }
     }
    }
    
    static void selectionAct2(String arr[]){
        int n= arr.length;
     
     for(int i=0; i < n-1; i++){
         int min_idx= i;
         for (int j = i+1; j < n ; j++)
             if(arr[j] < arr[min_idx])
                 min_idx = j;
         
         String temp=arr[min_idx];
         arr[min_idx]= arr[i];
                 arr[i]= temp;
                 
         printArray(arr);
         System.out.println();
     }
    }
    
    static void insertionAct2(String arr[]){
         int n= arr.length;
     
     for(int i=0; i < n-1; i++){
         String key=arr[i];
         int j= i - 1;
         
         while(j >= 0 && arr[j] > key){
             arr[j + 1]= arr[j];
             j = j-1;
         }
         arr[j+1]=key;
         
          printArray(arr);
         System.out.println();
     }
    }
    
    static void printArray(String arr[])
    {
        int n = arr.length;
        for(int i=0; i<n ; ++i)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}
