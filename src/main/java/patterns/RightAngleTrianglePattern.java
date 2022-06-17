package patterns;

/**
 * to print numbers and alphabets in a triangle pattern.
 * @author sp22082
 *
 */

public class RightAngleTrianglePattern {

	public static void main(String[] args) {
		System.out.println("---------------------------");
		
		                     // to print alphabets in triangle pattern
		char k='a';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k+=1;
			}
			System.out.println();
		}

		                     //to print numbers in triangle pattern continuously.
		
		System.out.println("--------------------------");		                     
		int n=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
		
		
		                 //to print numbers as 1  12   123  1234 12345
		
		System.out.println("--------------------------");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		                 //to print numbers as 5  54  543   5432   54321
		
		System.out.println("------------------------");
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		               //to print numbers as 5 44 333 2222 11111
		
		System.out.println("-----------------------");
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		                  //to print numbers as 5 45 345 2345 12345
		
		System.out.println("------------------------");
		for(int i=5;i>=1;i--) {
			for(int j=i;j<=5;j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		
		                //to print numbers as 1  11   121   1331    1461
		System.out.println("------------------");
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
