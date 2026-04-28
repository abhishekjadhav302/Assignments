package If_else_topic;

import java.util.Scanner;

public class Q2_CharacterClassifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any single character: ");

		String str1 = sc.next();
		sc.close();
		String ch = str1.substring(0);

		// Check is this uppercase or not
		boolean boo1 = ch.matches("[A-Z]{1}");

		// check is this lowercase or not
		boolean boo2 = ch.matches("[a-z]{1}");
		
		// check is this digit or not
		boolean boo3 = ch.matches("[0-9]{1}");
		
		// check is this special character
		boolean boo4 = ch.matches("[@#$%&*!]{1}");

		if (boo1 == true) {
			System.out.println("This is Uppercase: " + ch);
		} else if (boo2 == true) {
			System.out.println("This is Lowercase: " + ch);
		} else if (boo3 == true) {
			System.out.println("This is digit: " + ch);
		} else if(boo4 == true) {
			System.out.println("This is Special Character: " + ch);
		} else {
			System.out.println("You have entered two or more characters!");
		}
	}

}
