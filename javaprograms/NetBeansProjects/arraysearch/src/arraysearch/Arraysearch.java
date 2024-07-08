/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysearch;

/**
 *
 * @author JRV
 */
import static java.nio.file.Files.delete;
import java.util.*;
public class Arraysearch {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[]arr;
	arr = new int[] {11,22,33,44,55,66,77,88,99,00};
	int nItems = 0;
	int j;
	int searchId;
	nItems = 10;
      Scanner input = new Scanner(System.in);

	for (j=0; j<nItems; j++)
		System.out.print(arr[j]+ " ");
		System.out.println(" ");

		System.out.print("Enter a number:" + " ");
		searchId = input.nextInt();

	for (j=0; j<nItems; j++)
 		if (arr[j] == searchId)
 			break;
        
        
 		if(j==nItems){
 			System.out.println("Cannot be found" + " " + searchId);
                        System.out.println(Arrays.toString(arr));
                      
                }
                else{
 			System.out.println("Found" + " " + searchId);
                        for (j=0; j<nItems; j++)
                            if(arr[j] != searchId ){
                                System.out.print(arr[j]+" ");
                            }
                }
                            System.out.println(" ");
                        
                        
                 
    }
    
}
