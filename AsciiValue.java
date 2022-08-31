package BasicPrograms;

import java.util.Scanner;

public class AsciiValue {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//scenario : Java program to find ACII Value of a charecter
		char a = 'A';
		int asciivalue1 = a;
		System.out.println("ASCII value of "+a+" is "+asciivalue1);
		
/*========================================================================================================*/
		
		//Find ASCII Value of user input ,using Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charecter");
		char ch = sc.next().charAt(0);
		int asciivalue = ch;
		System.out.println("The asciivalue of "+ch +"\t"+"is"+"\t" +asciivalue );

		
	}

}
