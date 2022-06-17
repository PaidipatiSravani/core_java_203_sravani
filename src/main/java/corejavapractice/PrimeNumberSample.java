package corejavapractice;

/**
 * check whether the given number is prime or not using for loop
 */

import java.util.Scanner;

public class PrimeNumberSample {

	public static void main(String[] args) {
		int number, count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		number = s.nextInt();
		if ((number == 0) || (number == 1)) {
			System.out.println(number + "is not a prime number");
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if(count>1) {
			System.out.println(number+"is not a prime number");
		}
		else
			System.out.println(number+"is a prime number");
	}

}
