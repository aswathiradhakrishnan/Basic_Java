package BasicPrograms;

public class SumNaturalNumbers {

	public static void main(String[] args) {
//Sceanario : Java program to claculate the sum of natural numbers
		 int number = 50;
		 int sum = 0;
		 
		 for(int i = 1;i<=number; i++) {
			sum = sum +i; //sum += i  
		 }
		 
		 System.out.println("The sum of numbers are: "+sum);
	}

}
