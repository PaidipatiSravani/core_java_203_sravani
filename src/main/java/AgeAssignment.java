import java.util.Calendar;
import java.util.Scanner;

public class AgeAssignment {

	public static void main(String[] args) {
			
		Scanner s=new Scanner(System.in);
		System.out.println("enter the month");
		int birthMonth=s.nextInt();
		System.out.println("enter the year");
		int birthYear=s.nextInt();
       double age=calculateAge(birthMonth,birthYear);
       System.out.printf("your age is:%.2f",age);             //to print fractional part only upto 2 decimals
      
		
	}
	
	public static double calculateAge(int birthMonth,int birthYear) {
			
		double age;
		Calendar cal = Calendar.getInstance();
		double year=cal.get(Calendar.YEAR);
		double month=cal.get(Calendar.MONTH);
		if((birthMonth<=0)||(birthYear<=0)) { return -1;}
		else if((birthYear>year)) {return -2;}
		else
			 age= ((year-(double)birthYear)+((month-(double)birthMonth)/12));
		return age;
			
	}

}
