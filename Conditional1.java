package BasicPrograms;

import java.util.Scanner;

public class Conditional1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a ;
		int b ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("The value of a is");
		a = sc.nextInt();
		System.out.println("The value of b is");
		b = sc.nextInt();
		if (b>a)
		{
		 System.out.println("b is greater than a");
		}
		else
		{
		 System.out.println("b is not greater than a");
		
		}
	}

}
