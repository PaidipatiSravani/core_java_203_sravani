package patterns;

/**
 * to print the numbers in square shape and same number in the row.
 * @author sp22082
 *
 */

public class SquareNumberPattern {

	public static void main(String[] args) {
		
		                             //to print numbers from 1 to 5
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		
		                           //to print number from 5 to 1
		System.out.println("----------------------");
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
