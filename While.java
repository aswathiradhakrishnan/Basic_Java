package BasicPrograms;

import java.util.Scanner;

public class While {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Scenario: while loop
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:i&j");
		int i = sc.nextInt();
		int j = sc.nextInt();
		while(i<=j)
		{
			System.out.println("The value is:"+i);
			i++ ;
		}

	}

}
