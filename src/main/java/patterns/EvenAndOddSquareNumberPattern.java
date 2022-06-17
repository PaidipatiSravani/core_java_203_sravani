package patterns;

/**
 * to print even and odd numbers in the square pattern
 * @author sp22082
 *
 */

public class EvenAndOddSquareNumberPattern {

	public static void main(String[] args) {
		
		  /*                       //to print even numbers
		int k=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {	
				k+=2;
				System.out.print(k+" ");
				}
				System.out.println();
			}
		*/
		
	
	                         //to print odd numbers
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {	
				System.out.print(k+" ");
				k+=2;	
				}
				System.out.println();
			}
	
	}
	}


