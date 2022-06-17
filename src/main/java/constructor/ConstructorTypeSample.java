package constructor;

/***
 * types of the constructor and how they works.
 * @author sp22082
 *
 */

public class ConstructorTypeSample {
	
	ConstructorTypeSample(){
		System.out.println("default constructor");
	}
	ConstructorTypeSample(String name){
		System.out.println("parametarized consructor");
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		// ConstructorTypeSample();      //it shows error as we cannot call the constructor in this way.
		ConstructorTypeSample obj=new ConstructorTypeSample();    //here it will call default constructor.
		ConstructorTypeSample obj2=new ConstructorTypeSample("sravani");    //here it will call parameterized constructor.

	}

}
 

                                           //CONCLUSION
//1)constructor must have the same name as class name.
//2)in line 23 the name sravani is passed to the object obj2.constructor is used to initialize the object.
//3)if no constructor is created in the program ,then it will implicitly call a default constructor.
//4)if the constructor is created explicitly ,then the default constructor is not invoked in the program implicitly.