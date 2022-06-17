package patterns;

/**
 * to print alphabets in a square pattern.
 * @author sp22082
 *
 */

public class AlphabeticalSquarePattern {

	public static void main(String[] args) {
		char k='a';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(k+" ");
				k+=1;				
			}
			System.out.println();
		}

	}

}
