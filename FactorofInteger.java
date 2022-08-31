package BasicPrograms;

public class FactorofInteger {

	public static void main(String[] args) {
		// Display factor of a number
		int number = 10;
		System.out.println("The factor of "+number+" are:");
		// loops runs from 1 to 10
		for (int i=1; i<=number; i++)
		{
			// If the number is divided by i then i is a factor
			if (number % i ==0) {
				System.out.println(i+" ");
			}
		}
	}
}
