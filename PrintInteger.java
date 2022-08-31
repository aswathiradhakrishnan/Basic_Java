package BasicPrograms;

import java.util.Scanner;

public class PrintInteger {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Scenario : Java program to print an integer(Enter by the user)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = sc.nextInt();
		System.out.println("The entered intger is"+"\t" +num );

	}

}
