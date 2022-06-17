package corejavapractice;

/**
 * to calculate fahrenheit and celsius usng scaner inputs.
 * calculate fahrenheit and celsius using switch case.
 * 
 * fahrenheit=((celsius*9)/5)+32
 * 
 * celsius=(fahrenheit-32)*5/9
 */

import java.util.Scanner;

public class FahrenheitToCelsiusSample {

	public static void main(String[] args) {
		double fahrenheit,celsius;
		
		Scanner s=new Scanner(System.in);
		/*System.out.println("enter fahrenheit");
		fahrenheit=s.nextDouble();
		System.out.println("enter celsius");
		celsius =s.nextDouble();
		
		                          //convert fahrenheit to celsius  using scanner inputs
		
		celsius=(fahrenheit-32)*5/9;
		System.out.println("celsius:"+celsius);
		
		fahrenheit=((celsius*9)/5)+32;
		System.out.println("fahrenheit"+fahrenheit);
		
		*/
		                         //using switch case to calculate both fahrenheit and celsius
		
		int choice;
		
		choice=s.nextInt();
		System.out.println("enter the choice");
		switch(choice) {
		
		case 1:System.out.println("enter fahrenheit");
		       fahrenheit=s.nextDouble();
		       
		       celsius=(fahrenheit-32)*5/9;
			   System.out.println("celsius:"+celsius);
			   
			   break;
			   
		case 2:	System.out.println("enter celsius");
		        celsius =s.nextDouble();	
		        
		        fahrenheit=((celsius*9)/5)+32;
				System.out.println("fahrenheit"+fahrenheit);
				
				break;
				
		default:System.out.println("enter the valid number");
		}

	}

}
