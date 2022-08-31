package BasicPrograms;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
	System.out.println("Hello world");
	
	//Syntax for creating an object : Classname object = new Classname();
	@SuppressWarnings("resource")
	
	//The Scanner class is used to get user input and it is found in java.util package
	Scanner sc = new Scanner(System.in);
	
	//Inputs from User
	System.out.println("Enter Your Name");
	String name = sc.next();
	System.out.println("Enter Your Age");
	int age = sc.nextInt();
	System.out.println("Enter cell Number");
	long cellno = sc.nextLong();
	System.out.println("Name is" +"\t" +name +"\n"+ "Age is" +"\t" +age +"\n"+ "Cellno is" +"\t" +cellno);
	
	}

}

