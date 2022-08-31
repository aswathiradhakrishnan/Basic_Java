package BasicPrograms;

import java.util.Scanner;

public class SwitchStatements {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Scanario : Switch statements for checking the days with user input using Scanner Class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Day as numbers");
		int day = sc.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		
		default:
			System.out.println("Invalid input");
		}

	}

}
