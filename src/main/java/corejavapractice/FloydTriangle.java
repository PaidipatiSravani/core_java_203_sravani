package corejavapractice;

/**
 * to floyd triangle
 * 1  
   2 3  
   4 5 6  
   7 8 9 10  
   11 12 13 14 15  
   16 17 18 19 20 21  

 */

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		int num,i,j,k=1;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for(i=1;i<=num;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println(" ");
		}

	}

}
