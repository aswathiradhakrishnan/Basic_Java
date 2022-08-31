package BasicPrograms;

import java.util.Scanner;

public class Nestedif {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a ;
		int b ;
		int c ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value a ");
		a = sc.nextInt();
		
		System.out.println("Enter the value b ");
		b = sc.nextInt();
		
		System.out.println("Enter the value c ");
		c = sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println("a is greater than b and c");
			
		}
		else if (b>a && b>c) {
			System.out.println("b is greater than a and c");
			
		}
		else if  (c>a && c>b) {
			System.out.println("c is greater than a and b");
			
		}
	}

}
