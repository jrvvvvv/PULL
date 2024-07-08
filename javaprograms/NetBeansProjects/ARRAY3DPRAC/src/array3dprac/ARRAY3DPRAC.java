/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3dprac;

/**
 *
 * @author JRV
 */
public class ARRAY3DPRAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][] arr={
            {{1,2,3},
              {4,5,6}
            },
            
            {
            {11,22,33,44}, 
            {55,66,77,88}   
              
            },
            
            {{7,8,9,99},
             {81,71,41,31}   
            }
            
            };
    
              for (int i=0;i < 3 ; i++)
                 for(int j=0;j < 2; j++)
                     for(int k=0; k < 3 ;k++)
              
              System.out.println("arr[" + i + "]["+ j +"]["+ k + "]=" + arr[i][j][k]);
              System.out.println("");  
              System.out.println("arr[0][0][2]=" + arr[0][0][2]);
              System.out.println("arr[0][1][0]=" + arr[0][1][0]);
              System.out.println("arr[1][0][1]=" + arr[1][0][1]);
              System.out.println("arr[1][1][3]=" + arr[1][1][3]);
              System.out.println("arr[2][0][0]=" + arr[2][0][0]);
              System.out.println("arr[2][1][2]=" + arr[2][1][2]);
             
}
}
