package corejavapractice;

/**
 * calculate whether the given year is leap year or not
 */

import java.util.Scanner;

public class LeapYearSample {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		year = sc.nextInt();
		if (year != 0) {
			if (year % 400 == 0) {
				System.out.println(year + "is a leap year");
			} else if (year % 100 != 0) {
				if (year % 4 == 0) {
					System.out.println(year + "is a leap year");
				} else
					System.out.println(year + "not a leap year");
			}

			else
				System.out.println(year + "is not a leap year");
		} else {
			System.out.println("enter the valid year");

		}

	}
}