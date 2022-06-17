package corejavapractice;

/**
 * to print area of circle using both scanner inputs.
 * to print area of circle using parameterized construcor.
 * 
 */

import java.util.Scanner;

public class AreaOfCircle {
	double area;
	
	AreaOfCircle(double r){            //parameterized constructor of class AreaOfCircle.
		
		 area=(22*r*r)/7;
	}

	public static void main(String[] args) {
		//final double pi=22/7;
		double radius;
		Scanner s=new Scanner(System.in);
		radius=s.nextDouble();
	/*	area=(22*radius*radius)/7;
		System.out.println("area of the circle:"+area);      //using scanner inputs   */
		
		
		                           //using constructor
		
		AreaOfCircle obj=new AreaOfCircle(radius);
		System.out.println(obj.area);

	}

}
