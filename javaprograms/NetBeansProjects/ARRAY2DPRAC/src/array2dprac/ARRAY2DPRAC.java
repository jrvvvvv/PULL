/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2dprac;

/**
 *
 * @author JRV
 */
public class ARRAY2DPRAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] arr= { 
        {1,2},
        {3,4},
        {5,6},
        {7,8}
    };
        for (int i=0;i < 4 ; i++)
              for(int j=0;j < 2; j++)
              
              System.out.println("arr[" + i + "]["+ j +"]=" + arr[i][j]);
              System.out.println("");  
              System.out.println("arr[0][1]" + arr[0][1]);
              System.out.println("arr[1][0]=" + arr[1][0]);
              System.out.println("arr[2][0]=" + arr[2][0]);
              System.out.println("arr[3][1]=" + arr[3][1]);
        
              
    
    }
    
}
