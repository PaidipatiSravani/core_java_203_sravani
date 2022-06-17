package constructor;

/**
 * differnce between parametarized constructor and method.
 * how we declare and define them.
 * @author sp22082
 *
 */

public class ConstructorMethodDifference {
	
	public String name;
	public int age;
	public String course;

	public static void main(String[] args) {
		
		method("sravani",24,"ece");           //method calling
		
		ConstructorMethodDifference obj=new ConstructorMethodDifference("sindhu",22,"cse");    //parametarized constructor calling
		
		//obj.method("sravani",24,"ece");
		//obj.method("bhavya",24,"ece");
		
	}
	
	                            //using parametarized constructor
	
    public ConstructorMethodDifference(String name, int age, String course) {
		
		this.name = name;
		this.age = age;
		this.course = course;
		System.out.println(name+" "+age+" "+course);
		
	}
    
                                       //using method
    
	/*public  void method(String name, int age,String course) {
    	this.name=name;
    	this.age=age;
    	this.course=course;
    	System.out.println(name+" "+age+" "+course);
    }*/
    
    public static void method(String name, int age,String course) {
    	System.out.println(name+" "+age+" "+course);
    	
    }
}
