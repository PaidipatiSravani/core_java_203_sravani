package corejavapractice;

/**
 * how to calculate area of equilateral triangle.
 */

import java.util.Scanner;

public class Equilater {

	public static void main(String[] args) {
		double side,area;
		Scanner s=new Scanner(System.in);
		side=s.nextDouble();
		area=(Math.sqrt(3)/4)*(side*side);
        System.out.println("area of equilateral triangle:"+area);
	}

}
  



                           //--CONCLUSION--
 
  //formula for equilateral triangle is √3 a2/ 4.where a is the side of the triangle.
  //all sides of equilateral triangle are equal.