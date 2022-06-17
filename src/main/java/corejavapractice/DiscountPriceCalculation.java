package corejavapractice;

/**
 * how to calculate discount using scanner inputs.
 * how to calculate discount using methods.
 */

import java.util.Scanner;

public class DiscountPriceCalculation {

	public static void main(String[] args) {
		double marketprice,amount,A,discountrate;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the market price:");
		marketprice=s.nextDouble();
		System.out.println("enter the discount rate:");
		discountrate=s.nextInt();
		
		/*A=marketprice*(discountrate/100);
		amount=marketprice-A;                                      //using normal inputs and scanner class
		System.out.println("amount after discount:"+amount);*/
		 
		
		                            //using methods
		
		 amount=amount(marketprice,discountrate);
		 System.out.println("amount after dicount:"+amount);

	}
	
	public static double amount(double marketprice,double discountrate) {
		
		double A=marketprice*(discountrate/100);
		double amount=marketprice-A;
		return amount;
	}

}
