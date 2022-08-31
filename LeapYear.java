package BasicPrograms;

import java.util.Scanner;

public class LeapYear {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
//Scenario : java program to check leap year
		
		System.out.println("Enter an Year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		 
		if (((year % 4 == 0) && (year % 100 != 100)) || (year % 400 == 0))
		{
			System.out.println("Entered year is a leap year");		
		}
		
		else
		{
			System.out.println("Entered year is not a leap year");
		}
			
		

	}

}
