package corejavapractice;

/**
 * to check whether the number is armstrong or not using while loop.
 * to check whether the number is armstrong or not using for loop.
 */

import java.util.Scanner;

public class ArmstrongNumberSample {

	public static void main(String[] args) {
		
		int number,temp,rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		number=sc.nextInt();
		
		temp=number;
		
		                                     //using while loop
		
//		while(number!=0) {
//			rem=number%10;
//			sum=sum+rem*rem*rem;
//			number=number/10;
//		}
		
		                                 //using for loop
		
		for(;number!=0;)
		{
			rem=number%10;
			sum=sum+rem*rem*rem;
			number=number/10;
		}
		if(temp==sum) {
			System.out.println("armstrong number");
		}
		else
			System.out.println("not  an armstrong number");

	}

}
