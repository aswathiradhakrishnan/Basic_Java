package BasicPrograms;

import java.util.Scanner;

public class CalculatorusingJavaSwitch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Calculator using java Switch
		
		double number1,number2,answer;
		char operator;
		//Scenario : inputs from user using scanner class
		Scanner sc = new Scanner(System.in);
		// Enter numbers by user
		System.out.println("Enter number1");
		number1 = sc.nextDouble();
		System.out.println("Enter number2");
		number2 = sc.nextDouble();
		//Enter the operator
		System.out.println("Enter the operator: +,-,* or /");
		operator = sc.next().charAt(0);
		
		switch(operator) {
		//addition operation
		case '+':
			answer = number1 + number2;
			System.out.println(number1+"+"+number2+"="+answer);
			break;
		case '-':
			answer = number1 - number2;
			System.out.println(number1+"-"+number2+"="+answer);
			break;
		case '*':
			answer = number1 * number2;
			System.out.println(number1+"*"+number2+"="+answer);
			break;
		case '/':
			answer = number1 / number2;
			System.out.println(number1+"/"+number2+"="+answer);
			break;
		default:
			System.out.println("Invalid input");
		}
		
		
		
	}

}
