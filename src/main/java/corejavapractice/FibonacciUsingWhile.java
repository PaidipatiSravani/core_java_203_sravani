package corejavapractice;

/**
 * print fibonacci series in the given range using while loop.
 */

import java.util.Scanner;

public class FibonacciUsingWhile {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,i,range;
		Scanner s=new Scanner(System.in);
		range=s.nextInt();
		System.out.println(n1+" "+n2);
		i=2;
		while(i<=range) {
			 n3=n1+n2;
			 System.out.println(n3+" ");
			 n1=n2;
			 n2=n3;
			 i++;
		}
        
	}

}
