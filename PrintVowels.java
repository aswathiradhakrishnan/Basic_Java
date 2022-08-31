package BasicPrograms;

import java.util.Scanner;

public class PrintVowels {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Scaenario : Check Vowels using if statements ,inputs from user by using Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet");
		char ch = sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("The entered charecter is Vowel "+ch);
			}
		else {
			System.out.println("The entered chartecter is consonent");
			}
	}

}
