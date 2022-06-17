package corejavapractice;

/**
 * how to print reverse of a number and check whether the number is palindrome or not
 * (palindrome means the reversed number is equal to the actual number.Ex:121,333..........)
 */

import java.util.Scanner;

public class PalindromeSample {

	public static void main(String[] args) {
		int number,temp,rem,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		number=s.nextInt();
		
		temp=number;
		
		while(number!=0) {
			rem=number%10;
			sum=sum*10+rem;
			number=number/10;
		}
		
		                               //to print the reversed number
        
		System.out.println("the reversed number:"+sum);             
		
		
		                                //to check whether the number is palindrome or not
		
		if(temp==sum) {
			System.out.println(temp+"is a pallindrome");
		}
		else
			System.out.println(temp+"is not a palindrome");
	}

}
