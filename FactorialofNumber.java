package BasicPrograms;

public class FactorialofNumber {

	public static void main(String[] args) {
		//Sceanario : Java program to find the factorial of a number.
		 int number = 3;
		 int fact = 1;
		 
		 for(int i = 1;i<=number; i++) {
			fact = fact * i;    //sum *= i  
		 }
		 
		 System.out.println("The factorial of "+number +" is " +fact);

	}

}
