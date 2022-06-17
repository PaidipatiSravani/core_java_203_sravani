package flowcontrols;

import java.util.Scanner;

/**
 * 
 * @author sp22082
 *to check the grade based on the given percentage using if_else-is_else condition.
 */

public class IfElseifElseSample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the percentage");
		double percent=s.nextDouble();
       
		if(percent>=80) {
			System.out.println("first class");
		}
		else if(percent<=80&&percent>=65) {
			System.out.println("second class");
		}
		else
		{
			System.out.println("third class");
		}
		s.close();
	}
	

}
