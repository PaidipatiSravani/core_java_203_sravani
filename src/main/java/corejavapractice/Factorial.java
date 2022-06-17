package corejavapractice;

/**
 * how to calculate factorial of a number using command line arguments..
 * how to calculate factorial of a number using method.
 * @author sp22082
 *
 */

public class Factorial {

	public static void main(String args[]) {
		long n;
		 //n=Long.parseLong(args[0]);        //it shows exception if you run in java appilcation
		n=Long.parseLong("10");
		 int result=fact(n);
		 System.out.println(result);
		
	}
	static int fact(long n) {
		
		int fact=1,i;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

}


                                              //CONCLUSION
//if you use args[0],args[1]....you have to use arguments (right click->run as->run configurations->select the program in search->click arguments->enter the arguments->run)