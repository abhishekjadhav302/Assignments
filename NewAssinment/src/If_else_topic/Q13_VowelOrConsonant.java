package If_else_topic;

import java.util.Scanner;

public class Q13_VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

		boolean check = false;

		System.out.println("Enter single character: ");
		while (!check) {

			char character = sc.next().toLowerCase().charAt(0);

			int i = 0;
			while (i < vowels.length) {
				if (character == vowels[i]) {
					check = true;
					break;
				}
				i++;
			}
			if (check) {
				System.out.println("This " + character + " is an vowel..!");
			} else {
				System.err.println("This " + character + " is not an vowel..!");
				System.out.println("Enter single character: ");
			}
		}

		sc.close();

	}

}
