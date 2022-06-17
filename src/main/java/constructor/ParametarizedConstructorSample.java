package constructor;

/**
 * to see how the parametarized constructor works.
 * @author sp22082
 *
 */

public class ParametarizedConstructorSample {
	
	public String name;
	public int age;
	public String course;
	
	public ParametarizedConstructorSample(String name, int age, String course) {
	
		this.name = name;
		this.age = age;
		this.course = course;
		System.out.println(name+" "+age+" "+course);
	}

	public static void main(String[] args) {
		
		ParametarizedConstructorSample obj=new ParametarizedConstructorSample("sravani",24,"ece");
		ParametarizedConstructorSample obj1=new ParametarizedConstructorSample("bhavya",24,"ece");
	}

}
