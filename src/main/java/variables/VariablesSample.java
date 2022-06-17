package variables;

/**
 * local variable,instance variable and static variable.
 * @author sp22082
 *
 */


public class VariablesSample {

	int in=10;
	static int sta=30;
	public static void main(String[] args) {
		
		VariablesSample obj=new VariablesSample();
		System.out.println("instance variable:"+obj.in);
		System.out.println("static variable:"+sta);
	}
	public int method(int loc) {
		
		System.out.println("local variable:"+loc);
		return loc;
	}

}



/*       CONCLUSION
 * 
 *  INSTANCE VARIABLE means variable which needs to be accessed using object
 *  
 *  LOCAL VARIABLE means variable which is declared within the method(the scope of that variable is within the method only).
 *  
 *  STATIC VARIABLE means variable which can be accessed without using object and we cannot modify the value.
 *    
 *    */
