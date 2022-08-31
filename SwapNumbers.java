package BasicPrograms;

import java.util.Scanner;

public class SwapNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	//Scenario1: Swap variable values with out third variable
		int var1 = 10;
		int var2 = 5;
		System.out.println("The numbers before swaping is "+var1 +"," +var2);
				
		var1 = var1 + var2;
		var2 = var1 - var2;
		var1 = var1 - var2;
		System.out.println("The numbers after swaping is "+var1 +"," +var2);
/*====================================================================================*/
		
		//Scenario2 : Java prgram to swap numbers with third variable
		int a = 10;
		int b= 20;
		System.out.println("The numbers before swaping is "+a +"," +b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("The numbers after swaping is " +a +"," +b);
/*====================================================================================*/	
		
		// Scenario 3 :Enter Numbers by the user for swapping using scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of x and y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("The numbers before swaping "+x +"," +y);
		//Swaping
		int t = x;
		x = y;
		y = t;
		System.out.println("The numbers after swaping "+x +"," +y);
		
		
	}

}
