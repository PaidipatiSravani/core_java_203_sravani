package corejavapractice;

/**
 * calculate area of circle using interface.
 * @author sp22082
 *
 */

interface Sample{
	
	void area();
}

public class InterfaceSample implements Sample{

	public static void main(String[] args) {
		
		InterfaceSample obj=new InterfaceSample();
			obj.area();
		}
	public void area() 
	{
		int radius=5;
		double areaOfCircle=(22*radius*radius)/7;
		System.out.println(areaOfCircle);

	}	
	
}
 class Sample2 implements Sample {

	@Override
	public void area() {
		int radius=6;
		double areaOfCircle=(22*radius*radius)/7;
		System.out.println("area in another class:"+areaOfCircle);
		
	}
	 
	 
 }