package flowcontrols;

/**
 * 
 * @author sp22082
 *using for loop 
 */

public class ForLoopSample {

	public static void main(String[] args) {
		   //using post increment
		
		System.out.println("---post increment---");
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		                //using pre increment
		
		System.out.println("---pre increment---");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}

		               //using pre decrement
		System.out.println("---pre decrement---");
		
		for(int i=10;i>=1;--i) {
			System.out.println(i);
		}
		
		              //using post decrement
		System.out.println("---post decrement---");
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
	}

}