package patterns;

/**
 * to print the star in 'M'shape.
 * @author sp22082
 *
 */

public class MPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				if((i>=j) || (i+j>=11)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
