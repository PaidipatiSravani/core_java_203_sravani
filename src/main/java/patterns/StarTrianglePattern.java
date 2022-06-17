package patterns;

/**
 * to print star pattern
 * 
 * @author sp22082
 *
 */

public class StarTrianglePattern {

	public static void main(String[] args) {

		                                // star pattern
		
		  for (int i = 1; i <= 5; i++) {
		  
		  for (int j = 4; j >= i; j--) 
		  { System.out.print(" ");
		  } 
		  for (int k = 1; k <= i; k++)
		  { 
			  System.out.print("*"+" ");
		  
		  } 
		  System.out.println(); }
		 

		System.out.println("----------------------");
		int space = 3;
		int star = 1;
		for (int i = 1; i <= 4; i++) {
			for (int k = 1; k <= space; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
                   System.out.print("*");
			}
			space-=1;
			star+=2;
			System.out.println();

		}
		
	}
}
