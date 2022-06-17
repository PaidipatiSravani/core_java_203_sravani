package flowcontrols;

import java.util.Scanner;

/**
 * 
 * @author sp22082 using switch
 */

public class SwitchSample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*
		 *                  // using number as a choice
		 * 
		 * System.out.println("enter a number"); int number = s.nextInt();
		 * 
		 * switch (number) { case 1: System.out.println("sunday"); break; case 2:
		 * System.out.println("monday"); break; case 3: System.out.println("tuesday");
		 * break; case 4: System.out.println("wednesday"); break; case 5:
		 * System.out.println("thursday"); break; case 6: System.out.println("friday");
		 * break; case 7: System.out.println("saturday"); break; default:
		 * System.out.println("enter the range between 1-7"); }
		 */

		/*
		 *                   // using character as a choice
		 * 
		 * System.out.println("enter the character"); char ch = s.next().charAt(0);
		 * 
		 * switch (ch) { case 'a': System.out.println("A"); break; case 'b':
		 * System.out.println("B"); break; case 'c': System.out.println("C"); break;
		 * default: System.out.println("enter the valid character"); }
		 */

		                       // using string as a choice

		System.out.println("enter the string");
		String str = s.next();

		System.out.println("enter the first number");
		int firstnum = s.nextInt();

		System.out.println("enter the second number");
		int secondnum = s.nextInt();

		switch (str) {

		case "add":
			System.out.println("addition of 2 numbers:" + (firstnum + secondnum));
			break;
		case "sub":
			System.out.println("subtraction of 2 numbers:" + (firstnum - secondnum));
			break;
		case "mul":
			System.out.println("multiplication of 2 numbers:" + (firstnum * secondnum));
			break;
		case "div":
			System.out.println("division of 2 numbers:" + (firstnum / secondnum));
			break;
		case "mod":
			System.out.println("remainder of 2 numbers:" + (firstnum % secondnum));
			break;
	    default:System.out.println("enter the valid string");
		}

	}

}
