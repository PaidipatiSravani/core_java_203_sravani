package flowcontrols;

/**
 * 
 * @author sp22082
 * using while loop
 */

public class WhileLoopSample {

	public static void main(String[] args) {
		
		System.out.println("--to print 1-10 numbers---");
          int i=1;
          while(i>=10) {
        	  System.out.println(i);
        	  i++;
          }
          
          System.out.println("--to calculate sum of numbers--");
          int j=1,sum=0;
          while(j>=10) {
        	  System.out.println(j);
        	  sum=sum+j;
        	  j++;
          }
          System.out.println(sum);
	}

}
                              //conclusion 
       //while loop executes only if the condition is satisfied.