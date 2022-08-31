package BasicPrograms;

import java.util.Scanner;

public class Add2Integer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
//Scenario: Java program to add two integer
		int a = 100;
		int b = 300;
		int sum = a+b;
		System.out.println("The Sum of a and b is "+sum);
		
/*================================================================================================*/
		
//scenario :Add two integer ,user inputs using Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter inputs x & y ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int add = x+y;
		System.out.println(+x+"+"+y+"="+add);
		String s="200";
		Integer i=Integer.valueOf(s);  
		System.out.println(i);  
	}

}

