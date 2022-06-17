package flowcontrols;

/**
 * using inner for loop to print a pattern
 * @author sp22082
 *
 */

public class InnerForLoopSample {

	public static void main(String[] args) {
		
         for(int i=1;i<=5;i++) {
        	 for(int j=1;j<=i;j++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
	}

}
