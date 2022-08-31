package BasicPrograms;

import java.util.Scanner;

public class NumberEvenorOdd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
//Scenario : Java program to check whether number is even or odd,user input using scanner class
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("The entered number is even");
		}
		else {
			System.out.println("The entered number is odd");
		}
	}
}
