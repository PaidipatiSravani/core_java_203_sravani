package corejavapractice;

/**
 * check whether the given character is vowel or consonent
 */

import java.util.Scanner;

public class VowelOrConsonantSample {

	public static void main(String[] args) {
		char ch;
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println(ch+"is a vowel");
		}
		else
			System.out.println(ch+"is a consonant");

	}

}
