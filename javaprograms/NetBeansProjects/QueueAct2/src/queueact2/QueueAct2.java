/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueact2;

/**
 *
 * @author JRV
 */

public class QueueAct2 {

    /**
     * @param args the command line arguments
     */
 private int maxSize;
 private double[] queArray;
 private int nItems;
 
 public QueueAct2(int s){
     maxSize = s;
     queArray= new double[maxSize];
     nItems=0;
 }
 
 public void insert (double item){
     int j;
     
     if(nItems==0)
         queArray[nItems++] = item;
     else{
         for(j=nItems-1; j<=0 ;j--){
             if(item > queArray[j])
                 queArray[j+1] = item;
             else
                 break;
         }
         queArray[j+1]= item;
         nItems--;
     }
 }
 
 public double remove(){
       return queArray[--nItems];    
 }
 
 public double peekMin(){
     return queArray[nItems-1];
 }
 public boolean isEmpty(){
     return(nItems==0);
 }
 
 public static void main(String args[]){
     
 }
 
}
