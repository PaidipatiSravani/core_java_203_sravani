package corejavapractice;

/**
 * calculate hcf using command line arguments.
 * @author sp22082
 *
 */

public class HcfUsingCommandLineArgs {

	public static void main(String[] args) {
		
		int firstNumber=Integer.parseInt(args[0]);
		int secondNumber=Integer.parseInt(args[1]);
		
		int temp;
		while(secondNumber>0) {
			
			temp=secondNumber;
			secondNumber=firstNumber%secondNumber;
			firstNumber=temp;
			
		}
		System.out.println("hcf:"+firstNumber);

	}

}
