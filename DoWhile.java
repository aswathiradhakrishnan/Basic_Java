package BasicPrograms;

import java.util.Scanner;

public class DoWhile {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		//Scenario : do while loop 
		int j;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values: i&j");
		i = sc.nextInt();
		j = sc.nextInt();
		do
		{
			System.out.println("The value is:"+i);
			i++;
		}
		while(i<=j);
	}

}
