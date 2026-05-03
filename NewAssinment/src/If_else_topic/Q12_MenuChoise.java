package If_else_topic;

import java.util.Scanner;

public class Q12_MenuChoise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.println("\n Enter second number: ");
		int num2 = sc.nextInt();

		System.out.println("\n Input a choise: + , - , * , / ");
		String choise = sc.next();

		switch (choise) {
		case "+": {
			System.out.println("Result: " + (num1 + num2));
			break;
		}
		case "-": {
			System.out.println("Result: " + (num1 - num2));
			break;
		}
		case "*": {
			System.out.println("Result: " + (num1 * num2));
			break;
		}
		case "/": {
			System.out.println("Result: " + (num1 / num2));
			break;
		}
		default:{
			System.err.println("Enter valid numbers..!");
		}

		}
	}

}
