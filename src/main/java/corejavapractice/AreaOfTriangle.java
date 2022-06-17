package corejavapractice;

/**
 * to print area of triangle using method.
 * to print area of triangle using constructor.
 */

import java.util.Scanner;

public class AreaOfTriangle {
	
	                                //--using constructor--
	double area;
	AreaOfTriangle(double b,double h){
		
		area=(b*h)/2;
	}
	
	

	public static void main(String[] args) {
		double breadth,height;
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter breadth:");
		breadth=s.nextDouble();
		
		System.out.println("enter height");
		height=s.nextDouble();
		
		AreaOfTriangle obj=new AreaOfTriangle(breadth,height);
		
		//double result=area(breadth,height);        //using method
		
		double result=obj.area;                      //using constructor
		
		System.out.println("area of triangle:"+result);

	}
	
	                                      //--using method--
	
	/*static double area(double b,double h) {
		
		double area=(b*h)/2;
		return area;
	}*/

}
