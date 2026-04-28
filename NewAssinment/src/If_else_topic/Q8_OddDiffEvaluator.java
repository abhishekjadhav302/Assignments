package If_else_topic;

import java.util.Scanner;

public class Q8_OddDiffEvaluator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first integers: ");
		int num1 = sc.nextInt();

		System.out.println("Enter secound integers: ");
		int num2 = sc.nextInt();
		sc.close();

		if (num1 % 2 == 0 || num2 % 2 == 0) {
			System.err.println("Invalid");
		} else {
			System.out.println("absolute difference");
		}
	}

}
