package constructor;

/**
 * usage of this and super keyword to call the constructor.
 * @author sp22082
 *
 */
                               //parent class
class Parent{
	
	public Parent(){
		this("Hello");
		System.out.println("default parent consructor");
	}
	
	public Parent(String name){
		System.out.println("parent parametarized constructor:"+name);
	}
	
}

                              //child class

public class ThisAndSuperSample extends Parent{

	public ThisAndSuperSample() {
		 this("hello");
		System.out.println("child default constructor");
		
	}
	 
	public ThisAndSuperSample(String name){
		 super();
		 System.out.println("child parametarized constructor:"+name);
	 }

	public static void main(String[] args) {
		ThisAndSuperSample obj=new ThisAndSuperSample();
		
	}

}
