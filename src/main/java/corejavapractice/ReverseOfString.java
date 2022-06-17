package corejavapractice;

/**
 * print reverse of the given string using for loop.
 * print reverse of the given string using while loop.
 * print reverse of the given string using arrays..
 */

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		name=s.next();
		
		                                        //using for loop 
		
		for(int i=(name.length());i>0;i--) {
			System.out.print(name.charAt(i-1));
		}
        System.out.println();
		                                        //using while loop
		System.out.println("--------------------------");
		int j=name.length();
		while(j>0) {
			System.out.print(name.charAt(j-1));
			j--;
		}
		System.out.println();
		                                      //using array
		System.out.println("---------------------------");
		char [] array=name.toCharArray();
		for(int i=(array.length-1);i>=0;i--) {
			System.out.print(array[i]);
		}
		
	}

}
