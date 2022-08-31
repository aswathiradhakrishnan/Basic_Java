package BasicPrograms;

public class CheckAlphabet {

	public static void main(String[] args) {
// Scenario : Java program to check entered character is alphabet or not
		
		char ch = 'a';
//Check is a is alphabet using is Alphabet() method
		if (Character.isAlphabetic(ch)) {
			System.out.println(ch+ " is an alphabet.");
		}
		else {
			System.out.println(ch+ " is not an alphabet");
		}

	}

}
