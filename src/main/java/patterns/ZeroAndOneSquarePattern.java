package patterns;

/**
 * to print zero and one alternatively in a square pattern.
 * @author sp22082
 *
 */

public class ZeroAndOneSquarePattern {

	public static void main(String[] args) {
		
		           // to start the alternative pattern with 0
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if((i==j)||(i+j==6)||((i*j)%2!=0)) {
					System.out.print("0"+" ");
				}
				else {
				
				System.out.print("1"+" ");}
			}
			System.out.println();
		}
		
		           //to start alternative pattern with 1
		System.out.println("-----------------------------");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if((i==j)||(i+j==6)||((i*j)%2!=0)) {
					System.out.print("1"+" ");
				}
				else {
				
				System.out.print("0"+" ");}
			}
			System.out.println();
		}
		
		
		System.out.println("----------------------------");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i*j%2==0) {
					System.out.print("0"+" ");
					
				}
				else
					System.out.print("1"+" ");
			}
			System.out.println();
		}

	}

}
