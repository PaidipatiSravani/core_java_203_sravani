package corejavapractice;

/**
 * print sum of the digits of the given number.Ex:number =123     o/p:1+2+3=6.
 */

import java.util.Scanner;

public class SumOfDigitsSample {

	public static void main(String[] args) {
		int number,temp,rem,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		number=s.nextInt();
		
			
		while(number!=0) {
			rem=number%10;
			sum=sum+rem;
			number=number/10;
		}
        System.out.println("sum of the digits of the given number"+sum);

	}

}
