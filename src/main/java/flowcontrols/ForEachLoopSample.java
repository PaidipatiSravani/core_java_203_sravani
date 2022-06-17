package flowcontrols;

/**
 * using for each loop to print numbers
 * @author sp22082
 *
 */
public class ForEachLoopSample {

	public static void main(String[] args) {
		
		//int array[]=new int[5];     //array without initialization
        int array[]= {1,2,3,4,5};
        
        System.out.println("to print array elements using for loop");
        
        for(int i=0;i<array.length;i++) {
        	System.out.println(array[i]);
        }
        
        System.out.println("to print array elements using foreach loop");
        
        for(int i:array) {
        	//System.out.println(array[i]);     //showing array out of bounds exception.
        	System.out.println(i);
        }
	}

}
