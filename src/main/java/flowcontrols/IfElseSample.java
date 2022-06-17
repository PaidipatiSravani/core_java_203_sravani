package flowcontrols;

import java.util.Scanner;

/**
 * 
 * @author sp22082
 * to check whether the given number is positive or no using if-else condition.
 */

public class IfElseSample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int number=s.nextInt();
		if(number>0) {
			System.out.println("it is a positive number");
		}
		else
		{
			System.out.println("it is a negitive number");
		}
   s.close();
	}

}
