package corejavapractice;

/**
 * calculate permutation   npr=n!/(n-r)!
 * 
 * calculate combination ncr=n!/((n-r)!*r!)
 * 
 */

import java.util.Scanner;

public class NcrAndNprSample {

	public static void main(String[] args) {
		
		NcrAndNprSample obj=new NcrAndNprSample();
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter n:");
		int n=s.nextInt();
		System.out.println("enter r");
		int r=s.nextInt();
		obj.combination(n, r);
		obj.permutation(n, r);
  
		                                     //using methods
		
	}
	public double fact(double n) {
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public void permutation(int n,int r) {
		System.out.println("permutation:"+(fact(n)/fact(n-r)));
	}
	
	public void combination(int n,int r) {
		System.out.println("combination"+fact(n)/(fact(n-r)*fact(r)));
	}

}
