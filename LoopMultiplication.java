package BasicPrograms;

import java.util.Scanner;

public class LoopMultiplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Scenario : Looping concept in multiplication of 2
		
		int mul = 0;
		
		for (int i = 1; i<=10; i++){
				mul = i*2;
				System.out.println("the mulplication  "+mul);
		}
		
		
		// Scenario : Generic program for multiplication table
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		for (int i = 1; i<=10; i++ ) {
			int mult = num*i;
			System.out.println("The multiplication of "+num +"&"+i +"\t" +"is "+mult );
		}
	}

}
