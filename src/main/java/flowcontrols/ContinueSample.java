package flowcontrols;

/**
 * 
 * @author sp22082
 *using continue statement
 */

public class ContinueSample {

	public static void main(String[] args) {
		
              System.out.println("-- for loop without using continue---");
              
              for(int i=1;i<=5;i++) {
            	  System.out.println(i);
              }
              
              System.out.println("--for loop using continue statement---");
              
              for(int i=1;i<=10;i++) {
            	  if(i==7) {
            		  continue;
            	  }
            	  System.out.println(i);
              }
	}

}
                            //conclusion

   //here  continue statement will skip that loop without execution(7 is not printed in the program).