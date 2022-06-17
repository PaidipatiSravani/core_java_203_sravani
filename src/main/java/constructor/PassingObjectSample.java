package constructor;

/**
 * passing object as an argument to a constructor. 
 * @author sp22082
 *
 */

public class PassingObjectSample {
	public String name;
	public int RollNo;
	public String Course;
	public int marks;
		
	public PassingObjectSample(String name, int rollNo, String course) {
		this.name = name;
	    this.RollNo = rollNo;
		this.Course = course;
	}
	
	                                             //passing object as an argument to a constructor
	

	public PassingObjectSample(PassingObjectSample Lobj,int marks) {
//		this.name = Lobj.name;
//		this.RollNo = Lobj.RollNo;
//		this.Course = Lobj.Course;
		this.marks = marks;
		 System.out.println(Lobj.name+" "+Lobj.RollNo+" "+Lobj.Course+" "+marks);
	}



	public static void main(String[] args) {
		
		PassingObjectSample obj=new PassingObjectSample("hello",66,"ece");
		PassingObjectSample obj1=new PassingObjectSample(obj,87);
		     
		   //System.out.println(obj.name+" "+obj.RollNo+" "+obj.Course);

	}

}
