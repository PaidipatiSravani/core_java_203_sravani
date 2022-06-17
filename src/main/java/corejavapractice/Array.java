package corejavapractice;
/**
 * arrays declaration,initializaton.
 * how to copiy elements of one array to another..
 * how to convert arrays to string.
 */

import java.util.Arrays;

public class Array {

	/*static int[] get(){  
		return new int[]{10,30,50,90,60};  
		}  
		  
		public static void main(String args[]){  
		//calling method which returns an array  
		int arr[]=get();  
		//printing the values of an array  
		for(int i=0;i<arr.length;i++)  
		System.out.println(arr[i]);  
		}  
*/public static void main(String args[]){ 
	    
	 int [] source = {1, 2, 3, 4, 5, 6};
     int [] destination = new int[6];
     int j;

     // iterate and copy elements from source to destination
     for (int i = 0; i < source.length; ++i) {
         destination[i] = source[i];
     }
   
      // converting array to string
     //System.out.println(Arrays.toString(destination));
	
	for(j=0;j<destination.length;j++)
	{
		System.out.print(destination[j]);
	}
	
}
	}


